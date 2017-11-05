package abstree;

/**
 *
 * @author jorgecaballero
 */

import abstree.AbsVisitor;

/**
 * statement While 
 */
public class AbsWhileStmt extends AbsStmt {

	/** Condition. */
	public AbsValExpr cond;

	/** Sentence. */
	public AbsStmt stmt;

	public AbsWhileStmt(AbsValExpr cond, AbsStmt stmt) {
		this.cond = cond;
		this.stmt = stmt;
	}

	public void accept(AbsVisitor visitor) {
		visitor.visit(this);
	}

}
