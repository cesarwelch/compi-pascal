package abstree;

/**
 *
 * @author jorgecaballero
 */


import abstree.AbsVisitor;

/**
 * Declaración de Procedimiento
 */
public class AbsProcDecl extends AbsDecl {

	/** Nombre del procedimiento */
	public AbsDeclName name;

	/** Parametros. */
	public AbsDecls pars;

	/** Declaraciones de variables locales. */
	public AbsDecls decls;

	/** Statements. */
	public AbsBlockStmt stmt;
        
        public Integer scope;

	public AbsProcDecl(AbsDeclName name, AbsDecls pars, AbsDecls decls, AbsBlockStmt stmt) {
		this.name = name;
		this.pars = pars;
		this.decls = decls;
		this.stmt = stmt;
	}

	public void accept(AbsVisitor visitor) {
		visitor.visit(this);
	}

	public String toString(){
		return name.name;
	}

}
