package abstree;

/**
 *
 * @author jorgecaballero
 */


import abstree.AbsVisitor;

/**
 * Declaración de Constantes.
 */
public class AbsConstDecl extends AbsDecl {

	/** Nombre de la constante. */
	public AbsDeclName name;

	/** Valor asignado. */
	public AbsValExpr value;

	public AbsConstDecl(AbsDeclName name, AbsValExpr value) {
		this.name = name;
		this.value = value;
	}

	public void accept(AbsVisitor visitor) {
		visitor.visit(this);
	}

	public String toString(){
		return name.name;
	}

}
