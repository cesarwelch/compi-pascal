package analysis;

/**
 *
 * @author cwelch
 */

import abstree.AbsDecl;
import abstree.AbsTree;
import java.util.*;


public class SemDesc {

	/** Visibility level. */
	private static HashMap<AbsTree, Integer> scope = new HashMap<AbsTree, Integer>();

	public static void setScope(AbsTree node, int nodeScope) {
		scope.put(node, new Integer(nodeScope));
	}

	public static Integer getScope(AbsTree node) {
		Integer nodeScope = scope.get(node);
		return nodeScope;
	}

	/** declaracion de nombres */
	private static HashMap<AbsTree, AbsDecl> nameDecl = new HashMap<AbsTree, AbsDecl>();

	public static void setNameDecl(AbsTree node, AbsDecl decl) {
		nameDecl.put(node, decl);
	}

	public static AbsDecl getNameDecl(AbsTree node) {
		AbsDecl decl = nameDecl.get(node);
		return decl;
	}

	/** las constantes de valor */
	private static HashMap<AbsTree, Integer> actualConst = new HashMap<AbsTree, Integer>();

	public static void setActualConst(AbsTree constDecl, Integer value) {
		SemDesc.actualConst.put(constDecl, value);
	}

	public static Integer getActualConst(AbsTree constDecl) {
		Integer value = SemDesc.actualConst.get(constDecl);
		return value;
	}

	/** Opis tipa. */
	private static HashMap<AbsTree, SemType> acturalType = new HashMap<AbsTree, SemType>();

	public static void setActualType(AbsTree node, SemType type) {
		SemDesc.acturalType.put(node, type);
	}

	public static SemType getActualType(AbsTree node) {
		SemType type = SemDesc.acturalType.get(node);
		return type;
	}

}
