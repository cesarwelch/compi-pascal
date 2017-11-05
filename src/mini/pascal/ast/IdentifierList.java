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
public class IdentifierList {
    public ArrayList<String> ids;

    public IdentifierList() {
        ids = new ArrayList();
    }
    
    public void add_id(Object id){
        ids.add((String) id);
    }
    
    
}
