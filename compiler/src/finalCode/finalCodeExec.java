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


public class finalCodeExec {

	/** La secuencia de código.  */
	public static LinkedList<ImcBlock> chunks;

	/**
	 *  se empieza la traduccion hasta la fase de analisis semantico
	 */
	public static void exec() {
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
        	new FileOutputStream("finalCode.asm"), "utf-8"))) {
   			writer.write(".data");
                        newLine(writer);
                        writer.write("test");
		} catch (IOException ex) {
                Logger.getLogger(finalCodeExec.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
        
        public static void newLine(Writer writer) throws IOException{
            writer.write("\n");
        }
}
