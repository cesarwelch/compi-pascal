package abstree;

/**
 *
 * @author jorgecaballero
 */

import abstree.AbsVisitor;

/**
 * Terminos Utilizados 
 */
public class AbsTypeName extends AbsTypeExpr {

	/* Nombre. */
	public String name;

	public AbsTypeName(String name) {
		this.name = name;
	}

	public void accept(AbsVisitor visitor) {
		visitor.visit(this);
	}
        
        public String toString(){
            return name;
        }

}
