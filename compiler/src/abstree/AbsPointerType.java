package abstree;

/**
 *
 * @author jorgecaballero
 */


import abstree.AbsVisitor;

/**
 * Tipo puntero para arreglos
 */
public class AbsPointerType extends AbsTypeExpr {

	/** Tipo de dato apuntado */
	public AbsTypeExpr type;

	public AbsPointerType(AbsTypeExpr type) {
		this.type = type;
	}

	public void accept(AbsVisitor visitor) {
		visitor.visit(this);
	}
        
        
        public String toString(){
            return type.toString();
        }

}
