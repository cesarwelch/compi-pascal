package analysis;

/**
 *
 * @author cwelch
 */

/** Declaracion de la etiquteas  */
public class FrmLabel {

	/** Nombrar Etiquetas  */
	private String name;

	private FrmLabel(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object l) {
		return name == ((FrmLabel)l).name;
	}

	/** return nombre de las etiquetas  */
	public String name() {
		return name;
	}

	private static int label_count = 0;

	/** contador de etiquetas */
	public static FrmLabel newLabel() {
		return new FrmLabel("L" + (label_count++));
	}

	/** nueva etiqueta  */
	public static FrmLabel newLabel(String name) {
		return new FrmLabel("_" + name);
	}

}
