package abstree;

/**
 *
 * @author jorgecaballero
 */


import abstree.AbsVisitor;

/** Ciclo For.
 */
public class AbsForStmt extends AbsStmt {

	/** Variable de control */
	public AbsValName name;

	/** Inicio */
	public AbsValExpr loBound;

	/** Final */
	public AbsValExpr hiBound;

	/** Statements */
	public AbsStmt stmt;

	public AbsForStmt(AbsValName name, AbsValExpr loBound, AbsValExpr hiBound, AbsStmt stmt) {
		this.name = name;
		this.loBound = loBound;
		this.hiBound = hiBound;
		this.stmt = stmt;
	}

	public void accept(AbsVisitor visitor) {
		visitor.visit(this);
	}

}
