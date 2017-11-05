package finalCode;

import analysis.FrmTemp;
import java.io.*;
import java.util.Iterator;


public class ImcTEMP extends ImcExpr {

	/** Variable Temp  */
	public FrmTemp temp;

	public ImcTEMP(FrmTemp temp) {
		this.temp = temp;
	}

	@Override
	public void toXML(PrintStream xml) {
		if(temp == null)	System.out.println("temp is null");
		xml.print("<imcnode kind=\"TEMP\" value=\"" + temp.name() + "\"/>\n");
	}
        
        @Override
        public String toString(){
            StringBuilder sb = new StringBuilder();
            sb.append("Temp: ").append(temp.name());
            return sb.append("\n").toString();
        }

	@Override
	public ImcESEQ linear() {
		return new ImcESEQ(new ImcSEQ(), this);
	}

}
