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
public class Params {
    Params params;
    Param param;

    public Params(Params params, Param param) {
        this.params = params;
        this.param = param;
    }

    public Params(Param param) {
        this.param = param;
    }
    
    
}
