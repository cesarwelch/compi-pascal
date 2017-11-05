package abstree;

/**
 *
 * @author jorgecaballero
 */

import abstree.AbsVisitor;

/**
 * Declaración de Tipo
 */
public class AbsTypeDecl extends AbsDecl {

	/** Nombre. */
	public AbsDeclName name;

	/** Tipo. */
	public AbsTypeExpr type;
        
        public Integer scope;

	public AbsTypeDecl(AbsDeclName name, AbsTypeExpr type) {
		this.name = name;
		this.type = type;
	}

	public void accept(AbsVisitor visitor) {
		visitor.visit(this);
	}

	public String toString(){
		return name.name;
	}

}
