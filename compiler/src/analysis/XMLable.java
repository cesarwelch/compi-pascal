package analysis;

/**
 *
 * @author cwelch
 */

import java.io.*;

public interface XMLable {

	/**
	 * Imprime todo el stream
	 *
	 * @param xml
	 */
	public void toXML(PrintStream xml);
	public String toString();
}
