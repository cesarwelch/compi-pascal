package abstree;

/**
 *
 * @author jorgecaballero
 */

import abstree.AbsVisitor;

/**
 * Clase base de tipo constante.
 */
public class AbsAtomConst extends AbsConstExpr {

	public final static int BOOL = 0;
	public final static int CHAR = 1;
	public final static int INT = 2;

	/** Valor de la constante. */
	public String value;

	/** Tipo de la constante, puede ser 0,1,2 depende de las variables estaticas mostradas anteriormente. */
	public int type;

	public AbsAtomConst(String value, int type) {
		this.value = value;
		this.type = type;
	}

	public void accept(AbsVisitor visitor) {
		visitor.visit(this);
	}

}
