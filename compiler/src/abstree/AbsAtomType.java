package abstree;

/**
 *
 * @author jorgecaballero
 */

import abstree.AbsVisitor;

/**
 * Tipos
 */
public class AbsAtomType extends AbsTypeExpr {

	public static final int BOOL = 0;
	public static final int CHAR = 1;
	public static final int INT = 2;

	/* Tipo, segun variables estaticas anteriores. */
	public int type;

	public AbsAtomType(int type) {
		this.type = type;
	}

	public void accept(AbsVisitor visitor) {
		visitor.visit(this);
	}

	public String toString(){
            switch(type){
                    case 0:
                            return "BOOL";
                    case 1:
                            return "CHAR";
                    case 2:
                            return "INT";
            }
            return "";    
	}

}
