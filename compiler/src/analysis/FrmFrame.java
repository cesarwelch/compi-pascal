package analysis;

/**
 *
 * @author cwelch
 */

import abstree.AbsFunDecl;
import abstree.AbsProcDecl;
import abstree.AbsTree;
import abstree.AbsProgram;
import java.io.*;
import java.util.*;


/** Llamar a funcion de Grabacion  */
public class FrmFrame implements XMLable {

	/** variable de descripcion.  */
	public AbsTree subp;

	/** Funcion del nivel */
	public int level;

	/** Etiqueta de entrada  */
	public FrmLabel label;

	/** el numero de argumentos*/
	public int numArgs;

	/** tamano de bloques. */
	LinkedList<FrmLocAccess> locVars;

	/** el tamano de bloque. */
	public int sizeLocs;

	/** El tamaño de bloque para oldFP y redAddr.  */
	public int sizeFPRA = 8;

	/** el tamano de bloques temprales   */
	public int sizeTmps;

	/** Tamano de bloques  */
	public int sizeRegs;

	/** Tamaño de los argumentos de salida.  */
	public int sizeArgs;

	/** El puntero FP  */
	public FrmTemp FP;

	/** el puntero RV  */
	public FrmTemp RV;

	public FrmFrame(AbsProgram prg, int level) {
		this.subp = prg;
		this.level = level;
		this.label = FrmLabel.newLabel("main");
		this.numArgs = 0;
		this.locVars = new LinkedList<FrmLocAccess> ();
		this.sizeLocs = 0;
		this.sizeFPRA = 8;
		this.sizeTmps = 0;
		this.sizeRegs = 0;
		this.sizeArgs = 0;
		FP = new FrmTemp();
		RV = null;
	}


	public FrmFrame(AbsProcDecl prc, int level) {
		this.subp = prc;
		this.level = level;
		this.label = (level == 1 ? FrmLabel.newLabel(prc.name.name) : FrmLabel.newLabel());
		this.numArgs = 0;
		this.locVars = new LinkedList<FrmLocAccess> ();
		this.sizeLocs = 0;
		this.sizeFPRA = 8;
		this.sizeTmps = 0;
		this.sizeRegs = 0;
		this.sizeArgs = 0;
		FP = new FrmTemp();
		RV = null;
	}

	public FrmFrame(AbsFunDecl fun, int level) {
		this.subp = fun;
		this.level = level;
		this.label = (level == 1 ? FrmLabel.newLabel(fun.name.name) : FrmLabel.newLabel());
		this.numArgs = 0;
		this.locVars = new LinkedList<FrmLocAccess> ();
		this.sizeLocs = 0;
		this.sizeFPRA = 8;
		this.sizeTmps = 0;
		this.sizeRegs = 0;
		this.sizeArgs = 0;
		FP = new FrmTemp();
		RV = new FrmTemp();
	}

	/** el tamano de registro de las llamadas  */
	public int size() {
		//Report.warning(""+this.label.name() + ": sizeLocs: "+this.sizeLocs + ", sizeFRPA: " + this.sizeFPRA + ", sizeTmps: " + this.sizeTmps + ", sizeArgs: " + this.sizeArgs + ", numArgs: " + this.numArgs);
		return sizeLocs + sizeFPRA + sizeTmps + sizeRegs + sizeArgs;
	}

	@Override
	public void toXML(PrintStream xml) {
		xml.print("<frmnode>\n");
		xml.print("<frm kind=\"level\" value=\"" + level + "\"/>\n");
		xml.print("<frm kind=\"label\" value=\"" + label.name() + "\"/>\n");
		xml.print("<frm kind=\"size\" value=\"" + size() + "\"/>\n");
		xml.print("<frm kind=\"FP\" value=\"" + FP.name() + "\"/>\n");
		if (RV != null) xml.print("<frm kind=\"RV\" value=\"" + RV.name() + "\"/>\n");
		xml.print("</frmnode>\n");
	}

}
