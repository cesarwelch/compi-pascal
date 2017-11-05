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
public class SimpleExpression {
    public Term term;
    public SimpleExpression simpleExpression;
    public String sign;
    public String type;

    public SimpleExpression(String sign, Term term) {
        this.term = term;
        this.sign = sign;
        this.type = term.type;
    }

    public SimpleExpression(SimpleExpression simpleExpression, String sign, Term term) {
        this.term = term;
        this.simpleExpression = simpleExpression;
        this.sign = sign;
    }

    public SimpleExpression(Term term) {
        this.term = term;
        this.type = term.type;
    }



}
