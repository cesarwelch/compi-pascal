package analysis;

/**
 *
 * @author cwelch
 */

import analysis.XML;
import analysis.Report;
import analysis.PascalLex;
import abstree.AbsTree;
import abstree.AbsProgram;
import java.io.*;


public class SemanticExec {

	/** Declaracion de AbsTree */
	public static AbsTree absTree = null;

	/**
	 * Genera analisis semantico
	 */
	public static void exec() {
		/* Abre el archivo de entrada */
		FileReader srcFile = null;
		String srcName = compiler.Main.prgName + ".pascal";
		try {
			srcFile = new FileReader(srcName);
		} catch (FileNotFoundException _) {
			Report.error("Source file '" + srcName + "' cannot be opened.", 1);
		}
		PrintStream xml = XML.open("semanal");

		PascalLex lexer = new PascalLex(srcFile);
		PascalSyn parser = new PascalSyn(lexer);
		AbsProgram program = null;
		try {
			program = (AbsProgram) (parser.parse().value);
		} catch (Exception ex) {
			Report.error("Uncaught syntax error.", 1);
		}
		SemNameResolver nameResolver = new SemNameResolver();
		SemTypeChecker typeChecker = new SemTypeChecker();
		program.accept(nameResolver);
		program.accept(typeChecker);
		program.accept(new SemPrintXML(xml));

		/* Cierra los archivos */
		XML.close("semanal", xml);
		try {
			srcFile.close();
		} catch (IOException _) {
			Report.error("Source file '" + srcName + "' cannot be closed.", 1);
		}

		if (nameResolver.error || typeChecker.error) {
			Report.error("Too many errors.", 1);
		}
	}
}
