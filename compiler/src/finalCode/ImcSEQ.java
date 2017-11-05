package finalCode;

import java.io.*;
import java.util.*;

public class ImcSEQ extends ImcStmt {

	/* Declaracion de Statement.  */
	public LinkedList<ImcStmt> stmts;

	public ImcSEQ() {
		stmts = new LinkedList<ImcStmt>();
	}
        
        @Override
        public String toString(){
            StringBuilder sb = new StringBuilder();
            Iterator<ImcStmt> stmts = this.stmts.iterator();
		while (stmts.hasNext()) {
			ImcStmt stmt = stmts.next();
			sb.append(stmt.toString());
		}
            return sb.append("\n").toString();
        }


	@Override
	public void toXML(PrintStream xml) {
		xml.print("<imcnode kind=\"SEQ\">\n");
		Iterator<ImcStmt> stmts = this.stmts.iterator();
		while (stmts.hasNext()) {
			ImcStmt stmt = stmts.next();
			stmt.toXML(xml);
		}
		xml.print("</imcnode>\n");
	}

	@Override
	public ImcSEQ linear() {
		ImcSEQ lin = new ImcSEQ();
		Iterator<ImcStmt> stmts = this.stmts.iterator();
		while (stmts.hasNext()) {
			ImcStmt stmt = stmts.next();
			ImcSEQ linStmt = stmt.linear();
			lin.stmts.addAll(linStmt.stmts);
		}
		return lin;
	}

}
