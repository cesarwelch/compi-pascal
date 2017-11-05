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
public class ProcedureDeclaration extends Block {
    String id;
    Params params;
    Blocks blocks;

    public ProcedureDeclaration(String id, Params params, Blocks blocks) {
        this.id = id;
        this.params = params;
        this.blocks = blocks;
    }
    
    
}
