package finalCode;

import analysis.FrmLabel;
import java.io.*;


public class ImcLABEL extends ImcStmt {

	/** Etiqueta Label.  */
	public FrmLabel label;

	public ImcLABEL(FrmLabel label) {
		this.label = label;
	}
        
        @Override
        public String toString(){
            StringBuilder sb = new StringBuilder();
            sb.append("Label Stmt").append(label.toString());
            return sb.append("\n").toString();
        }

	@Override
	public void toXML(PrintStream xml) {
		xml.print("<imcnode kind=\"LABEL\" value=\"" + label.name() + "\"/>\n");
		System.out.println("LABEL "+ label.name());
	}

	@Override
	public ImcSEQ linear() {
		ImcSEQ lin = new ImcSEQ();
		lin.stmts.add(this);
		return lin;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ImcLABEL) {
			return ((ImcLABEL)obj).label.name().equals(label.name());
		}
		return false;
	}

}
