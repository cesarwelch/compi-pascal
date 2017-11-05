
package analysis;

/**
 *
 * @author cwelch
 */

import abstree.AbsVarDecl;
import java.io.*;


/** Acceso a variables locales  */
public class FrmLocAccess extends FrmAccess {

	////// HAS IT BEEN ASSIGNED YET?
	public int hasValue = 0;

	/** declaracion de AbsVar  */
	public AbsVarDecl var;

	/** Declaracion de variable de control de llamados  */
	public FrmFrame frame;

	/** offset  */
	public int offset;

	public FrmLocAccess(AbsVarDecl var, FrmFrame frame) {
		this.var = var;
		this.frame = frame;

		SemType type = SemDesc.getActualType(var);
		this.offset = 0 - frame.sizeLocs - type.size();
		frame.sizeLocs = frame.sizeLocs + type.size();
	}

	public void toXML(PrintStream xml) {
		xml.print("<frmnode>\n<frm kind=\"loc offset\" value=\"" + offset + "\"/>\n</frmnode>\n");
	}

}
