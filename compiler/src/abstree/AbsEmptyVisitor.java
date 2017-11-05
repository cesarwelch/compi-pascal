package abstree;

/**
 *
 * @author jorgecaballero
 */


import analysis.Report;
import abstree.AbsVisitor;
import abstree.AbsWhileStmt;
import abstree.AbsValExprs;
import abstree.AbsVarDecl;
import abstree.AbsDecls;
import abstree.AbsConstDecl;
import abstree.AbsCallExpr;
import abstree.AbsIfStmt;
import abstree.AbsAlloc;
import abstree.AbsUnExpr;
import abstree.AbsProcDecl;
import abstree.AbsStmts;
import abstree.AbsExprStmt;
import abstree.AbsAtomConst;
import abstree.QMarkStmt;
import abstree.AbsAtomType;
import abstree.AbsPointerType;
import abstree.AbsRecordType;
import abstree.AbsTypeName;
import abstree.AbsDeclName;
import abstree.AbsValName;
import abstree.AbsTypeDecl;
import abstree.AbsProgram;
import abstree.AbsBinExpr;
import abstree.AbsNilConst;
import abstree.AbsFunDecl;
import abstree.AbsAssignStmt;
import abstree.AbsBlockStmt;
import abstree.AbsArrayType;
import abstree.AbsForStmt;

public class AbsEmptyVisitor implements AbsVisitor {

	@Override
	public void visit(AbsAlloc acceptor) {
		Thread.dumpStack();
		Report.error("Nodo no implementado.", 1);
	}

	@Override
	public void visit(AbsArrayType acceptor) {
		Thread.dumpStack();
		Report.error("Nodo no implementado.", 1);
	}

	@Override
	public void visit(AbsAssignStmt acceptor) {
		Thread.dumpStack();
		Report.error("Nodo no implementado.", 1);
	}

	@Override
	public void visit(AbsAtomConst acceptor) {
		Thread.dumpStack();
		Report.error("Nodo no implementado.", 1);
	}

	@Override
	public void visit(AbsAtomType acceptor) {
		Thread.dumpStack();
		Report.error("Nodo no implementado.", 1);
	}

	@Override
	public void visit(AbsBinExpr acceptor) {
		Thread.dumpStack();
		Report.error("Nodo no implementado.", 1);
	}

	@Override
	public void visit(AbsBlockStmt acceptor) {
		Thread.dumpStack();
		Report.error("Nodo no implementado.", 1);
	}

	@Override
	public void visit(AbsCallExpr acceptor) {
		Thread.dumpStack();
		Report.error("Nodo no implementado.", 1);
	}

	@Override
	public void visit(AbsConstDecl acceptor) {
		Thread.dumpStack();
		Report.error("Nodo no implementado.", 1);
	}

	@Override
	public void visit(AbsDeclName acceptor) {
		Thread.dumpStack();
		Report.error("Nodo no implementado.", 1);
	}

	@Override
	public void visit(AbsDecls acceptor) {
		Thread.dumpStack();
		Report.error("Nodo no implementado.", 1);
	}

	@Override
	public void visit(AbsExprStmt acceptor) {
		Thread.dumpStack();
		Report.error("Nodo no implementado.", 1);
	}

	@Override
	public void visit(AbsForStmt acceptor) {
		Thread.dumpStack();
		Report.error("Nodo no implementado.", 1);
	}

	@Override
	public void visit(AbsFunDecl acceptor) {
		Thread.dumpStack();
		Report.error("Nodo no implementado.", 1);
	}

	@Override
	public void visit(AbsIfStmt acceptor) {
		Thread.dumpStack();
		Report.error("Nodo no implementado.", 1);
	}

	@Override
	public void visit(AbsNilConst acceptor) {
		Thread.dumpStack();
		Report.error("Nodo no implementado.", 1);
	}

	@Override
	public void visit(AbsPointerType acceptor) {
		Thread.dumpStack();
		Report.error("Nodo no implementado.", 1);
	}

	@Override
	public void visit(AbsProcDecl acceptor) {
		Thread.dumpStack();
		Report.error("Nodo no implementado.", 1);
	}

	@Override
	public void visit(AbsProgram acceptor) {
		Thread.dumpStack();
		Report.error("Nodo no implementado.", 1);
	}

	@Override
	public void visit(AbsRecordType acceptor) {
		Thread.dumpStack();
		Report.error("Nodo no implementado.", 1);
	}

	@Override
	public void visit(AbsStmts acceptor) {
		Thread.dumpStack();
		Report.error("Nodo no implementado.", 1);
	}

	@Override
	public void visit(AbsTypeDecl acceptor) {
		Thread.dumpStack();
		Report.error("Nodo no implementado.", 1);
	}

	@Override
	public void visit(AbsTypeName acceptor) {
		Thread.dumpStack();
		Report.error("Nodo no implementado.", 1);
	}

	@Override
	public void visit(AbsUnExpr acceptor) {
		Thread.dumpStack();
		Report.error("Nodo no implementado.", 1);
	}

	@Override
	public void visit(AbsValExprs acceptor) {
		Thread.dumpStack();
		Report.error("Nodo no implementado.", 1);
	}

	@Override
	public void visit(AbsValName acceptor) {
		Thread.dumpStack();
		Report.error("Nodo no implementado.", 1);
	}

	@Override
	public void visit(AbsVarDecl acceptor) {
		Thread.dumpStack();
		Report.error("Nodo no implementado.", 1);
	}

	@Override
	public void visit(AbsWhileStmt acceptor) {
		Thread.dumpStack();
		Report.error("Nodo no implementado.", 1);
	}

	@Override
	public void visit(QMarkStmt qMarkStmt) {
		Thread.dumpStack();
		Report.error("Nodo no implementado.", 1);
	}

}
