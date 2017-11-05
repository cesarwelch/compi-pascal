package analysis;

/**
 *
 * @author cwelch
 */

import abstree.AbsTree;
import java.util.*;


public class FrmDesc {

	/** Regristro de llamados */
	private static HashMap<AbsTree, FrmFrame> frames = new HashMap<AbsTree, FrmFrame>();

	public static void setFrame(AbsTree node, FrmFrame frame) {
		FrmDesc.frames.put(node, frame);
	}

	public static FrmFrame getFrame(AbsTree node) {
		return FrmDesc.frames.get(node);
	}

	/** Descripcion de acceso.*/
	private static HashMap<AbsTree, FrmAccess> acceses = new HashMap<AbsTree, FrmAccess>();

	public static void setAccess(AbsTree node, FrmAccess access) {
		FrmDesc.acceses.put(node, access);
	}

	public static FrmAccess getAccess(AbsTree node) {
		return FrmDesc.acceses.get(node);
	}

}
