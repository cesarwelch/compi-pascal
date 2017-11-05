package abstree;

/**
 *
 * @author jorgecaballero
 */

import abstree.AbsVisitor;

/**
 * Declaracion de variables
 */
public class AbsVarDecl extends AbsDecl {

	/** nombre de la variable. */
	public AbsDeclName name;

	/** Tipo de la variable. */
	public AbsTypeExpr type;

	/** Tipo de visiblidad */
	public VisibilityType visType;
        
        public Integer scope;

	public AbsVarDecl(AbsDeclName name, AbsTypeExpr type, VisibilityType visType) {
		this.name = name;
		this.type = type;
		this.visType = visType;
	}

	public void accept(AbsVisitor visitor) {
		visitor.visit(this);
	}

	public String toString(){
		return type.toString();
	}

}
