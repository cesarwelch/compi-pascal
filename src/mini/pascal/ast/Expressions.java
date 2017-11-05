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
public class Expressions {
    Expressions expressions;
    Expression expression;

    public Expressions(Expressions expressions, Expression expression) {
        this.expressions = expressions;
        this.expression = expression;
    }

    public Expressions(Expression expression) {
        this.expression = expression;
    }
    
    
}
