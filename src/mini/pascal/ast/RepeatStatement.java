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
public class RepeatStatement extends Statement{
    public Expression expression;
    public Statement statement;

    public RepeatStatement(Expression expression, Statement statement) {
        this.expression = expression;
        this.statement = statement;
        super.type = "repeat";
    }
    
    
}
