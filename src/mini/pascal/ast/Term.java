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
public class Term {
    public Factor factor;
    public String termOps;
    public Term term;
    public String type;

    public Term(Factor factor) {
        this.factor = factor;
    }

    public Term(Factor factor, String termOps, Term term) {
        this.factor = factor;
        this.termOps = termOps;
        this.term = term;
    }


}
