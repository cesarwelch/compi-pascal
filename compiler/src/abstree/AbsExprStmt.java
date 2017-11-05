package abstree;

/**
 *
 * @author jorgecaballero
 */


import abstree.AbsVisitor;

/**
 * Llamada a procedimiento
 */
public class AbsExprStmt extends AbsStmt {

	/** Expresión/Proc */
	public AbsValExpr expr;

	public AbsExprStmt(AbsValExpr expr) {
		this.expr = expr;
	}

	public void accept(AbsVisitor visitor) {
		visitor.visit(this);
	}

}
