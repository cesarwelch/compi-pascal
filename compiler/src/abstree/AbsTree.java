package abstree;

/**
 *
 * @author jorgecaballero
 */


import abstree.AbsVisitor;

/**
 * Abstract Sintax Tree, clase padre del AST, de ella heredan:
 *
 * @see AbsDecl
 * @see AbsDecls
 * @see AbsProgram
 * @see AbsStmt
 * @see AbsStmts
 * @see AbsTypeExpr
 * @see AbsValExpr
 * @see AbsValExprs
 */
public abstract class AbsTree {

	/** Booleano reportero de error, si es true para para imprimir el error que construye a base de begLine, begColumn, endLine y endColumn
	 *
	 * Si error = true, a partir de este punto el arbol es invalidd */
	public boolean error = false;

	/**
	 * La línea del primer carácter del símbolo, que comienza el código descrito en este.
	 */
	public int begLine;

	/**
	 * Columna del primer carácter del símbolo, que comienza el código descrito en este árbol.
	 */
	public int begColumn;

	/**
	 * La línea del primer carácter del símbolo, que es el final del código descrito en este.
	 */
	public int endLine;

	/**
	 * Columna del primer carácter del símbolo, que es el final del código descrito en este
	 */
	public int endColumn;

	public AbsTree() {
		this.begLine = 0;
		this.begColumn = 0;
		this.endLine = 0;
		this.endColumn = 0;
	}

	public void setBeg(String lexeme, int line, int column) {
		begLine = line;
		begColumn = column;
	}

	public void setBeg(AbsTree tree) {
		begLine = tree.begLine;
		begColumn = tree.begColumn;
	}

	public void setEnd(String lexeme, int line, int column) {
		endLine = line;
		endColumn = column + lexeme.length() - 1;
	}

	public void setEnd(AbsTree tree) {
		endLine = tree.endLine;
		endColumn = tree.endColumn;
	}

	public void setPos(String lexeme, int line, int column) {
		setBeg(lexeme, line, column);
		setEnd(lexeme, line, column);
	}

	public void setPos(AbsTree tree) {
		setBeg(tree);
		setEnd(tree);
	}

	public abstract void accept(AbsVisitor visitor);

}
