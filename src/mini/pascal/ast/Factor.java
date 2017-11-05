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
public class Factor {
    public Factor factor;
    public Variable variable;
    public Expression expression;
    public Expressions expressions;
    public String constant;
    public String type;

    public Factor(Factor factor) {
        this.factor = factor;
        this.type = factor.type;
    }

    public Factor(Variable variable) {
        this.variable = variable;
        this.type = variable.type;
    }

    public Factor(Expression expression) {
        this.expression = expression;
        this.type = expression.type;
    }

    public Factor(String constant, String type) {
        this.constant = constant;
        this.type = type;
    }

    public Factor(Variable variable, Expressions expressions) {
        this.variable = variable;
        this.expressions = expressions;
    }


}
