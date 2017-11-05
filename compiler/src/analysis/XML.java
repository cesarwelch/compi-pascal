package analysis;

/**
 *
 * @author cwelch
 */

import java.io.*;

public class XML {

	/**
	 *abre un archivo donde muestra los resultados de cada etapa de la traduccion
	 *en formato XML
	 */
	public static PrintStream open(String phase) {
		PrintStream stream = null;
		try {
			stream = new PrintStream(phase + ".xml");
			stream.println("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\n<?xml-stylesheet type='text/xsl' href='xsl/"+phase+".xsl'?>");
			try {
				String xslDir = System.getenv("PASCALXSL");
				if (xslDir != null) {
					stream.println("<?xml-stylesheet type=\"text/xsl\" href=\""
							+ xslDir + "/" + phase + ".xsl\"?>");
				}
			} catch (Exception _) {
			}
			stream.println("<" + phase + ">");
		} catch (IOException _) {
			Report.error("Cannot open XML file '" + phase + ".xml'.", 1);
		}
		return stream;
	}

	/**
	 *Cierra el archivo XML
	 *
	 * @param phase
	 *            Ime faze prevajanja.
	 * @param stream
	 *            Odprta izhodna datoteka.
	 */
	public static void close(String phase, PrintStream stream) {
		stream.println("</" + phase + ">");
		stream.close();
	}
}
