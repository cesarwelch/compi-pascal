package analysis;

/**
 *
 * @author cwelch
 */

import analysis.XML;
import analysis.Report;
import analysis.PascalLex;
import java.io.*;
import java.lang.reflect.*;


public class SyntacticExec {

	public static String[] pascalNontNames;

	static {
		/* prepara los tokens para codigo intermedio  */
		PascalTok pascalTok = new PascalTok();
		Field[] pascalToks = pascalTok.getClass().getDeclaredFields();
		pascalNontNames = new String[pascalToks.length];
		for (int f = 0; f < pascalToks.length; f++) {
			try {
				int tok = pascalToks[f].getInt(pascalTok);
				String lex = pascalToks[f].toString().replaceAll("^.*\\.", "");
				if (! ((tok < analysis.LexicalExec.pascalTermNames.length) &&
					   (lex.equals(analysis.LexicalExec.pascalTermNames[tok])))) {
					pascalNontNames[tok] = lex;
				}
			}
			catch (IllegalAccessException _) {}
		}
	}

	/** Realiza la traduccion de Analisis sintantico */
	public static void exec() {
		/* Abre el archivo de entrada */
		FileReader srcFile = null;
		String srcName = compiler.Main.prgName + ".pascal";
		try { srcFile = new FileReader(srcName); }
		catch (FileNotFoundException _) { Report.error("Source file '" + srcName + "' cannot be opened.", 1); }
		PrintStream xml = XML.open("synanal");

		PascalLex lexer = new PascalLex(srcFile);

		/* Cierra el archivo de entrada */
        XML.close("synanal", xml);
        try { srcFile.close(); }
		catch (IOException _) { Report.error("Source file '" + srcName + "' cannot be opened.", 1); }
	}
}
