package abstree;

/**
 *
 * @author jorgecaballero
 */


import abstree.AbsVisitor;

/**
 * Declaración de nombre
 */
public class AbsDeclName extends AbsDecl {

	/* Nombre. */
	public String name;
        
        public Integer scope;

	public AbsDeclName(String name) {
		this.name = name;
	}

	public void accept(AbsVisitor visitor) {
		visitor.visit(this);
	}

	public String toString(){
		return name;
	}

}
