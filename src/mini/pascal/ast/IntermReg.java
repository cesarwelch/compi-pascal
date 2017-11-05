/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini.pascal.ast;

import java.util.ArrayList;

/**
 *
 * @author jorgecaballero
 */
public class IntermReg {
    public String operator;
    public String arg1;
    public String arg2;
    public String result;

    public IntermReg(String operator, String arg1, String arg2, String result) {
        this.operator = operator;
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.result = result;
    }
    
    
}
