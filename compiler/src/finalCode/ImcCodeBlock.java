package finalCode;

import analysis.FrmFrame;
import java.io.*;


public class ImcCodeBlock extends ImcBlock {

	/** Declaracion de registro de llamadas   */
	public FrmFrame frame;

	/** Funciones de codigo Intermedio  */
	public ImcStmt imcode;

	/** Codigo Intermedio */
	public ImcStmt lincode;

	public ImcCodeBlock(FrmFrame frame, ImcStmt imcode) {
		this.frame = frame;
		this.imcode = imcode;
		this.lincode = null;
	}

        @Override
        public String toString(){
            StringBuilder sb = new StringBuilder();
            sb.append(imcode.toString());
            return sb.append("\n").toString();
        }
        
	@Override
	public void toXML(PrintStream xml) {
		xml.print("<codechunk value=\"" + frame.label.name() + "\">\n");
		System.out.println("_"+frame.label.name());
		frame.toXML(xml);
		if (lincode == null) imcode.toXML(xml); else lincode.toXML(xml);
		xml.print("</codechunk>\n");
	}

}
