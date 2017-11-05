package abstree;

/**
 *
 * @author jorgecaballero
 */

import abstree.AbsVisitor;

public class AbsAlloc extends AbsValExpr {

	// Tipo de Dato Asignado
	public AbsTypeExpr type;

	public AbsAlloc(AbsTypeExpr type) {
		this.type = type;
	}

	public void accept(AbsVisitor visitor) {
		visitor.visit(this);
	}

}
