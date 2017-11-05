package abstree;

/**
 *
 * @author jorgecaballero
 */

import analysis.PascalSyn;
import analysis.XML;
import analysis.Report;
import analysis.PascalLex;
import abstree.AbsTree;
import abstree.AbsProgram;
import java.io.*;


public class Main {

	/** AST Main Declaration */
	public static AbsTree absTree = null;

	/**
	 * Traduccion hasta la construccion del arbol
	 */
	public static void exec() {
		/* Se abre el archivo de salida */
		FileReader srcFile = null;
		String srcName = compiler.Main.prgName + ".pascal";
		try {
			srcFile = new FileReader(srcName);
		} catch (FileNotFoundException _) {
			Report.error("Source file '" + srcName + "' cannot be opened.", 1);
		}
		PrintStream xml = XML.open("abstree");

		PascalLex lexer = new PascalLex(srcFile);
		PascalSyn parser = new PascalSyn(lexer);
		AbsProgram program = null;
		try {
			program = (AbsProgram) (parser.parse().value);
		} catch (Exception ex) {
			Report.error(
					"Error while testing the construction of the abstract syntax tree.",
					1);
		}
		program.accept(new AbsPrintXML(xml));

		/* Cierra los archivos */
		XML.close("abstree", xml);
		try {
			srcFile.close();
		} catch (IOException _) {
			Report.error("Source file '" + srcName + "' cannot be opened.", 1);
		}
	}
}
