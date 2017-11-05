package abstree;

/**
 *
 * @author jorgecaballero
 */


import java.util.*;

import abstree.AbsVisitor;

/**
 * Lista de declaraciones
 */
public class AbsDecls extends AbsTree {

	/** Lista enlazada de tipo AbsDecl */
	public LinkedList<AbsDecl> decls;

	public AbsDecls() {
		decls = new LinkedList<AbsDecl>();
	}

	public void accept(AbsVisitor visitor) {
		visitor.visit(this);
	}

}
