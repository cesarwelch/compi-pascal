package finalCode;

import analysis.FrmLabel;
import java.io.*;


public class ImcNAME extends ImcExpr {

	/** Etiqueta de los nombres  */
	public FrmLabel label;

	public ImcNAME(FrmLabel label) {
		this.label = label;
	}

	@Override
	public void toXML(PrintStream xml) {
		xml.print("<imcnode kind=\"NAME\" value=\"" + label.name() + "\"/>\n");
	}
        
        @Override
        public String toString(){
            StringBuilder sb = new StringBuilder();
            sb.append("Name: ").append(label.name());
            return sb.append("\n").toString();
        }

	@Override
	public ImcESEQ linear() {
		return new ImcESEQ(new ImcSEQ(), this);
	}

}
