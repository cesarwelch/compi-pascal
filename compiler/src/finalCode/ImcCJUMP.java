package finalCode;

import analysis.FrmLabel;
import java.io.*;


public class ImcCJUMP extends ImcStmt {

	/** Codigo Expresion.  */
	public ImcExpr cond;

	/** Codigo de etiqueta  */
	public FrmLabel trueLabel;

	/** Etiqueta falsa */
	public FrmLabel falseLabel;

	public ImcCJUMP(ImcExpr cond, FrmLabel trueLabel, FrmLabel falseLabel) {
		this.cond = cond;
		this.trueLabel = trueLabel;
		this.falseLabel = falseLabel;
	}

        @Override
        public String toString(){
            StringBuilder sb = new StringBuilder();
            sb.append("Complex Jump Stmt. Condition").append(cond.toString()).append(" true: ").append(trueLabel.toString()).append(" false ").append(falseLabel.toString());
            return sb.append("\n").toString();
        }
        
	@Override
	public void toXML(PrintStream xml) {
		xml.print("<imcnode kind=\"CJUMP\" value=\"" + trueLabel.name() + "," + falseLabel.name() + "\">\n");
		cond.toXML(xml);
		System.out.println("GOTO" + trueLabel.name());
		xml.print("</imcnode>\n");
	}


	@Override
	public ImcSEQ linear() {
		ImcSEQ lin = new ImcSEQ();
		ImcESEQ linCond = cond.linear();
		FrmLabel newFalseLabel = FrmLabel.newLabel();
		lin.stmts.addAll(((ImcSEQ)linCond.stmt).stmts);
		lin.stmts.add(new ImcCJUMP(linCond.expr, trueLabel, newFalseLabel));
		lin.stmts.add(new ImcLABEL(newFalseLabel));
		lin.stmts.add(new ImcJUMP(falseLabel));
		return lin;
	}

}
