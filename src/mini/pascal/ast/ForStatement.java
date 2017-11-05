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
public class ForStatement extends Statement {
    public String id;
    public Expression expression;
    public Expression expression2;
    public Statement statement;

    public ForStatement(Object id, Expression expression, Expression expression2, Statement statement) {
        this.id = (String) id;
        this.expression = expression;
        this.expression2 = expression2;
        this.statement = statement;
    }
    
    
}
