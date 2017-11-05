
package analysis;

import analysis.Report;
import abstree.AbsWhileStmt;
import abstree.AbsValExprs;
import abstree.AbsVarDecl;
import abstree.AbsConstDecl;
import abstree.AbsCallExpr;
import abstree.AbsDecls;
import abstree.AbsStmt;
import abstree.AbsIfStmt;
import abstree.AbsAlloc;
import abstree.AbsUnExpr;
import abstree.AbsProcDecl;
import abstree.AbsStmts;
import abstree.AbsExprStmt;
import abstree.AbsAtomConst;
import abstree.AbsTypeExpr;
import abstree.QMarkStmt;
import abstree.AbsAtomType;
import abstree.AbsPointerType;
import abstree.AbsRecordType;
import abstree.AbsTypeName;
import abstree.AbsDeclName;
import abstree.AbsTypeDecl;
import abstree.AbsValName;
import abstree.AbsProgram;
import abstree.AbsBinExpr;
import abstree.AbsValExpr;
import abstree.AbsNilConst;
import abstree.AbsFunDecl;
import abstree.AbsDecl;
import abstree.AbsAssignStmt;
import abstree.VisibilityType;
import abstree.AbsBlockStmt;
import abstree.AbsArrayType;
import abstree.AbsForStmt;
import java_cup.runtime.*;
import java.util.*;


