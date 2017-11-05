package abstree;

/**
 *
 * @author jorgecaballero
 */


import abstree.AbsVisitor;

/**
 * Condición If
 */
public class AbsIfStmt extends AbsStmt {

	/** Condición */
	public AbsValExpr cond;

	/** Bloque verdadero */
	public AbsStmt thenStmt;

	/** Bloque falso */
	public AbsStmt elseStmt;

	public AbsIfStmt(AbsValExpr cond, AbsStmt thenStmt, AbsStmt elseStmt) {

		this.cond = cond;
		this.thenStmt = thenStmt;
		this.elseStmt = elseStmt;
	}

	public void accept(AbsVisitor visitor) {
		visitor.visit(this);
	}

}
