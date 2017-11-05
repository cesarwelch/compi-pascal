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
public class VariableDeclarationList extends Block{
    public ArrayList<VariableDeclaration> variableDeclarations;

    public VariableDeclarationList(VariableDeclaration vd) {
        variableDeclarations = new ArrayList<VariableDeclaration>();
        variableDeclarations.add(vd);
    }

    public VariableDeclarationList() {
        variableDeclarations = new ArrayList<VariableDeclaration>();
    }

    public void add_declaration(VariableDeclaration vd){
        variableDeclarations.add(vd);
    }

}
