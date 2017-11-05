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
public class Statements extends Block {
    public Statement statement;
    public Statements statements;

    public Statements(Statement statement) {
        this.statement = statement;
    }

    public Statements(Statement statement, Statements statements) {
        this.statement = statement;
        this.statements = statements;
    }
    
    
}
