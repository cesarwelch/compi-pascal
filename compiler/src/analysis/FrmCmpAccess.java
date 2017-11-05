package analysis;

/**
 *
 * @author cwelch
 */

import abstree.AbsVarDecl;
import java.io.*;


/** Declaracion de la estrucutra cmp.  */
public class FrmCmpAccess extends FrmAccess {

	/** Descripcion de declaracaciones  */
	public AbsVarDecl cmp;

	/** valor offset   */
	public int offset;

	public FrmCmpAccess(AbsVarDecl cmp, int offset) {
		this.cmp = cmp;
		this.offset = offset;
	}

	public void toXML(PrintStream xml) {
		xml.print("<frmnode>\n<frm kind=\"cmp offset\" value=\"" + offset + "\"/>\n</frmnode>\n");
	}

}
