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
public class BEStatement extends Statement {
    public Statements statement;

    public BEStatement(Statements statement) {
        this.statement = statement;
    }
    
    
}
