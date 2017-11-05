package abstree;

/**
 *
 * @author jorgecaballero
 */


import java.util.*;

import abstree.AbsVisitor;

/**
 * Statements
 */
public class AbsStmts extends AbsTree {

	/** Lista enlazada de statements */
	public LinkedList<AbsStmt> stmts;

	public AbsStmts() {
		stmts = new LinkedList<AbsStmt>();
	}

	public void accept(AbsVisitor visitor) {
		visitor.visit(this);
	}

}
