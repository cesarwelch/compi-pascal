package abstree;

/**
 *
 * @author jorgecaballero
 */


import abstree.AbsVisitor;

/**
 * Rescripción de Records
 */
public class AbsRecordType extends AbsTypeExpr {

	/* Campos */
	public AbsDecls fields;

	public AbsRecordType(AbsDecls fields) {
		this.fields = fields;
	}

	public void accept(AbsVisitor visitor) {
		visitor.visit(this);
	}
        
        public String toString(){
            return "";
        }

}
