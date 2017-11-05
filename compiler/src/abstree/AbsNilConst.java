package abstree;

/**
 *
 * @author jorgecaballero
 */


import abstree.AbsVisitor;

/**
 * Clase nula
 */
public class AbsNilConst extends AbsConstExpr {

	public AbsNilConst() {
	}

	public void accept(AbsVisitor visitor) {
		visitor.visit(this);
	}

}
