package abstree;

/**
 *
 * @author jorgecaballero
 */


import abstree.AbsVisitor;

/**
 * Declaración de Programa
 */
public class AbsProgram extends AbsTree {

	/** Nombre del programa */
	public AbsDeclName name;

	/** Declaraciones. */
	public AbsDecls decls;

	/** Bloque de programa (main) definido por BEGIN stmts END. */
	public AbsBlockStmt stmt;

	public AbsProgram(AbsDeclName name, AbsDecls decls, AbsBlockStmt stmt) {
		this.name = name;
		this.decls = decls;
		this.stmt = stmt;
	}

	public void accept(AbsVisitor visitor) {
		visitor.visit(this);
	}

}
