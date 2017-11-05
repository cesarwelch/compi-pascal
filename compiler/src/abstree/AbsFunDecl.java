package abstree;

/**
 *
 * @author jorgecaballero
 */


import abstree.AbsVisitor;

/**
 * Declaración de Función
 */
public class AbsFunDecl extends AbsDecl {

	/** Nombre de función */
	public AbsDeclName name;

	/** Parametro */
	public AbsDecls pars;

	/** Tipo de retorno */
	public AbsTypeExpr type;

	/** Declaraciones de variables internas */
	public AbsDecls decls;

	/** Statements. */
	public AbsBlockStmt stmt;
        
        public Integer scope;

	public AbsFunDecl(AbsDeclName name, AbsDecls pars, AbsTypeExpr type, AbsDecls decls, AbsBlockStmt stmt) {
		this.name = name;
		this.pars = pars;
		this.type = type;
		this.decls = decls;
		this.stmt = stmt;
	}

	public void accept(AbsVisitor visitor) {
		visitor.visit(this);
	}

	public String toString(){
            if (type instanceof AbsTypeName) {
                return type.toString();
            }
            if (type instanceof AbsAtomType) {
                return type.toString();
            }
            return "language function";
	}

}
