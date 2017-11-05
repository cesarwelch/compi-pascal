package finalCode;

import java.io.*;

public class ImcESEQ extends ImcExpr {

	/** Statements.  */
	public ImcStmt stmt;

	/** Valor.  */
	public ImcExpr expr;

	public ImcESEQ(ImcStmt stmt, ImcExpr expr) {
		this.stmt = stmt;
		this.expr = expr;
	}

	@Override
	public void toXML(PrintStream xml) {
		xml.print("<imcnode kind=\"ESEQ\">\n");
		stmt.toXML(xml);
		expr.toXML(xml);
		xml.print("</imcnode>\n");
	}
        
        @Override
        public String toString(){
            StringBuilder sb = new StringBuilder();
            sb.append(expr.toString()).append("\n").append(stmt.toString());
            return sb.append("\n").toString();
        }

	@Override
	public ImcESEQ linear() {
		ImcSEQ linStmt = stmt.linear();
		ImcESEQ linExpr = expr.linear();
		linStmt.stmts.addAll(((ImcSEQ)linExpr.stmt).stmts);
		linExpr.stmt = linStmt;
		return linExpr;
	}
}
