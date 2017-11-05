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
public class Blocks {
    public Blocks blocks;
    public Block block;

    public Blocks(Blocks blocks, Block block) {
        this.blocks = blocks;
        this.block = block;
    }

    public Blocks(Block block) {
        this.block = block;
    }
   
}
