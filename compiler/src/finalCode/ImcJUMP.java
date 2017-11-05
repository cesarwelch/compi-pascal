package finalCode;

import analysis.FrmLabel;
import java.io.*;


public class ImcJUMP extends ImcStmt {

	/** Etiqueta Frm.  */
	public FrmLabel label;

	public ImcJUMP(FrmLabel label) {
		this.label = label;
	}
        
        @Override
        public String toString(){
            StringBuilder sb = new StringBuilder();
            sb.append("Jump Stmt: ").append(label.toString());
            return sb.append("\n").toString();
        }
        

	@Override
	public void toXML(PrintStream xml) {
		xml.print("<imcnode kind=\"JUMP\" value=\"" + label.name() + "\"/>\n");
		System.out.println("GOTO "+ label.name());
	}

	@Override
	public ImcSEQ linear() {
		ImcSEQ lin = new ImcSEQ();
		lin.stmts.add(this);
		return lin;
	}

}
