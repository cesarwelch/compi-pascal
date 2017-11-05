package abstree;

/**
 *
 * @author jorgecaballero
 *
 * Definición de clase abstracta para las declaraciones generales.
 *
 * @see AbsConstDecl
 * @see AbsDeclName
 * @see AbsFunDecl
 * @see AbsProcDecl
 * @see AbsTypeDecl
 * @see AbsVarDecl
 */
public abstract class AbsDecl extends AbsTree {
	public abstract String toString();
        public Integer scope;
}
