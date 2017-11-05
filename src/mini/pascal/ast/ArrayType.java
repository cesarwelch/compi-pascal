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
public class ArrayType {
    public int start;
    public int end;
    public SimpleType type;

    public ArrayType(int start, int end, SimpleType type) {
        this.start = start;
        this.end = end;
        this.type = type;
    }

    @Override
    public String toString(){
    	return "array[" + start + ".." + end + "] of "+  type.type;
    }

}
