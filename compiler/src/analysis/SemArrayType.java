package analysis;

/**
 *
 * @author cwelch
 */

import java.io.*;

/** Declaracion de Arreglos */
public class SemArrayType extends SemType {

	/** tipo del elemento */
	public SemType type;

	/** lower bound */
	public int loBound;

	/** Higher bound */
	public int hiBound;

	public SemArrayType(SemType type, int loBound, int hiBound) {
		this.type = type;
		this.loBound = loBound;
		this.hiBound = hiBound;
	}

	@Override
	public void toXML(PrintStream xml) {
		xml.print("<semtype kind=\"ARRAY\" value=\"(" + loBound + "," + hiBound + ")\">\n");
		type.toXML(xml);
		xml.print("</semtype>\n");
	}

	@Override
	public boolean coercesTo(SemType type) {
		if (type instanceof SemArrayType) {
			SemArrayType arrayType = (SemArrayType)type;
			return (arrayType.loBound == loBound) && (arrayType.hiBound == hiBound) && (arrayType.type.coercesTo(this.type));
		} else
			return false;
	}

	@Override
	public int size() {
		return (hiBound - loBound + 1) * type.size();
	}

}
