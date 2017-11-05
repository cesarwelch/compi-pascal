package abstree;

/**
 *
 * @author jorgecaballero
 */

import abstree.AbsVisitor;

/**
 * Tipo de dato de Arraglo
 */
public class AbsArrayType extends AbsTypeExpr {

	/** Tipo que conforma el arreglo. */
	public AbsTypeExpr type;

	/** Inicia en */
	public AbsValExpr loBound;

	/** Termina en. */
	public AbsValExpr hiBound;

	public AbsArrayType(AbsTypeExpr type, AbsValExpr loBound, AbsValExpr hiBound) {
		this.type = type;
		this.loBound = loBound;
		this.hiBound = hiBound;
	}

	public void accept(AbsVisitor visitor) {
		visitor.visit(this);
	}
        
        public String toString(){
            return type.toString();
        }

}
