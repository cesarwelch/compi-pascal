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
public class Variable {
    public String id;
    public Expressions expressions;
    public String type;

    public Variable(Object id) {
        this.id = (String) id;
    }

    public Variable(Object id, Expressions expressions) {
        this.id =  (String) id;
        this.expressions = expressions;
    }


}
