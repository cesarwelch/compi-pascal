package finalCode;

/**
 *
 * @author cwelch
 */
import analysis.PascalSyn;
import analysis.SemTypeChecker;
import analysis.SemNameResolver;
import analysis.XML;
import analysis.Report;
import analysis.PascalLex;
import analysis.FrmEvaluator;
import finalCode.IMCodeGenerator;
import finalCode.ImcBlock;
import finalCode.ImcCodeBlock;
import abstree.AbsProgram;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom.Element;
import org.jdom.Document;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

public class finalCodeExec {

    /**
     * La secuencia de código.
     */
    public static LinkedList<ImcBlock> chunks;

    /**
     * se empieza la traduccion hasta la fase de analisis semantico
     */
    public static void exec() {
        /* se abre el archivo de entrada */
        SAXBuilder builder = new SAXBuilder();
        String xml_path = "imcode.xml";
        Document xml_doc = null;
        try {
            xml_doc = builder.build(xml_path); //builder.build construye un arbol
        } catch (JDOMException ex) {
            Logger.getLogger(finalCodeExec.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(finalCodeExec.class.getName()).log(Level.SEVERE, null, ex);
        }
        Element root = xml_doc.getRootElement();
        List list = root.getChildren("datachunk");

        for (int i = 0; i < list.size(); i++) {
            Element node = (Element) list.get(i);
            String suffix = "";
            switch (node.getAttribute("size").getValue()) {
                case "4":
                    suffix = ".word 0";
                break;
                default: 
                    suffix = ".space 20";
                break;
            }
            
             System.out.println(node.getAttribute("label").getValue() + " : " + suffix);

        }

//        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
//                new FileOutputStream("finalCode.asm"), "utf-8"))) {
//            writer.write(".data");
//            newLine(writer);
//            writer.write("test");
//        } catch (IOException ex) {
//            Logger.getLogger(finalCodeExec.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    public static void newLine(Writer writer) throws IOException {
        writer.write("\n");
    }
}
