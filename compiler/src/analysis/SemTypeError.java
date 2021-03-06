package analysis;

/**
 *
 * @author cwelch
 */

import java.io.*;

/** Declaration of Semantic Type error */
public class SemTypeError extends SemType {

	@Override
	public void toXML(PrintStream xml) {
		xml.print("<semtypeerror/>\n");
	}

	@Override
	public boolean coercesTo(SemType type) {
		return false;
	}

	@Override
	public int size() {
		return -1;
	}

}
