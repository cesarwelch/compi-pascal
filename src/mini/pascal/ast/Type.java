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
public class Type {
    public SimpleType stype;
    public ArrayType atype;

    public Type(ArrayType type) {
        this.atype = type;
        this.stype = null;
    }
    
    public Type(SimpleType type) {
        this.stype = type;
        this.atype = null;
    }
    
    public Object getType(){
        if (stype==null) {
            return (ArrayType) atype ;
        } else {
            return (SimpleType) stype;
        }
    }
    
}
