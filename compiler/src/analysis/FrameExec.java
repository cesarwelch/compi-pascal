package analysis;

/**
 *
 * @author cwelch
 */

import abstree.AbsTree;
import abstree.AbsProgram;
import java.io.*;


public class FrameExec {

	/** declaracion del abs tree */
	public static AbsTree absTree = null;

	/**
	 * Executa la traduccion hasta el semantico
	 */
	public static void exec() {

		/* Lectura del codigo fuente */
		FileReader srcFile = null;
		String srcName = compiler.Main.prgName + ".pascal";
		try {
			srcFile = new FileReader(srcName);
		} catch (FileNotFoundException _) {
			Report.error("Source file '" + srcName + "' cannot be opened.", 1);
		}

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

		/* Cierre el archivo de entrada */
		try {
			srcFile.close();
		} catch (IOException _) {
			Report.error("Source file '" + srcName + "' cannot be closed.", 1);
		}
		if (nameResolver.error || typeChecker.error) {
			Report.error("Too many errors during semantic analysis.", 1);
		}

		/* Calcular los registros de llamada */
		PrintStream xml = XML.open("frames");
		program.accept(new FrmEvaluator());
		program.accept(new FrmPrintXML(xml));
		XML.close("frames", xml);
	}
}
