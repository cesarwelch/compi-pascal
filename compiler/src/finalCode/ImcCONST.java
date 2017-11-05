package finalCode;

import java.io.*;

public class ImcCONST extends ImcExpr {

	/** Valor.  */
	public int value;

	public ImcCONST(int value) {
		this.value = value;
	}

	@Override
	public void toXML(PrintStream xml) {
		xml.print("<imcnode kind=\"CONST\" value=\"" + value + "\"/>\n");

		if (value < 10){
			System.out.println("CONST " + value);
		}
		else{
			System.out.println("CONST " + (char) value );
		}

	}
        
        @Override
        public String toString(){
            StringBuilder sb = new StringBuilder();
            sb.append("Const: ").append((char) value);
            return sb.append("\n").toString();
        }

	@Override
	public ImcESEQ linear() {
		return new ImcESEQ(new ImcSEQ(), this);
	}

}
