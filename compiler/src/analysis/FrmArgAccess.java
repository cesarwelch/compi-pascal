package analysis;

/**
 *
 * @author cwelch
 */

import abstree.AbsVarDecl;
import java.io.*;


/** acceso a la funcion  */
public class FrmArgAccess extends FrmAccess {

	/** Descripcion del argumento  */
	public AbsVarDecl var;

	/** Variable para el control de llamadas  */
	public FrmFrame frame;

	/** valor de Offset  */
	public int offset;

	public FrmArgAccess(AbsVarDecl var, FrmFrame frame) {
		this.var = var;
		this.frame = frame;
		this.offset = 4 + frame.numArgs * 4;
		frame.numArgs++;
	}

	public void toXML(PrintStream xml) {
		xml.print("<frmnode>\n<frm kind=\"arg offset\" value=\"" + offset + "\"/>\n</frmnode>\n");
	}

}
