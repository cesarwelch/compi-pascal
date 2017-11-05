/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini.pascal.ast;

/**
 *
 * @author jorgecaballero
 */
public class PascalProgram implements AST {
    public String id;
    public Blocks blocks;

    public PascalProgram(String id, Blocks blocks) {
        this.id = id;
        this.blocks = blocks;
    }

    public SymTable st;
    
    public void setSymtabs() {          // calculate symbol table entries
        st = new SymTable();            // set input variables
        //block.vdl.setSymTable(st);
      }
}
