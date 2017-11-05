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
public class IndexRange {
    public int start;
    public int end;

    public IndexRange(Factor start, Factor end) {
    	if (start.type == "integer"){
    		if (end.type == "integer"){
    			this.start = Integer.parseInt(start.constant);
        		this.end = Integer.parseInt(end.constant);
    		}
    	}

    }


}
