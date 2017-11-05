/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini.pascal.compiler;

/**
 *
 * @author jorgecaballero
 */
public class CupGenerator {
    public static void main(String[] args) {
        String params[] = new String[5];
        
        params[0] = "-destdir";
        params[1] = "src/mini/pascal/compiler/";
        params[2] = "-parser";
        params[3] = "Parser";
        params[4] = "src/mini/pascal/compiler/Sintax.cup";
        try {
            java_cup.Main.main(params);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
