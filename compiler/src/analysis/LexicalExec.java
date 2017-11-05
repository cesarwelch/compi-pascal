package analysis;

/**
 *
 * @author cwelch
 */

import java.io.*;
import java.lang.reflect.*;


public class LexicalExec {

	public static String[] pascalTermNames;

	static {
		/* Tokenizer de tipos finales  */
		PascalTok pascalTok = new PascalTok();
		Field[] pascalToks = pascalTok.getClass().getDeclaredFields();
		pascalTermNames = new String[pascalToks.length];
		for (int f = 0; f < pascalToks.length; f++) {
			try {
				int tok = pascalToks[f].getInt(pascalTok);
				String lex = pascalToks[f].toString().replaceAll("^.*\\.", "");
				pascalTermNames[tok] = lex;
			}
			catch (IllegalAccessException _) {}
		}
	}

	/** Realiza analisis Lexico */
	public static void exec() {
		/* Abre el archivo de entrada  */
		FileReader srcFile = null;
		String srcName = compiler.Main.prgName + ".pascal";
                //String srcName = "./compiler/src/compiler/lexanal";
		try { srcFile = new FileReader(srcName); }
		catch (FileNotFoundException _) { Report.error("Source file '" + srcName + "' cannot be opened.", 1); }
		PrintStream xml = XML.open("lexanal");

		/* Comienza el Analisis Lexico  */
        PascalLex lexer = new PascalLex(srcFile);
        PascalSym symbol;
        try {
            while ((symbol = lexer.next_token ()).sym != PascalTok.EOF) {
            	symbol.toXML(xml);
            }
        }
        catch (IOException _) {
            Report.error("Error while testing lexical analyzer.", 1);
        }

        /* 	Cierra los archivos  */
        XML.close("lexanal", xml);
        try { srcFile.close(); }
		catch (IOException _) { Report.error("Source file '" + srcName + "' cannot be opened.", 1); }
	}

}
