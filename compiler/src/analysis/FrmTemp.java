package analysis;

/**
 *
 * @author cwelch
 */

/** Declaracion de Temporales */
public class FrmTemp {

	private static int count = 0;

	private int num;

	public FrmTemp() {
		num = count++;
		System.out.println("Temp creado T"+num);
	}

	@Override
	public boolean equals(Object t) {
		return num == ((FrmTemp)t).num;
	}

	public String name() {
		return "T" + num;
	}

}
