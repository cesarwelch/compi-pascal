package abstree;

/**
 *
 * @author jorgecaballero
 */

import abstree.AbsVisitor;

/**
 * Asignación
 */
public class AbsAssignStmt extends AbsStmt {

	/** Termino a la izquierda o destino de asignación. */
	public AbsValExpr dstExpr;

	/** Termino a la derecha u origen de la asignación. */
	public AbsValExpr srcExpr;

	public AbsAssignStmt(AbsValExpr dstExpr, AbsValExpr srcExpr) {
		this.dstExpr = dstExpr;
		this.srcExpr = srcExpr;
	}

	public void accept(AbsVisitor visitor) {
		visitor.visit(this);
	}

}
