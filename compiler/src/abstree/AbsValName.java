package abstree;

/**
 *
 * @author jorgecaballero
 */

import abstree.AbsVisitor;

/**
 * Terminos para describir el nombre.
 */
public class AbsValName extends AbsValExpr {

	/* Nombre. */
	public String name;

	public AbsValName(String name) {
		this.name = name;
	}

	public void accept(AbsVisitor visitor) {
		visitor.visit(this);
	}

}
