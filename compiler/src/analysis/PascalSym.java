package analysis;

/**
 *
 * @author cwelch
 */

import java.io.*;

import java_cup.runtime.*;



public class PascalSym extends Symbol implements XMLable {


	public PascalSym(int sym) {
		this(sym, -1, -1, "");
	}


	public PascalSym(Symbol symb) {
		this(symb.sym, symb.left, symb.right, symb.value);
	}


	public PascalSym(int sym, int left, int right, Object value) {
		super(sym, left, right, value);
	}

	public void toXML(PrintStream xml) {
		switch (sym) {
		case PascalTok.BOOL_CONST:
		case PascalTok.CHAR_CONST:
		case PascalTok.INT_CONST:
		case PascalTok.IDENTIFIER:
			xml.print("<terminal token=\"" + LexicalExec.pascalTermNames[sym]
					+ "\" lexeme=\"" + toXML((String) value) + "\" line=\""
					+ left + "\" column=\"" + right + "\"" + "/>\n");
			break;
		default:
			xml.print("<terminal token=\"" + LexicalExec.pascalTermNames[sym]
					+ "\" line=\"" + left + "\" column=\"" + right + "\""
					+ "/>\n");
			break;
		}
	}

	private String toXML(String lexeme) {
		StringBuffer lex = new StringBuffer();
		for (int i = 0; i < lexeme.length(); i++)
			switch (lexeme.charAt(i)) {
			case '\'':
				lex.append("&#39;");
				break;
			case '\"':
				lex.append("&#34;");
				break;
			case '&':
				lex.append("&#38;");
				break;
			case '<':
				lex.append("&#60;");
				break;
			case '>':
				lex.append("&#62;");
				break;
			default:
				lex.append(lexeme.charAt(i));
				break;
			}
		return lex.toString();
	}
}
