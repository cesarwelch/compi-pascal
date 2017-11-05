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
public class FunctionDeclaration extends Block {
    String id;
    Params params;
    Type type;
    Blocks blocks;

    public FunctionDeclaration(String id, Params params, Type type, Blocks blocks) {
        this.id = id;
        this.params = params;
        this.type = type;
        this.blocks = blocks;
    }
   
}
