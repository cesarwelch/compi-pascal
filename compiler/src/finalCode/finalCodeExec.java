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


public class finalCodeExec {

	/** La secuencia de código.  */
	public static LinkedList<ImcBlock> chunks;

	/**
	 *  se empieza la traduccion hasta la fase de analisis semantico
	 */
	public static void exec() {
		/* se abre el archivo de entrada */
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

		/* se cierra el archivo de entrada */
		try {
			srcFile.close();
		} catch (IOException _) {
			Report.error("Source file '" + srcName + "' cannot be closed.", 1);
		}
		if (nameResolver.error || typeChecker.error) {
			Report.error("Too many errors during semantic analysis.", 1);
		}

		/* calcula el registro de llamados. */
		program.accept(new FrmEvaluator());

		/* Izracunamo kose programa. */
		PrintStream xml = XML.open("lincode");
		IMCodeGenerator code = new IMCodeGenerator();
		program.accept(code);
		chunks = code.chunks;
		for (ImcBlock chunk : chunks) {
			if (chunk instanceof ImcCodeBlock) {
				ImcCodeBlock codeChunk = (ImcCodeBlock) chunk;
				codeChunk.lincode = codeChunk.imcode.linear();
			}
		}
		for (ImcBlock chunk : chunks) {
			chunk.toXML(xml);
		}
		XML.close("lincode", xml);

		new Interpreter(chunks);
	}
}
