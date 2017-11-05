package finalCode;

import analysis.FrmLabel;
import java.io.*;


public class ImcDataBlock extends ImcBlock {

	/** Etiqueta de la variable de memoria  */
	public FrmLabel label;

	/** Tamano de la variable en la memoria  */
	public int size;

	public ImcDataBlock(FrmLabel label, int size) {
		this.label = label;
		this.size = size;
	}
        
         @Override
        public String toString(){
            return "";
        }

	@Override
	public void toXML(PrintStream xml) {
		xml.print("<datachunk label=\"" + label.name() + "\" size=\"" + size + "\"/>\n");
		System.out.println(label.name() + " .word 0");
	}

}
