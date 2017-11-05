package abstree;

/**
 *
 * @author jorgecaballero
 */

import java.util.*;

import abstree.AbsVisitor;

/**
 * Los terminos para describir.
 */
public class AbsValExprs extends AbsTree {

	/* expresiones. */
	public LinkedList<AbsValExpr> exprs;

	public AbsValExprs() {
		this.exprs = new LinkedList<AbsValExpr>();
	}

	public void accept(AbsVisitor visitor) {
		visitor.visit(this);
	}

}
