package finalCode;

import java.io.*;

public class ImcEXP extends ImcStmt {

	/** Expresion.  */
	public ImcExpr expr;

	public ImcEXP(ImcExpr expr) {
		this.expr = expr;
	}
        
        @Override
        public String toString(){
            StringBuilder sb = new StringBuilder();
            sb.append("Expression Stmt. ").append(expr.toString());
            return sb.append("\n").toString();
        }
        

	@Override
	public void toXML(PrintStream xml) {
		xml.print("<imcnode kind=\"EXP\">\n");
		expr.toXML(xml);
		xml.print("</imcnode>\n");
	}

	@Override
	public ImcSEQ linear() {
		ImcSEQ lin = new ImcSEQ();
		ImcESEQ linExpr = expr.linear();
		lin.stmts.addAll(((ImcSEQ)linExpr.stmt).stmts);
		lin.stmts.add(new ImcEXP(linExpr.expr));
		return lin;
	}

}

