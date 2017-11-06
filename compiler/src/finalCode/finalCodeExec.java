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
import org.jdom.Element;
import org.jdom.Document;
import org.jdom.input.SAXBuilder;


public class finalCodeExec {

	/** La secuencia de código.  */
	public static LinkedList<ImcBlock> chunks;

	/**
	 *  se empieza la traduccion hasta la fase de analisis semantico
	 */
	public static void exec() {
		/* se abre el archivo de entrada */
		SAXBuilder builder = new SAXBuilder();
		String xml_path = "imcode.xml";
		Document xml_doc = builder.build(xml_path); //builder.build construye un arbol
		Element root = xml_doc.getRootElement();
	}
}
