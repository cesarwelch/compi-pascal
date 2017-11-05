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
public class Param {
    IdentifierList identifierList;
    Type type;
    Boolean isReference;

    public Param(IdentifierList identifierList, Type type, Boolean isReference) {
        this.identifierList = identifierList;
        this.type = type;
        this.isReference = isReference;
    }
    
    
}
