/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini.pascal.compiler;

import java_cup.runtime.Symbol;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jorgecaballero
 */
public class SymTable {
    Map<String, String> m;
    SymTable padre;

    public SymTable(){
       this(null);
    }

    public SymTable(SymTable p) {
        m = new HashMap<String,String>();
        padre = p;
    }

    public boolean enter(String s, String e) {
        Object value = lookup(s);
        m.put(s, e);
        this.toString();
        return(value==null);
    }

    public String lookup(String s) {
        String value = m.get(s);
        if (value==null && padre!=null)
            value = padre.lookup(s);
        return value;
    }

    @Override
    public String toString() {    // for output with print
        StringBuilder res = new StringBuilder("Tabla de Simbolos\n=============\n");

        m.entrySet().forEach((entry) -> {
            res.append(entry.getKey()).append("\t\t").append(entry.getValue()).append("\n");
        });

        if (padre != null)
          res.append("++ predecessor!\n");

        return res.toString();
      }

      public int size() {
        return(m.size());
      }

}
