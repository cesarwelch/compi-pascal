package finalCode;

import java.io.*;

public class ImcMEM extends ImcExpr {

	/** Declaracion de memoria de acceso  */
	public ImcExpr expr;

	public ImcMEM(ImcExpr expr) {
		this.expr = expr;
	}

	@Override
	public void toXML(PrintStream xml) {
		xml.print("<imcnode kind=\"MEM\">\n");
		expr.toXML(xml);
		xml.print("</imcnode>\n");
	}
        
        @Override
        public String toString(){
            StringBuilder sb = new StringBuilder();
            sb.append(expr.toString());
            return sb.append("\n").toString();
        }

	@Override
	public ImcESEQ linear() {
		ImcESEQ lin = expr.linear();
		lin.expr = new ImcMEM(lin.expr);
		return lin;
	}

}
