package finalCode;

import analysis.FrmTemp;
import analysis.FrmLabel;
import java.io.*;
import java.util.*;

import abstree.VisibilityType;

public class ImcCALL extends ImcExpr {

	/** Variable Etiqueta   */
	public FrmLabel label;

	/** Argumentos de la llamada de funcion  */
	public LinkedList<ImcExpr> args;

	/** Tamano de los argumentos  */
	public LinkedList<Integer> size;

	public ImcCALL(FrmLabel label) {
		this.label = label;
		this.args = new LinkedList<ImcExpr>();
		this.size = new LinkedList<Integer>();
	}

	@Override
	public void toXML(PrintStream xml) {
		xml.print("<imcnode kind=\"CALL\" value=\"" + label.name() + "\">\n");
		Iterator<ImcExpr> args = this.args.iterator();
		while (args.hasNext()) {
			ImcExpr arg = args.next();
			//AQUI YA
			//System.out.println(arg.toString());
			arg.toXML(xml);
		}
		if (label.name().equals("_putint")) {
			System.out.println("li $v0, 1");
			System.out.println("li $a0, "+ label);
			System.out.println("syscall");
		}
		System.out.println("JAL " + label.name());
		xml.print("</imcnode>\n");
	}

        @Override
        public String toString(){
            StringBuilder sb = new StringBuilder();
            sb.append("Call Function: ").append(label.name());
            Iterator<ImcExpr> args = this.args.iterator();
            while (args.hasNext()) {
                ImcExpr arg = args.next();
                sb.append(arg.toString());
            }
            return sb.append("\n").toString();
        }


	@Override
	public ImcESEQ linear() {
		ImcSEQ linStmt = new ImcSEQ();
		ImcCALL linCall = new ImcCALL(label);
		Iterator<ImcExpr> args = this.args.iterator();
		while (args.hasNext()) {
			FrmTemp temp = new FrmTemp();
			ImcExpr arg = args.next();
			ImcESEQ linArg = arg.linear();
			linStmt.stmts.addAll(((ImcSEQ)linArg.stmt).stmts);
			linStmt.stmts.add(new ImcMOVE(new ImcTEMP(temp), linArg.expr, new VisibilityType(VisibilityType.PUBLIC)));
			linCall.args.add(new ImcTEMP(temp));
		}
		linCall.size = this.size;
		FrmTemp temp = new FrmTemp();
		linStmt.stmts.add(new ImcMOVE(new ImcTEMP(temp), linCall, new VisibilityType(VisibilityType.PUBLIC)));
		return new ImcESEQ(linStmt, new ImcTEMP(temp));
	}

}
