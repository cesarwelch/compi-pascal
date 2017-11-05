package abstree;

/**
 *
 * @author jorgecaballero
 */

import abstree.AbsVisitor;

/**
 * Operacion compuesta, multiples bloques.
 */
public class AbsBlockStmt extends AbsStmt {

	/** Statements. */
	public AbsStmts stmts;

	public AbsBlockStmt(AbsStmts stmts) {
		this.stmts = stmts;
	}

	public void accept(AbsVisitor visitor) {
		visitor.visit(this);
	}

}
