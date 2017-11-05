package abstree;

/**
 *
 * @author jorgecaballero
 */

import abstree.AbsVisitor;

/**
 * Subrutina, funciones o procedimientos.
 */
public class AbsCallExpr extends AbsValExpr {

	/* Nombre de rutina. */
	public AbsValName name;

	/* Argumentos. */
	public AbsValExprs args;

	public AbsCallExpr(AbsValName name, AbsValExprs args) {
		this.name = name;
		this.args = args;
	}

	public void accept(AbsVisitor visitor) {
		visitor.visit(this);
	}

}
