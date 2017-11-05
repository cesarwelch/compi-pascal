package finalCode;

import analysis.PascalSyn;
import analysis.SemTypeChecker;
import analysis.SemNameResolver;
import analysis.XML;
import analysis.Report;
import analysis.PascalLex;
import analysis.FrmEvaluator;
import abstree.AbsProgram;
import java.io.*;
import java.util.*;


public class intermediateCodeExec {

	/** Declaracion de secuencia de codigo */
	public static LinkedList<ImcBlock> chunks;


	/**
	 * Realiza la traduccion hasta analisis Semantico
	 */
	public static void exec() {
		/* Abre el archivo de entrada*/
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
			System.out.println(ex.toString());
		}
		SemNameResolver nameResolver = new SemNameResolver();
		SemTypeChecker typeChecker = new SemTypeChecker();
		program.accept(nameResolver);
		program.accept(typeChecker);

		/* Cierra el archivo de entrada*/
		try {
			srcFile.close();
		} catch (IOException _) {
			Report.error("Source file '" + srcName + "' cannot be closed.", 1);
		}
		if (nameResolver.error || typeChecker.error) {
			Report.error("Too many errors during semantic analysis.", 1);
		}

		/* Calcular registros de llamadas. */
		program.accept(new FrmEvaluator());

		/* Calcular la longitud del programa. */
		IMCodeGenerator code = new IMCodeGenerator();
		program.accept(code);
		chunks = code.chunks;

		PrintStream xml = XML.open("imcode");
		System.out.println(".data");
		for (ImcBlock chunk : chunks) {
			chunk.toXML(xml);
                        System.err.println(chunk.toString());
		}
		XML.close("imcode", xml);

	}
}
