package analysis;

/**
 *
 * @author cwelch
 */

import abstree.AbsVarDecl;
import java.io.*;


/** Acceso a variables globles   */
public class FrmVarAccess extends FrmAccess {

	// HAS VALUE
	public int hasValue = 0;


	/** Declaracion AbsVar  */
	public AbsVarDecl var;

	/**  Declaracion FrmLabel  */
	public FrmLabel label;

	public FrmVarAccess(AbsVarDecl var) {
		this.var = var;
		label = FrmLabel.newLabel(var.name.name);
	}

	public void toXML(PrintStream xml) {
		xml.print("<frmnode>\n<frm kind=\"label\" value=\"" + label.name() + "\"/>\n</frmnode>\n");
	}

}
