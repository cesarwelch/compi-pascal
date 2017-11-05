package analysis;

/**
 *
 * @author cwelch
 */

public class Report {

	/**
	 * Imprime una advertencia
	 *
	 * @param msg
	 *            warning.
	 */
	public static void warning(String msg) {
		System.err.println(msg);
	}

	/*
	 Warning generation
	 */
	public static void warning(String msg, int begLine, int begColumn) {
		System.err.println("At line " + begLine + " column " + begColumn + " -> " + msg);
	}

	/*
	Warnings
	 */
	public static void warning(String msg, int begLine, int begColumn,
			int endLine, int endColumn) {
		System.err.println("From line " + begLine + " column " + begColumn + " to line " + endLine
				+ " column " + endColumn + " -> " + msg);
	}

	/*
	 *Warnings
	 */
	public static void error(String msg, int exitCode) {
		System.err.println(msg);
		System.exit(exitCode);
	}

	/*
	Warnings
	 */
	public static void error(String msg, int begLine, int begColumn,
			int exitCode) {
		System.err.println("At line " + begLine + " column " + begColumn + " -> " + msg);
		System.exit(exitCode);
	}

	/*
	Warnings
	 */
	public static void error(String msg, int begLine, int begColumn,
			int endLine, int endColumn, int exitCode) {
		System.err.println("From line " + begLine + " column " + begColumn + " to line " + endLine
				+ " column " + endColumn + " -> " + msg);
		System.exit(exitCode);
	}
}
