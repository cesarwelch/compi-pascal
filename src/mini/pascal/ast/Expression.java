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
public class Expression {
    public SimpleExpression simpleExpression;
    public SimpleExpression simpleExpression2;
    public String operational;
    public String constant;
    public String type;

    public Expression(SimpleExpression simpleExpression) {
        this.simpleExpression = simpleExpression;
        this.type = simpleExpression.type;
    }

    public Expression(SimpleExpression simpleExpression, SimpleExpression simpleExpression2, String operational) {
        this.simpleExpression = simpleExpression;
        this.simpleExpression2 = simpleExpression2;
        this.operational = operational;
        this.type = "boolean";
    }


}
