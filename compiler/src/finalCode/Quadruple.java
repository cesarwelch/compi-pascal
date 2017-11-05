package finalCode;

import java.util.ArrayList;

/**
 *
 * @author jorgecaballero
 */
public class Quadruple {
    public ArrayList<QuadrupleTuple> tuples;

    public Quadruple() {
        tuples = new ArrayList<QuadrupleTuple>();
    }

    public void addTuple(QuadrupleTuple qt){
        tuples.add(qt);
    }

    public int getNextQuad(){
        return tuples.size() + 1;
    }

    public void complete(ArrayList<Integer> list, Integer m){
        for (int i = 0; i < list.size(); i++) {
            QuadrupleTuple tuple = tuples.get(list.get(i));
            if (tuple.operation == "GOTO") {
                tuple.argumentLeft = m.toString();
            }
            
            if (tuple.operation.startsWith("IF")) {
                tuple.res = m.toString();
            }
            
            tuples.set(list.get(i), tuple);
        }
    }

    public ArrayList<Integer> fusion(ArrayList<Integer> l1,ArrayList<Integer> l2){
        l1.removeAll(l2);
        l1.addAll(l2);
        return l1;
    }
    
    public ArrayList<Integer> createList(){
        return new ArrayList<Integer>();
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tuples.size(); i++) {
            sb.append(tuples.get(i).operation)
            .append("\t")
            .append(tuples.get(i).argumentLeft)
            .append("\t")
            .append(tuples.get(i).argumentRight)
            .append("\t")
            .append(tuples.get(i).res)
            .append("\n");
        }
        return sb.toString();
    }

}