public class PascalSyn extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public PascalSyn() {super();}

  /** Constructor which sets the default scanner. */
  public PascalSyn(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public PascalSyn(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\122\000\002\002\004\000\002\002\010\000\002\003" +
    "\003\000\002\005\006\000\002\007\004\000\002\007\002" +
    "\000\002\012\007\000\002\012\002\000\002\010\004\000" +
    "\002\010\002\000\002\013\010\000\002\013\002\000\002" +
    "\031\003\000\002\031\003\000\002\031\002\000\002\011" +
    "\004\000\002\011\002\000\002\014\007\000\002\014\002" +
    "\000\002\006\004\000\002\006\004\000\002\006\002\000" +
    "\002\017\011\000\002\020\013\000\002\015\005\000\002" +
    "\016\006\000\002\016\007\000\002\016\002\000\002\004" +
    "\003\000\002\024\003\000\002\024\003\000\002\024\003" +
    "\000\002\024\003\000\002\024\003\000\002\024\005\000" +
    "\002\024\005\000\002\024\005\000\002\024\006\000\002" +
    "\024\005\000\002\024\005\000\002\024\005\000\002\024" +
    "\005\000\002\024\005\000\002\024\005\000\002\024\005" +
    "\000\002\024\005\000\002\024\005\000\002\024\005\000" +
    "\002\024\005\000\002\024\005\000\002\024\004\000\002" +
    "\024\004\000\002\024\004\000\002\024\004\000\002\024" +
    "\004\000\002\024\006\000\002\026\005\000\002\026\003" +
    "\000\002\026\002\000\002\025\005\000\002\025\003\000" +
    "\002\025\003\000\002\025\003\000\002\025\003\000\002" +
    "\025\012\000\002\025\005\000\002\025\004\000\002\027" +
    "\003\000\002\027\005\000\002\030\005\000\002\021\007" +
    "\000\002\021\003\000\002\022\005\000\002\022\004\000" +
    "\002\023\005\000\002\023\003\000\002\021\003\000\002" +
    "\021\005\000\002\021\006\000\002\021\012\000\002\021" +
    "\010\000\002\021\006" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\262\000\004\063\005\001\002\000\004\002\264\001" +
    "\002\000\004\010\007\001\002\000\004\024\010\001\002" +
    "\000\012\014\uffff\021\uffff\024\uffff\030\uffff\001\002\000" +
    "\016\051\ufffc\052\011\057\ufffc\062\ufffc\067\ufffc\070\ufffc" +
    "\001\002\000\016\010\ufffa\051\ufffa\057\ufffa\062\ufffa\067" +
    "\ufffa\070\ufffa\001\002\000\014\051\ufff1\057\ufff1\062\ufff1" +
    "\067\202\070\ufff1\001\002\000\004\051\015\001\002\000" +
    "\004\016\200\001\002\000\042\004\025\005\041\006\032" +
    "\007\030\010\023\020\027\021\033\025\034\040\021\042" +
    "\017\043\031\051\015\055\022\056\036\060\026\071\020" +
    "\001\002\000\074\014\uffe0\015\uffe0\016\uffe0\017\uffe0\020" +
    "\uffe0\021\172\022\uffe0\023\uffe0\024\uffe0\025\uffe0\026\uffe0" +
    "\027\uffe0\030\uffe0\031\uffe0\032\uffe0\033\uffe0\034\uffe0\036" +
    "\uffe0\037\uffe0\041\uffe0\042\uffe0\043\uffe0\050\uffe0\053\uffe0" +
    "\054\uffe0\055\uffe0\065\uffe0\066\uffe0\074\uffe0\001\002\000" +
    "\030\004\025\005\041\006\032\007\030\010\023\020\027" +
    "\021\033\025\034\040\021\042\017\043\031\001\002\000" +
    "\030\004\025\005\041\006\032\007\030\010\023\020\027" +
    "\021\033\025\034\040\021\042\017\043\031\001\002\000" +
    "\030\004\025\005\041\006\032\007\030\010\023\020\027" +
    "\021\033\025\034\040\021\042\017\043\031\001\002\000" +
    "\014\014\uffb8\016\uffb8\024\uffb8\054\uffb8\055\uffb8\001\002" +
    "\000\074\014\uffe5\015\uffe5\016\uffe5\017\uffe5\020\uffe5\021" +
    "\uffe5\022\uffe5\023\uffe5\024\uffe5\025\uffe5\026\uffe5\027\uffe5" +
    "\030\uffe5\031\uffe5\032\uffe5\033\uffe5\034\uffe5\036\uffe5\037" +
    "\uffe5\041\uffe5\042\uffe5\043\uffe5\050\uffe5\053\uffe5\054\uffe5" +
    "\055\uffe5\065\uffe5\066\uffe5\074\uffe5\001\002\000\006\024" +
    "\162\055\163\001\002\000\072\014\uffe3\015\uffe3\016\uffe3" +
    "\017\uffe3\020\uffe3\022\uffe3\023\uffe3\024\uffe3\025\uffe3\026" +
    "\uffe3\027\uffe3\030\uffe3\031\uffe3\032\uffe3\033\uffe3\034\uffe3" +
    "\036\uffe3\037\uffe3\041\uffe3\042\uffe3\043\uffe3\050\uffe3\053" +
    "\uffe3\054\uffe3\055\uffe3\065\uffe3\066\uffe3\074\uffe3\001\002" +
    "\000\030\004\025\005\041\006\032\007\030\010\023\020" +
    "\027\021\033\025\034\040\021\042\017\043\031\001\002" +
    "\000\022\010\130\011\123\012\131\013\121\021\122\042" +
    "\127\047\124\064\126\001\002\000\072\014\uffe1\015\uffe1" +
    "\016\uffe1\017\uffe1\020\uffe1\022\uffe1\023\uffe1\024\uffe1\025" +
    "\uffe1\026\uffe1\027\uffe1\030\uffe1\031\uffe1\032\uffe1\033\uffe1" +
    "\034\uffe1\036\uffe1\037\uffe1\041\uffe1\042\uffe1\043\uffe1\050" +
    "\uffe1\053\uffe1\054\uffe1\055\uffe1\065\uffe1\066\uffe1\074\uffe1" +
    "\001\002\000\030\004\025\005\041\006\032\007\030\010" +
    "\023\020\027\021\033\025\034\040\021\042\017\043\031" +
    "\001\002\000\072\014\uffe4\015\uffe4\016\uffe4\017\uffe4\020" +
    "\uffe4\022\uffe4\023\uffe4\024\uffe4\025\uffe4\026\uffe4\027\uffe4" +
    "\030\uffe4\031\uffe4\032\uffe4\033\uffe4\034\uffe4\036\uffe4\037" +
    "\uffe4\041\uffe4\042\uffe4\043\uffe4\050\uffe4\053\uffe4\054\uffe4" +
    "\055\uffe4\065\uffe4\066\uffe4\074\uffe4\001\002\000\030\004" +
    "\025\005\041\006\032\007\030\010\023\020\027\021\033" +
    "\025\034\040\021\042\017\043\031\001\002\000\030\004" +
    "\025\005\041\006\032\007\030\010\023\020\027\021\033" +
    "\025\034\040\021\042\017\043\031\001\002\000\054\014" +
    "\uffba\016\056\020\062\024\uffba\025\053\026\045\027\057" +
    "\030\047\031\061\032\046\033\064\034\050\036\060\037" +
    "\052\041\063\042\055\043\054\050\110\054\uffba\055\uffba" +
    "\074\107\001\002\000\004\010\042\001\002\000\012\014" +
    "\uffb5\024\uffb5\054\uffb5\055\uffb5\001\002\000\006\024\uffb6" +
    "\055\uffb6\001\002\000\072\014\uffe2\015\uffe2\016\uffe2\017" +
    "\uffe2\020\uffe2\022\uffe2\023\uffe2\024\uffe2\025\uffe2\026\uffe2" +
    "\027\uffe2\030\uffe2\031\uffe2\032\uffe2\033\uffe2\034\uffe2\036" +
    "\uffe2\037\uffe2\041\uffe2\042\uffe2\043\uffe2\050\uffe2\053\uffe2" +
    "\054\uffe2\055\uffe2\065\uffe2\066\uffe2\074\uffe2\001\002\000" +
    "\004\050\043\001\002\000\030\004\025\005\041\006\032" +
    "\007\030\010\023\020\027\021\033\025\034\040\021\042" +
    "\017\043\031\001\002\000\042\016\056\020\062\025\053" +
    "\026\045\027\057\030\047\031\061\032\046\033\064\034" +
    "\050\036\060\037\052\041\063\042\055\043\054\066\051" +
    "\001\002\000\030\004\025\005\041\006\032\007\030\010" +
    "\023\020\027\021\033\025\034\040\021\042\017\043\031" +
    "\001\002\000\030\004\025\005\041\006\032\007\030\010" +
    "\023\020\027\021\033\025\034\040\021\042\017\043\031" +
    "\001\002\000\030\004\025\005\041\006\032\007\030\010" +
    "\023\020\027\021\033\025\034\040\021\042\017\043\031" +
    "\001\002\000\030\004\025\005\041\006\032\007\030\010" +
    "\023\020\027\021\033\025\034\040\021\042\017\043\031" +
    "\001\002\000\030\004\025\005\041\006\032\007\030\010" +
    "\023\020\027\021\033\025\034\040\021\042\017\043\031" +
    "\001\002\000\030\004\025\005\041\006\032\007\030\010" +
    "\023\020\027\021\033\025\034\040\021\042\017\043\031" +
    "\001\002\000\030\004\025\005\041\006\032\007\030\010" +
    "\023\020\027\021\033\025\034\040\021\042\017\043\031" +
    "\001\002\000\030\004\025\005\041\006\032\007\030\010" +
    "\023\020\027\021\033\025\034\040\021\042\017\043\031" +
    "\001\002\000\072\014\uffcb\015\uffcb\016\uffcb\017\uffcb\020" +
    "\uffcb\022\uffcb\023\uffcb\024\uffcb\025\uffcb\026\uffcb\027\uffcb" +
    "\030\uffcb\031\uffcb\032\uffcb\033\uffcb\034\uffcb\036\uffcb\037" +
    "\uffcb\041\uffcb\042\uffcb\043\uffcb\050\uffcb\053\uffcb\054\uffcb" +
    "\055\uffcb\065\uffcb\066\uffcb\074\uffcb\001\002\000\004\010" +
    "\023\001\002\000\030\004\025\005\041\006\032\007\030" +
    "\010\023\020\027\021\033\025\034\040\021\042\017\043" +
    "\031\001\002\000\030\004\025\005\041\006\032\007\030" +
    "\010\023\020\027\021\033\025\034\040\021\042\017\043" +
    "\031\001\002\000\030\004\025\005\041\006\032\007\030" +
    "\010\023\020\027\021\033\025\034\040\021\042\017\043" +
    "\031\001\002\000\030\004\025\005\041\006\032\007\030" +
    "\010\023\020\027\021\033\025\034\040\021\042\017\043" +
    "\031\001\002\000\030\004\025\005\041\006\032\007\030" +
    "\010\023\020\027\021\033\025\034\040\021\042\017\043" +
    "\031\001\002\000\030\004\025\005\041\006\032\007\030" +
    "\010\023\020\027\021\033\025\034\040\021\042\017\043" +
    "\031\001\002\000\056\014\uffd3\015\uffd3\016\056\017\uffd3" +
    "\020\062\022\uffd3\023\uffd3\024\uffd3\025\053\026\uffd3\027" +
    "\057\036\060\041\uffd3\042\uffd3\043\054\050\uffd3\053\uffd3" +
    "\054\uffd3\055\uffd3\065\uffd3\066\uffd3\074\uffd3\001\002\000" +
    "\072\014\uffd0\015\uffd0\016\056\017\uffd0\020\062\022\uffd0" +
    "\023\uffd0\024\uffd0\025\053\026\045\027\057\030\047\031" +
    "\061\032\046\033\064\034\050\036\060\037\052\041\uffd0" +
    "\042\uffd0\043\054\050\uffd0\053\uffd0\054\uffd0\055\uffd0\065" +
    "\uffd0\066\uffd0\074\uffd0\001\002\000\042\016\056\020\062" +
    "\022\070\025\053\026\045\027\057\030\047\031\061\032" +
    "\046\033\064\034\050\036\060\037\052\041\063\042\055" +
    "\043\054\001\002\000\072\014\uffdc\015\uffdc\016\uffdc\017" +
    "\uffdc\020\uffdc\022\uffdc\023\uffdc\024\uffdc\025\uffdc\026\uffdc" +
    "\027\uffdc\030\uffdc\031\uffdc\032\uffdc\033\uffdc\034\uffdc\036" +
    "\uffdc\037\uffdc\041\uffdc\042\uffdc\043\uffdc\050\uffdc\053\uffdc" +
    "\054\uffdc\055\uffdc\065\uffdc\066\uffdc\074\uffdc\001\002\000" +
    "\056\014\uffd2\015\uffd2\016\056\017\uffd2\020\062\022\uffd2" +
    "\023\uffd2\024\uffd2\025\053\026\uffd2\027\057\036\060\041" +
    "\uffd2\042\uffd2\043\054\050\uffd2\053\uffd2\054\uffd2\055\uffd2" +
    "\065\uffd2\066\uffd2\074\uffd2\001\002\000\072\014\uffdb\015" +
    "\uffdb\016\056\017\uffdb\020\062\022\uffdb\023\uffdb\024\uffdb" +
    "\025\uffdb\026\uffdb\027\uffdb\030\uffdb\031\uffdb\032\uffdb\033" +
    "\uffdb\034\uffdb\036\uffdb\037\uffdb\041\uffdb\042\uffdb\043\uffdb" +
    "\050\uffdb\053\uffdb\054\uffdb\055\uffdb\065\uffdb\066\uffdb\074" +
    "\uffdb\001\002\000\072\014\uffda\015\uffda\016\056\017\uffda" +
    "\020\062\022\uffda\023\uffda\024\uffda\025\uffda\026\uffda\027" +
    "\uffda\030\uffda\031\uffda\032\uffda\033\uffda\034\uffda\036\uffda" +
    "\037\uffda\041\uffda\042\uffda\043\uffda\050\uffda\053\uffda\054" +
    "\uffda\055\uffda\065\uffda\066\uffda\074\uffda\001\002\000\072" +
    "\014\uffde\015\uffde\016\uffde\017\uffde\020\uffde\022\uffde\023" +
    "\uffde\024\uffde\025\uffde\026\uffde\027\uffde\030\uffde\031\uffde" +
    "\032\uffde\033\uffde\034\uffde\036\uffde\037\uffde\041\uffde\042" +
    "\uffde\043\uffde\050\uffde\053\uffde\054\uffde\055\uffde\065\uffde" +
    "\066\uffde\074\uffde\001\002\000\072\014\uffd8\015\uffd8\016" +
    "\056\017\uffd8\020\062\022\uffd8\023\uffd8\024\uffd8\025\uffd8" +
    "\026\uffd8\027\057\030\uffd8\031\uffd8\032\uffd8\033\uffd8\034" +
    "\uffd8\036\060\037\uffd8\041\uffd8\042\uffd8\043\uffd8\050\uffd8" +
    "\053\uffd8\054\uffd8\055\uffd8\065\uffd8\066\uffd8\074\uffd8\001" +
    "\002\000\072\014\uffd9\015\uffd9\016\056\017\uffd9\020\062" +
    "\022\uffd9\023\uffd9\024\uffd9\025\uffd9\026\uffd9\027\057\030" +
    "\uffd9\031\uffd9\032\uffd9\033\uffd9\034\uffd9\036\060\037\uffd9" +
    "\041\uffd9\042\uffd9\043\uffd9\050\uffd9\053\uffd9\054\uffd9\055" +
    "\uffd9\065\uffd9\066\uffd9\074\uffd9\001\002\000\056\014\uffd6" +
    "\015\uffd6\016\056\017\uffd6\020\062\022\uffd6\023\uffd6\024" +
    "\uffd6\025\053\026\uffd6\027\057\036\060\041\uffd6\042\uffd6" +
    "\043\054\050\uffd6\053\uffd6\054\uffd6\055\uffd6\065\uffd6\066" +
    "\uffd6\074\uffd6\001\002\000\042\016\056\020\062\025\053" +
    "\026\045\027\057\030\047\031\061\032\046\033\064\034" +
    "\050\036\060\037\052\041\063\042\055\043\054\053\101" +
    "\001\002\000\040\004\025\005\041\006\032\007\030\010" +
    "\023\020\027\021\033\025\034\040\021\042\017\043\031" +
    "\051\015\056\036\060\026\071\020\001\002\000\012\014" +
    "\uffb2\024\uffb2\054\uffb2\055\uffb2\001\002\000\056\014\uffd5" +
    "\015\uffd5\016\056\017\uffd5\020\062\022\uffd5\023\uffd5\024" +
    "\uffd5\025\053\026\uffd5\027\057\036\060\041\uffd5\042\uffd5" +
    "\043\054\050\uffd5\053\uffd5\054\uffd5\055\uffd5\065\uffd5\066" +
    "\uffd5\074\uffd5\001\002\000\056\014\uffd7\015\uffd7\016\056" +
    "\017\uffd7\020\062\022\uffd7\023\uffd7\024\uffd7\025\053\026" +
    "\uffd7\027\057\036\060\041\uffd7\042\uffd7\043\054\050\uffd7" +
    "\053\uffd7\054\uffd7\055\uffd7\065\uffd7\066\uffd7\074\uffd7\001" +
    "\002\000\056\014\uffd4\015\uffd4\016\056\017\uffd4\020\062" +
    "\022\uffd4\023\uffd4\024\uffd4\025\053\026\uffd4\027\057\036" +
    "\060\041\uffd4\042\uffd4\043\054\050\uffd4\053\uffd4\054\uffd4" +
    "\055\uffd4\065\uffd4\066\uffd4\074\uffd4\001\002\000\072\014" +
    "\uffd1\015\uffd1\016\056\017\uffd1\020\062\022\uffd1\023\uffd1" +
    "\024\uffd1\025\053\026\uffd1\027\057\030\047\031\061\032" +
    "\046\033\064\034\050\036\060\037\052\041\uffd1\042\uffd1" +
    "\043\054\050\uffd1\053\uffd1\054\uffd1\055\uffd1\065\uffd1\066" +
    "\uffd1\074\uffd1\001\002\000\040\004\025\005\041\006\032" +
    "\007\030\010\023\020\027\021\033\025\034\040\021\042" +
    "\017\043\031\051\015\056\036\060\026\071\020\001\002" +
    "\000\030\004\025\005\041\006\032\007\030\010\023\020" +
    "\027\021\033\025\034\040\021\042\017\043\031\001\002" +
    "\000\050\014\uffb4\016\056\020\062\024\uffb4\025\053\026" +
    "\045\027\057\030\047\031\061\032\046\033\064\034\050" +
    "\036\060\037\052\041\063\042\055\043\054\054\uffb4\055" +
    "\uffb4\001\002\000\004\014\113\001\002\000\040\004\025" +
    "\005\041\006\032\007\030\010\023\020\027\021\033\025" +
    "\034\040\021\042\017\043\031\051\015\056\036\060\026" +
    "\071\020\001\002\000\012\014\uffbb\024\uffbb\054\uffbb\055" +
    "\uffbb\001\002\000\072\014\uffce\015\uffce\016\056\017\uffce" +
    "\020\062\022\uffce\023\uffce\024\uffce\025\uffce\026\uffce\027" +
    "\uffce\030\uffce\031\uffce\032\uffce\033\uffce\034\uffce\036\uffce" +
    "\037\uffce\041\uffce\042\uffce\043\uffce\050\uffce\053\uffce\054" +
    "\uffce\055\uffce\065\uffce\066\uffce\074\uffce\001\002\000\042" +
    "\016\056\020\062\023\117\025\053\026\045\027\057\030" +
    "\047\031\061\032\046\033\064\034\050\036\060\037\052" +
    "\041\063\042\055\043\054\001\002\000\072\014\uffdf\015" +
    "\uffdf\016\uffdf\017\uffdf\020\uffdf\022\uffdf\023\uffdf\024\uffdf" +
    "\025\uffdf\026\uffdf\027\uffdf\030\uffdf\031\uffdf\032\uffdf\033" +
    "\uffdf\034\uffdf\036\uffdf\037\uffdf\041\uffdf\042\uffdf\043\uffdf" +
    "\050\uffdf\053\uffdf\054\uffdf\055\uffdf\065\uffdf\066\uffdf\074" +
    "\uffdf\001\002\000\072\014\uffcd\015\uffcd\016\056\017\uffcd" +
    "\020\062\022\uffcd\023\uffcd\024\uffcd\025\uffcd\026\uffcd\027" +
    "\uffcd\030\uffcd\031\uffcd\032\uffcd\033\uffcd\034\uffcd\036\uffcd" +
    "\037\uffcd\041\uffcd\042\uffcd\043\uffcd\050\uffcd\053\uffcd\054" +
    "\uffcd\055\uffcd\065\uffcd\066\uffcd\074\uffcd\001\002\000\014" +
    "\010\uffc3\022\uffc3\023\uffc3\024\uffc3\055\uffc3\001\002\000" +
    "\022\010\130\011\123\012\131\013\121\021\122\042\127" +
    "\047\124\064\126\001\002\000\014\010\uffc5\022\uffc5\023" +
    "\uffc5\024\uffc5\055\uffc5\001\002\000\004\020\144\001\002" +
    "\000\004\022\143\001\002\000\004\010\007\001\002\000" +
    "\022\010\130\011\123\012\131\013\121\021\122\042\127" +
    "\047\124\064\126\001\002\000\014\010\uffc2\022\uffc2\023" +
    "\uffc2\024\uffc2\055\uffc2\001\002\000\014\010\uffc4\022\uffc4" +
    "\023\uffc4\024\uffc4\055\uffc4\001\002\000\014\010\uffbf\022" +
    "\uffbf\023\uffbf\024\uffbf\055\uffbf\001\002\000\004\014\141" +
    "\001\002\000\006\024\136\055\137\001\002\000\006\024" +
    "\uffbe\055\uffbe\001\002\000\004\010\007\001\002\000\014" +
    "\010\uffc0\022\uffc0\023\uffc0\024\uffc0\055\uffc0\001\002\000" +
    "\006\024\uffbd\055\uffbd\001\002\000\022\010\130\011\123" +
    "\012\131\013\121\021\122\042\127\047\124\064\126\001" +
    "\002\000\006\024\uffbc\055\uffbc\001\002\000\072\014\uffdd" +
    "\015\uffdd\016\uffdd\017\uffdd\020\uffdd\022\uffdd\023\uffdd\024" +
    "\uffdd\025\uffdd\026\uffdd\027\uffdd\030\uffdd\031\uffdd\032\uffdd" +
    "\033\uffdd\034\uffdd\036\uffdd\037\uffdd\041\uffdd\042\uffdd\043" +
    "\uffdd\050\uffdd\053\uffdd\054\uffdd\055\uffdd\065\uffdd\066\uffdd" +
    "\074\uffdd\001\002\000\030\004\025\005\041\006\032\007" +
    "\030\010\023\020\027\021\033\025\034\040\021\042\017" +
    "\043\031\001\002\000\042\016\056\017\146\020\062\025" +
    "\053\026\045\027\057\030\047\031\061\032\046\033\064" +
    "\034\050\036\060\037\052\041\063\042\055\043\054\001" +
    "\002\000\030\004\025\005\041\006\032\007\030\010\023" +
    "\020\027\021\033\025\034\040\021\042\017\043\031\001" +
    "\002\000\042\016\056\020\062\022\150\025\053\026\045" +
    "\027\057\030\047\031\061\032\046\033\064\034\050\036" +
    "\060\037\052\041\063\042\055\043\054\001\002\000\004" +
    "\061\151\001\002\000\022\010\130\011\123\012\131\013" +
    "\121\021\122\042\127\047\124\064\126\001\002\000\014" +
    "\010\uffc1\022\uffc1\023\uffc1\024\uffc1\055\uffc1\001\002\000" +
    "\004\023\154\001\002\000\014\010\uffc6\022\uffc6\023\uffc6" +
    "\024\uffc6\055\uffc6\001\002\000\042\016\056\020\062\025" +
    "\053\026\045\027\057\030\047\031\061\032\046\033\064" +
    "\034\050\036\060\037\052\041\063\042\055\043\054\065" +
    "\156\001\002\000\040\004\025\005\041\006\032\007\030" +
    "\010\023\020\027\021\033\025\034\040\021\042\017\043" +
    "\031\051\015\056\036\060\026\071\020\001\002\000\012" +
    "\014\uffb0\024\uffb0\054\160\055\uffb0\001\002\000\040\004" +
    "\025\005\041\006\032\007\030\010\023\020\027\021\033" +
    "\025\034\040\021\042\017\043\031\051\015\056\036\060" +
    "\026\071\020\001\002\000\012\014\uffb1\024\uffb1\054\uffb1" +
    "\055\uffb1\001\002\000\040\004\025\005\041\006\032\007" +
    "\030\010\023\020\027\021\033\025\034\040\021\042\017" +
    "\043\031\051\015\056\036\060\026\071\020\001\002\000" +
    "\014\014\uffb9\016\uffb9\024\uffb9\054\uffb9\055\uffb9\001\002" +
    "\000\006\024\uffb7\055\uffb7\001\002\000\072\014\uffcf\015" +
    "\uffcf\016\056\017\uffcf\020\062\022\uffcf\023\uffcf\024\uffcf" +
    "\025\uffcf\026\uffcf\027\uffcf\030\uffcf\031\uffcf\032\uffcf\033" +
    "\uffcf\034\uffcf\036\uffcf\037\uffcf\041\uffcf\042\uffcf\043\uffcf" +
    "\050\uffcf\053\uffcf\054\uffcf\055\uffcf\065\uffcf\066\uffcf\074" +
    "\uffcf\001\002\000\042\016\056\020\062\025\053\026\045" +
    "\027\057\030\047\031\061\032\046\033\064\034\050\036" +
    "\060\037\052\041\063\042\055\043\054\053\167\001\002" +
    "\000\040\004\025\005\041\006\032\007\030\010\023\020" +
    "\027\021\033\025\034\040\021\042\017\043\031\051\015" +
    "\056\036\060\026\071\020\001\002\000\012\014\uffb3\024" +
    "\uffb3\054\uffb3\055\uffb3\001\002\000\072\014\uffcc\015\uffcc" +
    "\016\056\017\uffcc\020\062\022\uffcc\023\uffcc\024\uffcc\025" +
    "\uffcc\026\uffcc\027\uffcc\030\uffcc\031\uffcc\032\uffcc\033\uffcc" +
    "\034\uffcc\036\uffcc\037\uffcc\041\uffcc\042\uffcc\043\uffcc\050" +
    "\uffcc\053\uffcc\054\uffcc\055\uffcc\065\uffcc\066\uffcc\074\uffcc" +
    "\001\002\000\034\004\025\005\041\006\032\007\030\010" +
    "\023\015\uffc7\020\027\021\033\023\uffc7\025\034\040\021" +
    "\042\017\043\031\001\002\000\006\015\175\023\176\001" +
    "\002\000\044\015\uffc8\016\056\020\062\023\uffc8\025\053" +
    "\026\045\027\057\030\047\031\061\032\046\033\064\034" +
    "\050\036\060\037\052\041\063\042\055\043\054\001\002" +
    "\000\030\004\025\005\041\006\032\007\030\010\023\020" +
    "\027\021\033\025\034\040\021\042\017\043\031\001\002" +
    "\000\072\014\uffca\015\uffca\016\uffca\017\uffca\020\uffca\022" +
    "\uffca\023\uffca\024\uffca\025\uffca\026\uffca\027\uffca\030\uffca" +
    "\031\uffca\032\uffca\033\uffca\034\uffca\036\uffca\037\uffca\041" +
    "\uffca\042\uffca\043\uffca\050\uffca\053\uffca\054\uffca\055\uffca" +
    "\065\uffca\066\uffca\074\uffca\001\002\000\044\015\uffc9\016" +
    "\056\020\062\023\uffc9\025\053\026\045\027\057\030\047" +
    "\031\061\032\046\033\064\034\050\036\060\037\052\041" +
    "\063\042\055\043\054\001\002\000\004\002\000\001\002" +
    "\000\012\051\ufff8\057\ufff8\062\ufff8\070\210\001\002\000" +
    "\014\010\uffef\051\uffef\057\uffef\062\uffef\070\uffef\001\002" +
    "\000\014\010\007\051\ufff2\057\ufff2\062\ufff2\070\ufff2\001" +
    "\002\000\004\030\205\001\002\000\022\010\130\011\123" +
    "\012\131\013\121\021\122\042\127\047\124\064\126\001" +
    "\002\000\004\024\207\001\002\000\014\010\ufff0\051\ufff0" +
    "\057\ufff0\062\ufff0\070\ufff0\001\002\000\012\010\ufff6\051" +
    "\ufff6\057\ufff6\062\ufff6\001\002\000\010\051\uffec\057\uffec" +
    "\062\uffec\001\002\000\010\051\ufffe\057\215\062\213\001" +
    "\002\000\004\010\007\001\002\000\010\051\uffed\057\uffed" +
    "\062\uffed\001\002\000\004\010\007\001\002\000\010\051" +
    "\uffee\057\uffee\062\uffee\001\002\000\004\021\221\001\002" +
    "\000\004\014\233\001\002\000\010\010\uffe6\023\uffe6\024" +
    "\uffe6\001\002\000\010\010\007\023\225\024\224\001\002" +
    "\000\004\014\231\001\002\000\004\010\007\001\002\000" +
    "\006\014\uffe9\024\uffe9\001\002\000\004\014\227\001\002" +
    "\000\022\010\130\011\123\012\131\013\121\021\122\042" +
    "\127\047\124\064\126\001\002\000\010\010\uffe7\023\uffe7" +
    "\024\uffe7\001\002\000\022\010\130\011\123\012\131\013" +
    "\121\021\122\042\127\047\124\064\126\001\002\000\010" +
    "\010\uffe8\023\uffe8\024\uffe8\001\002\000\022\010\130\011" +
    "\123\012\131\013\121\021\122\042\127\047\124\064\126" +
    "\001\002\000\004\024\235\001\002\000\016\051\ufffc\052" +
    "\011\057\ufffc\062\ufffc\067\ufffc\070\ufffc\001\002\000\004" +
    "\051\015\001\002\000\004\024\240\001\002\000\010\051" +
    "\uffea\057\uffea\062\uffea\001\002\000\004\021\221\001\002" +
    "\000\004\024\243\001\002\000\016\051\ufffc\052\011\057" +
    "\ufffc\062\ufffc\067\ufffc\070\ufffc\001\002\000\004\051\015" +
    "\001\002\000\004\024\246\001\002\000\010\051\uffeb\057" +
    "\uffeb\062\uffeb\001\002\000\012\010\007\051\ufff9\057\ufff9" +
    "\062\ufff9\001\002\000\004\014\251\001\002\000\026\010" +
    "\ufff3\011\ufff3\012\ufff3\013\ufff3\021\ufff3\042\ufff3\047\ufff3" +
    "\064\ufff3\072\254\073\253\001\002\000\022\010\130\011" +
    "\123\012\131\013\121\021\122\042\127\047\124\064\126" +
    "\001\002\000\022\010\ufff4\011\ufff4\012\ufff4\013\ufff4\021" +
    "\ufff4\042\ufff4\047\ufff4\064\ufff4\001\002\000\022\010\ufff5" +
    "\011\ufff5\012\ufff5\013\ufff5\021\ufff5\042\ufff5\047\ufff5\064" +
    "\ufff5\001\002\000\004\024\256\001\002\000\012\010\ufff7" +
    "\051\ufff7\057\ufff7\062\ufff7\001\002\000\016\010\007\051" +
    "\ufffd\057\ufffd\062\ufffd\067\ufffd\070\ufffd\001\002\000\004" +
    "\030\261\001\002\000\030\004\025\005\041\006\032\007" +
    "\030\010\023\020\027\021\033\025\034\040\021\042\017" +
    "\043\031\001\002\000\042\016\056\020\062\024\263\025" +
    "\053\026\045\027\057\030\047\031\061\032\046\033\064" +
    "\034\050\036\060\037\052\041\063\042\055\043\054\001" +
    "\002\000\016\010\ufffb\051\ufffb\057\ufffb\062\ufffb\067\ufffb" +
    "\070\ufffb\001\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\262\000\004\002\003\001\001\000\002\001\001\000" +
    "\004\003\005\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\005\012\007\011\001\001\000\004\012\256\001" +
    "\001\000\004\011\200\001\001\000\004\022\013\001\001" +
    "\000\002\001\001\000\014\004\015\021\037\022\036\023" +
    "\023\024\034\001\001\000\002\001\001\000\006\004\015" +
    "\024\170\001\001\000\006\004\015\024\165\001\001\000" +
    "\006\004\015\024\164\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\006\004" +
    "\015\024\154\001\001\000\004\025\124\001\001\000\002" +
    "\001\001\000\006\004\015\024\117\001\001\000\002\001" +
    "\001\000\006\004\015\024\115\001\001\000\006\004\015" +
    "\024\114\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\004\015\024\043\001\001\000\002\001" +
    "\001\000\006\004\015\024\105\001\001\000\006\004\015" +
    "\024\104\001\001\000\006\004\015\024\103\001\001\000" +
    "\006\004\015\024\102\001\001\000\006\004\015\024\077" +
    "\001\001\000\006\004\015\024\076\001\001\000\006\004" +
    "\015\024\075\001\001\000\006\004\015\024\074\001\001" +
    "\000\002\001\001\000\004\004\073\001\001\000\006\004" +
    "\015\024\072\001\001\000\006\004\015\024\071\001\001" +
    "\000\006\004\015\024\070\001\001\000\006\004\015\024" +
    "\066\001\001\000\006\004\015\024\065\001\001\000\006" +
    "\004\015\024\064\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\012\004\015\021\101\022\036\024\034\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\012\004\015\021" +
    "\111\022\036\024\034\001\001\000\006\004\015\024\110" +
    "\001\001\000\002\001\001\000\002\001\001\000\012\004" +
    "\015\021\113\022\036\024\034\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\025\152\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\010\003\132\027\133\030\134\001\001\000\004\025\131" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\003\132\030\137\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\025\141\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\004\015\024\144\001\001\000" +
    "\002\001\001\000\006\004\015\024\146\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\025\151\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\012\004\015\021\156\022\036\024\034\001" +
    "\001\000\002\001\001\000\012\004\015\021\160\022\036" +
    "\024\034\001\001\000\002\001\001\000\012\004\015\021" +
    "\163\022\036\024\034\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\012\004" +
    "\015\021\167\022\036\024\034\001\001\000\002\001\001" +
    "\000\002\001\001\000\010\004\015\024\173\026\172\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\004\015" +
    "\024\176\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\010\210\001\001\000\004\014\202" +
    "\001\001\000\004\003\203\001\001\000\002\001\001\000" +
    "\004\025\205\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\013\246\001\001\000\004\006\211\001\001\000" +
    "\006\017\215\020\213\001\001\000\004\003\240\001\001" +
    "\000\002\001\001\000\004\003\216\001\001\000\002\001" +
    "\001\000\004\015\217\001\001\000\002\001\001\000\004" +
    "\016\221\001\001\000\004\003\222\001\001\000\002\001" +
    "\001\000\004\003\225\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\025\227\001\001\000\002\001\001\000" +
    "\004\025\231\001\001\000\002\001\001\000\004\025\233" +
    "\001\001\000\002\001\001\000\006\005\235\007\011\001" +
    "\001\000\004\022\236\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\015\241\001\001\000\002\001\001\000" +
    "\006\005\243\007\011\001\001\000\004\022\244\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\003\247\001" +
    "\001\000\002\001\001\000\004\031\251\001\001\000\004" +
    "\025\254\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\003\257\001\001" +
    "\000\002\001\001\000\006\004\015\024\261\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$PascalSyn$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$PascalSyn$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$PascalSyn$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



        public void syntax_error(Symbol cur_token) {
            Report.warning ("Syntax error near word '" + (String)(cur_token.value) + "'.", cur_token.left, cur_token.right);
        }
        
        public void report_error(String message, Object info) {
        }
        
        public void report_fatal_error(String message, Object info) throws Exception {
        	throw new Exception(message);
        }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$PascalSyn$actions {
  private final PascalSyn parser;

  /** Constructor */
  CUP$PascalSyn$actions(PascalSyn parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$PascalSyn$do_action(
    int                        CUP$PascalSyn$act_num,
    java_cup.runtime.lr_parser CUP$PascalSyn$parser,
    java.util.Stack            CUP$PascalSyn$stack,
    int                        CUP$PascalSyn$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$PascalSyn$result;

      /* select the action based on the action number */
      switch (CUP$PascalSyn$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 81: // stmt ::= IF expr_value THEN stmt 
            {
              AbsStmt RESULT =null;
		int begleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-3)).left;
		int begright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-3)).right;
		Object beg = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-3)).value;
		int condleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).left;
		int condright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).right;
		AbsValExpr cond = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).value;
		int thenStmtleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int thenStmtright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsStmt thenStmt = (AbsStmt)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
	   			AbsIfStmt ifs = new AbsIfStmt((AbsValExpr) cond, thenStmt, (new AbsBlockStmt(new AbsStmts())));
				ifs.setBeg(beg.toString(), begleft, begright);
				ifs.setEnd(thenStmt);
				RESULT = ifs;
	   		
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("stmt",15, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-3)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 80: // stmt ::= IF expr_value THEN stmt ELSE stmt 
            {
              AbsStmt RESULT =null;
		int begleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-5)).left;
		int begright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-5)).right;
		Object beg = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-5)).value;
		int condleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-4)).left;
		int condright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-4)).right;
		AbsValExpr cond = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-4)).value;
		int thenStmtleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).left;
		int thenStmtright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).right;
		AbsStmt thenStmt = (AbsStmt)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).value;
		int elseStmtleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int elseStmtright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsStmt elseStmt = (AbsStmt)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
				AbsIfStmt ifs = new AbsIfStmt((AbsValExpr) cond, thenStmt, elseStmt);
				ifs.setBeg(beg.toString(), begleft, begright);
				ifs.setEnd(elseStmt);
				RESULT = ifs;
			
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("stmt",15, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-5)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 79: // stmt ::= FOR IDENTIFIER ASSIGN expr_value TO expr_value DO stmt 
            {
              AbsStmt RESULT =null;
		int begleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-7)).left;
		int begright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-7)).right;
		Object beg = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-7)).value;
		int nameleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-6)).left;
		int nameright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-6)).right;
		String name = (String)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-6)).value;
		int loBoundleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-4)).left;
		int loBoundright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-4)).right;
		AbsValExpr loBound = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-4)).value;
		int hiBoundleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).left;
		int hiBoundright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).right;
		AbsValExpr hiBound = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).value;
		int stmtleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int stmtright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsStmt stmt = (AbsStmt)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
				AbsValName ns = new AbsValName(name);
				ns.setPos(name.toString(), nameleft, nameright);
				AbsForStmt fors = new AbsForStmt(ns, (AbsValExpr) loBound, (AbsValExpr) hiBound, stmt);
				fors.setBeg(beg.toString(), begleft, begright);
				fors.setEnd(stmt);
				RESULT = fors;
			
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("stmt",15, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-7)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 78: // stmt ::= WHILE expr_value DO stmt 
            {
              AbsStmt RESULT =null;
		int begleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-3)).left;
		int begright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-3)).right;
		Object beg = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-3)).value;
		int condleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).left;
		int condright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).right;
		AbsValExpr cond = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsStmt s = (AbsStmt)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
				AbsWhileStmt ws = new AbsWhileStmt(cond, s);
				ws.setBeg(beg.toString(), begleft, begright);
				ws.setEnd(s);
				RESULT = ws;
			
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("stmt",15, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-3)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 77: // stmt ::= expr_value ASSIGN expr_value 
            {
              AbsStmt RESULT =null;
		int dstExprleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).left;
		int dstExprright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).right;
		AbsValExpr dstExpr = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).value;
		int srcExprleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int srcExprright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsValExpr srcExpr = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
				AbsAssignStmt as = new AbsAssignStmt(dstExpr, srcExpr);
				as.setBeg(dstExpr);
				as.setEnd(srcExpr);
				RESULT = as;
			
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("stmt",15, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 76: // stmt ::= composed_stmt 
            {
              AbsStmt RESULT =null;
		int csleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int csright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsBlockStmt cs = (AbsBlockStmt)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
				RESULT = cs;
			
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("stmt",15, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 75: // seq_stmt ::= stmt 
            {
              AbsStmts RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsStmt s = (AbsStmt)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
					AbsStmts statements = new AbsStmts();
					statements.stmts.add(s);
					statements.setEnd(s);
					statements.setBeg(s);
					RESULT = statements; 	
		   		
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("seq_stmt",17, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 74: // seq_stmt ::= seq_stmt SEMIC stmt 
            {
              AbsStmts RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).right;
		AbsStmts l = (AbsStmts)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsStmt s = (AbsStmt)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
					l.stmts.add(s);
					l.setEnd(s);
					RESULT = l; 	
				
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("seq_stmt",17, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 73: // composed_stmt ::= BEGIN END 
            {
              AbsBlockStmt RESULT =null;
		int begleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).left;
		int begright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).right;
		Object beg = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).value;
		int endleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int endright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		Object end = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		  AbsStmts em = new AbsStmts();
			   			em.setBeg(beg.toString(), begleft, begright);
			   			em.setEnd(end.toString(), endleft, endright);
			   			AbsBlockStmt statements = new AbsBlockStmt(em);
			   			statements.setBeg(beg.toString(), begleft, begright);
						statements.setEnd(end.toString(), endleft, endright);
			   			RESULT = statements; 
			   		
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("composed_stmt",16, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 72: // composed_stmt ::= BEGIN seq_stmt END 
            {
              AbsBlockStmt RESULT =null;
		int begleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).left;
		int begright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).right;
		Object beg = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).right;
		AbsStmts s = (AbsStmts)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).value;
		int endleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int endright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		Object end = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
						AbsBlockStmt statements = new AbsBlockStmt(s);
						statements.setBeg(beg.toString(), begleft, begright);
						statements.setEnd(end.toString(), endleft, endright);
						RESULT = statements; 
					
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("composed_stmt",16, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 71: // stmt ::= expr_value 
            {
              AbsStmt RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsValExpr e = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
				AbsExprStmt es = new AbsExprStmt((AbsValExpr) e);
				es.setBeg(e);
				es.setEnd(e);
				RESULT = es; 
			
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("stmt",15, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 70: // stmt ::= expr_value QMARK stmt COLON stmt 
            {
              AbsStmt RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-4)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-4)).right;
		AbsValExpr e = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-4)).value;
		int s1left = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).left;
		int s1right = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).right;
		AbsStmt s1 = (AbsStmt)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).value;
		int s2left = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int s2right = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsStmt s2 = (AbsStmt)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
				RESULT = new QMarkStmt(e, s1, s2);
			
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("stmt",15, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-4)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 69: // desc_komponente ::= decl_name COLON expr_type 
            {
              AbsVarDecl RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).right;
		AbsDeclName n = (AbsDeclName)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsTypeExpr e = (AbsTypeExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
							AbsVarDecl ty = new AbsVarDecl(n, e,  new VisibilityType(VisibilityType.PUBLIC));
							ty.setBeg(n.toString(), nleft, nright);
							ty.setEnd(e);
							RESULT = ty;
						
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("desc_komponente",22, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 68: // expr_type_desc ::= expr_type_desc SEMIC desc_komponente 
            {
              AbsDecls RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).right;
		AbsDecls l = (AbsDecls)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).value;
		int dleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsVarDecl d = (AbsVarDecl)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
				 			l.setEnd(d);
							(l.decls).add(d);
							RESULT = l; 
				 		
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_type_desc",21, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 67: // expr_type_desc ::= desc_komponente 
            {
              AbsDecls RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsVarDecl d = (AbsVarDecl)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
							AbsDecls fields = new AbsDecls(); 
							(fields.decls).add(d);
							fields.setEnd(d);
							fields.setBeg(d);
							RESULT = fields; 	
						
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_type_desc",21, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 66: // expr_type ::= PTR expr_type 
            {
              AbsTypeExpr RESULT =null;
		int begleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).left;
		int begright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).right;
		Object beg = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsTypeExpr e = (AbsTypeExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
					AbsPointerType p = new AbsPointerType((AbsTypeExpr) e);
					p.setBeg(beg.toString(), begleft, begright);
					p.setEnd(e);
					RESULT = p;
				
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_type",19, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 65: // expr_type ::= RECORD expr_type_desc END 
            {
              AbsTypeExpr RESULT =null;
		int begleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).left;
		int begright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).right;
		Object beg = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).value;
		int listleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).left;
		int listright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).right;
		AbsDecls list = (AbsDecls)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).value;
		int endleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int endright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		Object end = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
					AbsRecordType rec = new AbsRecordType(list);
					rec.setBeg(beg.toString(), begleft, begright);
					rec.setEnd(end.toString(), endleft, endright);
					RESULT = rec;
				
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_type",19, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 64: // expr_type ::= ARRAY LBRACKET expr_value DOTS expr_value RBRACKET OF expr_type 
            {
              AbsTypeExpr RESULT =null;
		int begleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-7)).left;
		int begright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-7)).right;
		Object beg = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-7)).value;
		int fromleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-5)).left;
		int fromright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-5)).right;
		AbsValExpr from = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-5)).value;
		int toleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-3)).left;
		int toright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-3)).right;
		AbsValExpr to = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-3)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsTypeExpr e = (AbsTypeExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
					AbsArrayType ar = new AbsArrayType((AbsTypeExpr)e, (AbsValExpr)from, (AbsValExpr)to);
					ar.setBeg(beg.toString(), begleft, begright);
					ar.setEnd(e);
					RESULT = ar;
				
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_type",19, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-7)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 63: // expr_type ::= IDENTIFIER 
            {
              AbsTypeExpr RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		 
					AbsTypeName type = new AbsTypeName(e); 
					type.setPos(e.toString(), eleft, eright);
					RESULT = type;
				
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_type",19, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 62: // expr_type ::= INT 
            {
              AbsTypeExpr RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
					AbsAtomType atom = new AbsAtomType(2); 
					atom.setPos(e.toString(), eleft, eright);
					RESULT = atom;
				
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_type",19, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 61: // expr_type ::= CHAR 
            {
              AbsTypeExpr RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
					AbsAtomType atom = new AbsAtomType(1); 
					atom.setPos(e.toString(), eleft, eright);
					RESULT = atom;
				
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_type",19, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 60: // expr_type ::= BOOL 
            {
              AbsTypeExpr RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		 
					AbsAtomType atom = new AbsAtomType(0); 
					atom.setPos(e.toString(), eleft, eright);
					RESULT = atom;
				
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_type",19, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 59: // expr_type ::= LPARENTHESIS expr_type RPARENTHESIS 
            {
              AbsTypeExpr RESULT =null;
		int begleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).left;
		int begright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).right;
		Object beg = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).right;
		AbsTypeExpr e = (AbsTypeExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).value;
		int endleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int endright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		Object end = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
					((AbsTypeExpr)e).setBeg(beg.toString(), begleft, begright);
					((AbsTypeExpr)e).setEnd(end.toString(), endleft, endright);
					RESULT = e;
				
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_type",19, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 58: // expr_value_list ::= 
            {
              AbsValExprs RESULT =null;
		 RESULT = new AbsValExprs(); 
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_value_list",20, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 57: // expr_value_list ::= expr_value 
            {
              AbsValExprs RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsValExpr e = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
							AbsValExprs args = new AbsValExprs();
							args.exprs.add(e);
							args.setBeg(e);
							args.setEnd(e);
							RESULT = args; 
						
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_value_list",20, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 56: // expr_value_list ::= expr_value_list COMMA expr_value 
            {
              AbsValExprs RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).right;
		AbsValExprs l = (AbsValExprs)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsValExpr e = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
							l.exprs.add(e);
							l.setEnd(e);
							RESULT = l; 
						
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_value_list",20, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 55: // expr_value ::= name_val LPARENTHESIS expr_value_list RPARENTHESIS 
            {
              AbsValExpr RESULT =null;
		int nameleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-3)).left;
		int nameright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-3)).right;
		AbsValName name = (AbsValName)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-3)).value;
		int listleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).left;
		int listright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).right;
		AbsValExprs list = (AbsValExprs)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).value;
		int endleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int endright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		Object end = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
						AbsCallExpr call = new AbsCallExpr(name, list);
						call.setBeg(name.toString(), nameleft, nameright);
						call.setEnd(end.toString(), endleft, endright);
						RESULT = call;
					
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_value",18, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-3)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 54: // expr_value ::= expr_value PTR 
            {
              AbsValExpr RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).right;
		AbsValExpr e = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).value;
		int endleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int endright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		Object end = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
			 		AbsUnExpr ptre_expr = new AbsUnExpr(0, (AbsValExpr) e);
				 	ptre_expr.setEnd(end.toString(), endleft, endright);
				 	ptre_expr.setBeg(e);
				 	RESULT = ptre_expr;
			 	
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_value",18, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 53: // expr_value ::= PTR expr_value 
            {
              AbsValExpr RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsValExpr e = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
				 	AbsUnExpr ptrp_expr = new AbsUnExpr(1, (AbsValExpr) e);
				 	ptrp_expr.setBeg(b.toString(), bleft, bright);
				 	ptrp_expr.setEnd(e);
				 	RESULT = ptrp_expr;
				 
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_value",18, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 52: // expr_value ::= SUB expr_value 
            {
              AbsValExpr RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsValExpr e = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
			 		AbsUnExpr sub_expr = new AbsUnExpr(3, (AbsValExpr) e);
				 	sub_expr.setBeg(b.toString(), bleft, bright);
				 	sub_expr.setEnd(e);
				 	RESULT = sub_expr;
			 	
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_value",18, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 51: // expr_value ::= ADD expr_value 
            {
              AbsValExpr RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsValExpr e = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
				 	AbsUnExpr add_expr = new AbsUnExpr(2, (AbsValExpr) e);
				 	add_expr.setBeg(b.toString(), bleft, bright);
				 	add_expr.setEnd(e);
				 	RESULT = add_expr;
				 
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_value",18, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 50: // expr_value ::= NOT expr_value 
            {
              AbsValExpr RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsValExpr e = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
				 	AbsUnExpr not_expr = new AbsUnExpr(4, (AbsValExpr) e);
				 	not_expr.setBeg(b.toString(), bleft, bright);
				 	not_expr.setEnd(e);
				 	RESULT = not_expr;
				 
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_value",18, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 49: // expr_value ::= expr_value OR expr_value 
            {
              AbsValExpr RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).right;
		AbsValExpr l = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsValExpr r = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		 
						AbsBinExpr mul = new AbsBinExpr(11, (AbsValExpr)l, (AbsValExpr)r); 
						mul.setBeg(l);
						mul.setEnd(r);
						RESULT = mul;
					
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_value",18, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 48: // expr_value ::= expr_value AND expr_value 
            {
              AbsValExpr RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).right;
		AbsValExpr l = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsValExpr r = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		 
						AbsBinExpr mul = new AbsBinExpr(10, (AbsValExpr)l, (AbsValExpr)r); 
						mul.setBeg(l);
						mul.setEnd(r);
						RESULT = mul;
					
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_value",18, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // expr_value ::= expr_value GEQ expr_value 
            {
              AbsValExpr RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).right;
		AbsValExpr l = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsValExpr r = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		 
						AbsBinExpr mul = new AbsBinExpr(9, (AbsValExpr)l, (AbsValExpr)r); 
						mul.setBeg(l);
						mul.setEnd(r);
						RESULT = mul;
					
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_value",18, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // expr_value ::= expr_value LEQ expr_value 
            {
              AbsValExpr RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).right;
		AbsValExpr l = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsValExpr r = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		 
						AbsBinExpr mul = new AbsBinExpr(8, (AbsValExpr)l, (AbsValExpr)r); 
						mul.setBeg(l);
						mul.setEnd(r);
						RESULT = mul;
					
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_value",18, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // expr_value ::= expr_value GTH expr_value 
            {
              AbsValExpr RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).right;
		AbsValExpr l = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsValExpr r = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		 
						AbsBinExpr mul = new AbsBinExpr(7, (AbsValExpr)l, (AbsValExpr)r); 
						mul.setBeg(l);
						mul.setEnd(r);
						RESULT = mul;
					
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_value",18, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // expr_value ::= expr_value LTH expr_value 
            {
              AbsValExpr RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).right;
		AbsValExpr l = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsValExpr r = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		 
						AbsBinExpr mul = new AbsBinExpr(6, (AbsValExpr)l, (AbsValExpr)r); 
						mul.setBeg(l);
						mul.setEnd(r);
						RESULT = mul;
					
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_value",18, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // expr_value ::= expr_value NEQ expr_value 
            {
              AbsValExpr RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).right;
		AbsValExpr l = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsValExpr r = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		 
						AbsBinExpr mul = new AbsBinExpr(5, (AbsValExpr)l, (AbsValExpr)r); 
						mul.setBeg(l);
						mul.setEnd(r);
						RESULT = mul;
					
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_value",18, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // expr_value ::= expr_value EQU expr_value 
            {
              AbsValExpr RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).right;
		AbsValExpr l = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsValExpr r = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		 
						AbsBinExpr mul = new AbsBinExpr(4, (AbsValExpr)l, (AbsValExpr)r); 
						mul.setBeg(l);
						mul.setEnd(r);
						RESULT = mul;
					
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_value",18, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // expr_value ::= expr_value SUB expr_value 
            {
              AbsValExpr RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).right;
		AbsValExpr l = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsValExpr r = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		 
						AbsBinExpr mul = new AbsBinExpr(1, (AbsValExpr)l, (AbsValExpr)r); 
						mul.setBeg(l);
						mul.setEnd(r);
						RESULT = mul;
					
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_value",18, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // expr_value ::= expr_value ADD expr_value 
            {
              AbsValExpr RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).right;
		AbsValExpr l = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsValExpr r = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		 
						AbsBinExpr mul = new AbsBinExpr(0, (AbsValExpr)l, (AbsValExpr)r); 
						mul.setBeg(l);
						mul.setEnd(r);
						RESULT = mul;
					
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_value",18, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // expr_value ::= expr_value DIV expr_value 
            {
              AbsValExpr RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).right;
		AbsValExpr l = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsValExpr r = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		 
						AbsBinExpr mul = new AbsBinExpr(3, (AbsValExpr)l, (AbsValExpr)r); 
						mul.setBeg(l);
						mul.setEnd(r);
						RESULT = mul;
					
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_value",18, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // expr_value ::= expr_value MUL expr_value 
            {
              AbsValExpr RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).right;
		AbsValExpr l = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsValExpr r = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		 
						AbsBinExpr mul = new AbsBinExpr(2, (AbsValExpr)l, (AbsValExpr)r); 
						mul.setBeg(l);
						mul.setEnd(r);
						RESULT = mul;
					
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_value",18, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // expr_value ::= expr_value LBRACKET expr_value RBRACKET 
            {
              AbsValExpr RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-3)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-3)).right;
		AbsValExpr l = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-3)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).right;
		AbsValExpr r = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).value;
		int endleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int endright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		Object end = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
					AbsBinExpr be = new AbsBinExpr(12, l, r);
					be.setBeg(l);
					be.setEnd(end.toString(), endleft, endright);
					RESULT = be;
				
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_value",18, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-3)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // expr_value ::= LBRACKET expr_type RBRACKET 
            {
              AbsValExpr RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).value;
		int typeleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).left;
		int typeright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).right;
		AbsTypeExpr type = (AbsTypeExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
					AbsAlloc alloc = new AbsAlloc(type);
					alloc.setBeg(b.toString(), bleft, bright);
					alloc.setEnd(e.toString(), eleft, eright);
					RESULT = alloc;
				
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_value",18, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // expr_value ::= expr_value DOT name_val 
            {
              AbsValExpr RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).right;
		AbsValExpr l = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsValName r = (AbsValName)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
					AbsBinExpr el_acc = new AbsBinExpr(13, l, r );
					el_acc.setBeg(l);
					el_acc.setEnd(r.toString(), rleft, rright);
					RESULT = el_acc;
				
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_value",18, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // expr_value ::= LPARENTHESIS expr_value RPARENTHESIS 
            {
              AbsValExpr RESULT =null;
		int begleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).left;
		int begright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).right;
		Object beg = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).right;
		AbsValExpr e = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).value;
		int endleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int endright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		Object end = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
					e.setBeg(beg.toString(), begleft, begright);
					e.setEnd(end.toString(), endleft, endright);
					RESULT = e;
				
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_value",18, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // expr_value ::= name_val 
            {
              AbsValExpr RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsValName a = (AbsValName)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		 
				 	RESULT = a;				 
				 
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_value",18, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // expr_value ::= NIL 
            {
              AbsValExpr RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
					AbsNilConst nil = new AbsNilConst();
					nil.setPos(a.toString(), aleft, aright);
				 	RESULT = nil;		
					
				
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_value",18, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // expr_value ::= CHAR_CONST 
            {
              AbsValExpr RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
					AbsAtomConst chary = new AbsAtomConst(c, 1);
					chary.setPos(c.toString(), cleft, cright);
				 	RESULT = chary;		
				
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_value",18, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // expr_value ::= BOOL_CONST 
            {
              AbsValExpr RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
					AbsAtomConst bool = new AbsAtomConst(b, 0);
					bool.setPos(b.toString(), bleft, bright);
				 	RESULT = bool;		
				
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_value",18, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // expr_value ::= INT_CONST 
            {
              AbsValExpr RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
					AbsAtomConst in = new AbsAtomConst(i, 2);
					in.setBeg(i.toString(), ileft, iright);
				 	in.setEnd(i.toString(), ileft, iright);
				 	RESULT = in;	
				
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("expr_value",18, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // name_val ::= IDENTIFIER 
            {
              AbsValName RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		String n = (String)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		 
					AbsValName prog_name = new AbsValName(n); 
					prog_name.setPos(n.toString(), nleft, nright);
					RESULT = prog_name;
				
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("name_val",2, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // list_param ::= 
            {
              AbsDecls RESULT =null;
		 RESULT = new AbsDecls(); 
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("list_param",12, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // list_param ::= list_param SEMIC decl_name COLON expr_type 
            {
              AbsDecls RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-4)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-4)).right;
		AbsDecls l = (AbsDecls)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-4)).value;
		int nleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).right;
		AbsDeclName n = (AbsDeclName)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsTypeExpr e = (AbsTypeExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
					AbsDecls mylist = new AbsDecls(); 
					mylist.decls.addAll(l.decls);
					AbsVarDecl type = new AbsVarDecl(n, (AbsTypeExpr)e,  new VisibilityType(VisibilityType.PUBLIC));
					type.setBeg(n.toString(), nleft, nright);
					type.setEnd(e);
					mylist.decls.add(type);
					RESULT = mylist; 
				 
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("list_param",12, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-4)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // list_param ::= list_param decl_name COLON expr_type 
            {
              AbsDecls RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-3)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-3)).right;
		AbsDecls l = (AbsDecls)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-3)).value;
		int nleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).right;
		AbsDeclName n = (AbsDeclName)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsTypeExpr e = (AbsTypeExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
					AbsDecls mylist = new AbsDecls(); 
					mylist.decls.addAll(l.decls);
					AbsVarDecl type = new AbsVarDecl(n, (AbsTypeExpr)e, new VisibilityType(VisibilityType.PUBLIC));
					type.setBeg(n.toString(), nleft, nright);
					type.setEnd(e);
					mylist.decls.add(type);
					RESULT = mylist; 
				 
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("list_param",12, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-3)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // desc_param ::= LPARENTHESIS list_param RPARENTHESIS 
            {
              AbsDecls RESULT =null;
		int begleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).left;
		int begright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).right;
		Object beg = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).value;
		int listleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).left;
		int listright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).right;
		AbsDecls list = (AbsDecls)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).value;
		int endleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int endright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		Object end = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
					list.setBeg(beg.toString(), begleft, begright);
					list.setEnd(end.toString(), endleft, endright);
					RESULT = list;
				
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("desc_param",11, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // decl_func ::= FUNCTION decl_name desc_param COLON expr_type SEMIC declarations composed_stmt SEMIC 
            {
              AbsDecl RESULT =null;
		int begleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-8)).left;
		int begright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-8)).right;
		Object beg = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-8)).value;
		int nleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-7)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-7)).right;
		AbsDeclName n = (AbsDeclName)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-7)).value;
		int parsleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-6)).left;
		int parsright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-6)).right;
		AbsDecls pars = (AbsDecls)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-6)).value;
		int typeleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-4)).left;
		int typeright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-4)).right;
		AbsTypeExpr type = (AbsTypeExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-4)).value;
		int declsleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).left;
		int declsright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).right;
		AbsDecls decls = (AbsDecls)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).right;
		AbsBlockStmt s = (AbsBlockStmt)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).value;
		int endleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int endright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		Object end = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
					AbsFunDecl fun = new AbsFunDecl(n, pars, type, decls, s);
					fun.setBeg(beg.toString(), begleft, begright);
					fun.setEnd(end.toString(), endleft, endright);
					RESULT = fun;
				
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("decl_func",14, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-8)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // decl_procedure ::= PROCEDURE decl_name desc_param SEMIC declarations composed_stmt SEMIC 
            {
              AbsDecl RESULT =null;
		int begleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-6)).left;
		int begright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-6)).right;
		Object beg = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-6)).value;
		int nleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-5)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-5)).right;
		AbsDeclName n = (AbsDeclName)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-5)).value;
		int parsleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-4)).left;
		int parsright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-4)).right;
		AbsDecls pars = (AbsDecls)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-4)).value;
		int declsleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).left;
		int declsright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).right;
		AbsDecls decls = (AbsDecls)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).right;
		AbsBlockStmt s = (AbsBlockStmt)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).value;
		int endleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int endright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		Object end = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
						AbsProcDecl proc = new AbsProcDecl(n, pars, decls, s);
						proc.setBeg(beg.toString(), begleft, begright);
						proc.setEnd(end.toString(), endleft, endright);
						RESULT = proc;
					
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("decl_procedure",13, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-6)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // declarations_subprg ::= 
            {
              AbsDecls RESULT =null;
		 RESULT = new AbsDecls(); 
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("declarations_subprg",4, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // declarations_subprg ::= declarations_subprg decl_func 
            {
              AbsDecls RESULT =null;
		int leftleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).left;
		int leftright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).right;
		AbsDecls left = (AbsDecls)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).value;
		int dleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsDecl d = (AbsDecl)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		 
								left.decls.add(d);
								if(left.begLine == 0)
									left.setBeg(d);
								left.setEnd(d);
								RESULT = left; 
								
					 		
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("declarations_subprg",4, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // declarations_subprg ::= declarations_subprg decl_procedure 
            {
              AbsDecls RESULT =null;
		int leftleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).left;
		int leftright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).right;
		AbsDecls left = (AbsDecls)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).value;
		int pleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int pright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsDecl p = (AbsDecl)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		 
								left.decls.add(p);
								if(left.begLine == 0)
									left.setBeg(p);
								left.setEnd(p);
								RESULT = left; 
							
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("declarations_subprg",4, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // decl_type ::= 
            {
              AbsDecls RESULT =null;
		 RESULT = new AbsDecls(); 
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("decl_type",10, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // decl_type ::= decl_type decl_name EQU expr_type SEMIC 
            {
              AbsDecls RESULT =null;
		int leftleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-4)).left;
		int leftright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-4)).right;
		AbsDecls left = (AbsDecls)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-4)).value;
		int nleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-3)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-3)).right;
		AbsDeclName n = (AbsDeclName)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-3)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).right;
		AbsTypeExpr e = (AbsTypeExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).value;
		int endleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int endright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		Object end = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
					AbsDecls mylist = new AbsDecls(); 
					mylist.decls.addAll(left.decls);
					AbsTypeDecl type = new AbsTypeDecl(n, e);
					type.setBeg(n.toString(), nleft, nright);
					type.setEnd(end.toString(), endleft, endright);
					mylist.decls.add(type);
					
					mylist.setEnd(end.toString(), endleft, endright);
					
					RESULT = mylist; 	 	
				 
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("decl_type",10, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-4)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // declarations_type ::= 
            {
              AbsDecls RESULT =null;
		 
								AbsDecls decs = new AbsDecls();
								decs.setBeg("", -1, -1);
								RESULT = decs;
							
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("declarations_type",7, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // declarations_type ::= TYPE decl_type 
            {
              AbsDecls RESULT =null;
		int begleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).left;
		int begright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).right;
		Object beg = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).value;
		int decsleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int decsright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsDecls decs = (AbsDecls)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
			
								decs.setBeg(beg.toString(), begleft, begright);
								RESULT = decs; 
							
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("declarations_type",7, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // kywrd_private ::= 
            {
              VisibilityType RESULT =null;
			RESULT = new VisibilityType(VisibilityType.PUBLIC);	
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("kywrd_private",23, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // kywrd_private ::= SINGLE 
            {
              VisibilityType RESULT =null;
		
						RESULT = new VisibilityType(VisibilityType.SINGLE);
					
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("kywrd_private",23, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // kywrd_private ::= PRIVATE 
            {
              VisibilityType RESULT =null;
		
						RESULT = new VisibilityType(VisibilityType.PRIVATE);
					
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("kywrd_private",23, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // decl_var ::= 
            {
              AbsDecls RESULT =null;
		 RESULT = new AbsDecls(); 
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("decl_var",9, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // decl_var ::= decl_var decl_name COLON kywrd_private expr_type SEMIC 
            {
              AbsDecls RESULT =null;
		int leftleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-5)).left;
		int leftright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-5)).right;
		AbsDecls left = (AbsDecls)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-5)).value;
		int nleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-4)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-4)).right;
		AbsDeclName n = (AbsDeclName)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-4)).value;
		int visleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).left;
		int visright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).right;
		VisibilityType vis = (VisibilityType)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).right;
		AbsTypeExpr e = (AbsTypeExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).value;
		int endleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int endright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		Object end = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
					AbsDecls listy = new AbsDecls(); 
					listy.decls.addAll(left.decls);
					AbsVarDecl var = new AbsVarDecl(n, (AbsTypeExpr)e, vis); 
					var.setBeg(n.toString(), nleft, nright);
					var.setEnd(end.toString(), endleft, endright);
					listy.decls.add(var);
					
					listy.setEnd(end.toString(), endleft, endright);
					
					RESULT = listy;	
				
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("decl_var",9, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-5)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // declarations_var ::= 
            {
              AbsDecls RESULT =null;
		 
								AbsDecls decs = new AbsDecls();
								decs.setBeg("", -1, -1);
								RESULT = decs;
							
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("declarations_var",6, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // declarations_var ::= VAR decl_var 
            {
              AbsDecls RESULT =null;
		int begleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).left;
		int begright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).right;
		Object beg = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).value;
		int decsleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int decsright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsDecls decs = (AbsDecls)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
			
								decs.setBeg(beg.toString(), begleft, begright);
								RESULT = decs; 
							
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("declarations_var",6, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // decl_const ::= 
            {
              AbsDecls RESULT =null;
		
			 		RESULT = new AbsDecls(); 
			 	
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("decl_const",8, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // decl_const ::= decl_const decl_name EQU expr_value SEMIC 
            {
              AbsDecls RESULT =null;
		int leftleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-4)).left;
		int leftright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-4)).right;
		AbsDecls left = (AbsDecls)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-4)).value;
		int nleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-3)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-3)).right;
		AbsDeclName n = (AbsDeclName)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-3)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).right;
		AbsValExpr e = (AbsValExpr)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).value;
		int endleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int endright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		Object end = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
					AbsDecls mylist = new AbsDecls(); 
					mylist.decls.addAll(left.decls);
					AbsConstDecl con = new AbsConstDecl(n, (AbsValExpr)e);
					con.setBeg(n.toString(), nleft, nright);
					con.setEnd(end.toString(), endleft, endright);
					mylist.decls.add(con); 
					
					mylist.setEnd(end.toString(), endleft, endright);
					 
					RESULT = mylist; 	 	
			 	
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("decl_const",8, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-4)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // declarations_const ::= 
            {
              AbsDecls RESULT =null;
		 
								AbsDecls decs = new AbsDecls();
								decs.setBeg("", -1, -1);
								RESULT = decs;
							
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("declarations_const",5, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // declarations_const ::= CONST decl_const 
            {
              AbsDecls RESULT =null;
		int begleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).left;
		int begright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).right;
		Object beg = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).value;
		int decsleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int decsright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsDecls decs = (AbsDecls)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
			
								decs.setBeg(beg.toString(), begleft, begright);
								RESULT = decs; 
							
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("declarations_const",5, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // declarations ::= declarations_const declarations_type declarations_var declarations_subprg 
            {
              AbsDecls RESULT =null;
		int constdeclleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-3)).left;
		int constdeclright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-3)).right;
		AbsDecls constdecl = (AbsDecls)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-3)).value;
		int typedeclleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).left;
		int typedeclright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).right;
		AbsDecls typedecl = (AbsDecls)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).value;
		int vardeclleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).left;
		int vardeclright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).right;
		AbsDecls vardecl = (AbsDecls)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).value;
		int subprgdeclleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int subprgdeclright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		AbsDecls subprgdecl = (AbsDecls)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		
						AbsDecls decls = new AbsDecls();
						(decls.decls).addAll(constdecl.decls);
						(decls.decls).addAll(typedecl.decls); 
						(decls.decls).addAll(vardecl.decls); 
						(decls.decls).addAll(subprgdecl.decls);
						
						if(constdecl.begLine > 0) {
							decls.setBeg(constdecl);
						}
						else if(typedecl.begLine > 0) {
							decls.setBeg(typedecl);
						}
						else if(vardecl.begLine > 0) {
							decls.setBeg(vardecl);
						}
						else if(subprgdecl.begLine > 0) {
							decls.setBeg(subprgdecl);
						}
					
					
					
						if(subprgdecl.endLine > 0) {
							decls.setEnd(subprgdecl);
						} else if(vardecl.endLine > 0) {
							decls.setEnd(vardecl);
						} else if(typedecl.endLine >0)
							decls.setEnd(typedecl);
						else if(constdecl.endLine > 0){
							decls.setEnd(constdecl);
						}
					
						RESULT = decls;
					
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("declarations",3, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-3)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // decl_name ::= IDENTIFIER 
            {
              AbsDeclName RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		String n = (String)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		 
					AbsDeclName prog_name = new AbsDeclName(n); 
					prog_name.setPos(n.toString(), nleft, nright);
					RESULT = prog_name;
				
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("decl_name",1, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // program ::= PROGRAM decl_name SEMIC declarations composed_stmt DOT 
            {
              AbsProgram RESULT =null;
		int begleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-5)).left;
		int begright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-5)).right;
		Object beg = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-5)).value;
		int nleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-4)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-4)).right;
		AbsDeclName n = (AbsDeclName)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-4)).value;
		int dleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).right;
		AbsDecls d = (AbsDecls)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-2)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).right;
		AbsBlockStmt s = (AbsBlockStmt)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).value;
		int endleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).left;
		int endright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()).right;
		Object end = (Object)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.peek()).value;
		 
					AbsProgram program = new AbsProgram(n, d, s); 
					program.setBeg(beg.toString(), begleft, begright);
					program.setEnd(end.toString(), endleft, endright);
					RESULT = program;
				
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-5)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          return CUP$PascalSyn$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).right;
		AbsProgram start_val = (AbsProgram)((java_cup.runtime.Symbol) CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)).value;
		RESULT = start_val;
              CUP$PascalSyn$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.elementAt(CUP$PascalSyn$top-1)), ((java_cup.runtime.Symbol)CUP$PascalSyn$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$PascalSyn$parser.done_parsing();
          return CUP$PascalSyn$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

