
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Fri May 04 17:08:48 ICT 2018
//----------------------------------------------------

package src;

import java.util.*;
import java_cup.runtime.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Fri May 04 17:08:48 ICT 2018
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\041\000\002\002\003\000\002\002\004\000\002\012" +
    "\004\000\002\012\003\000\002\017\002\000\002\010\005" +
    "\000\002\003\003\000\002\003\003\000\002\003\003\000" +
    "\002\003\003\000\002\003\003\000\002\003\005\000\002" +
    "\004\005\000\002\011\006\000\002\011\004\000\002\007" +
    "\006\000\002\006\005\000\002\013\005\000\002\013\003" +
    "\000\002\005\010\000\002\005\010\000\002\014\005\000" +
    "\002\014\005\000\002\014\003\000\002\016\005\000\002" +
    "\016\005\000\002\016\003\000\002\015\005\000\002\015" +
    "\003\000\002\015\003\000\002\015\003\000\002\015\003" +
    "\000\002\015\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\100\000\020\026\014\027\013\030\006\033\020\034" +
    "\004\036\023\042\015\001\002\000\016\011\037\040\041" +
    "\041\034\042\031\043\033\044\040\001\002\000\006\004" +
    "\ufffb\015\ufffb\001\002\000\016\011\037\040\041\041\034" +
    "\042\031\043\033\044\040\001\002\000\006\004\ufff8\015" +
    "\ufff8\001\002\000\006\004\ufff7\015\ufff7\001\002\000\024" +
    "\002\ufffe\026\ufffe\027\ufffe\030\ufffe\033\ufffe\034\ufffe\036" +
    "\ufffe\037\ufffe\042\ufffe\001\002\000\004\002\072\001\002" +
    "\000\016\011\037\040\041\041\034\042\031\043\033\044" +
    "\040\001\002\000\004\042\062\001\002\000\004\013\060" +
    "\001\002\000\006\004\ufffa\015\ufffa\001\002\000\004\004" +
    "\ufffd\001\002\000\004\016\027\001\002\000\006\004\ufff9" +
    "\015\ufff9\001\002\000\022\002\001\026\014\027\013\030" +
    "\006\033\020\034\004\036\023\042\015\001\002\000\020" +
    "\026\014\027\013\030\006\033\020\034\004\036\023\042" +
    "\015\001\002\000\022\026\014\027\013\030\006\033\020" +
    "\034\004\036\023\037\026\042\015\001\002\000\024\002" +
    "\uffff\026\uffff\027\uffff\030\uffff\033\uffff\034\uffff\036\uffff" +
    "\037\uffff\042\uffff\001\002\000\006\004\ufff6\015\ufff6\001" +
    "\002\000\016\011\037\040\041\041\034\042\031\043\033" +
    "\044\040\001\002\000\010\004\ufff1\015\ufff1\016\054\001" +
    "\002\000\024\004\uffe3\005\uffe3\006\uffe3\007\uffe3\010\uffe3" +
    "\012\uffe3\015\uffe3\016\uffe3\032\uffe3\001\002\000\024\004" +
    "\uffe7\005\uffe7\006\uffe7\007\uffe7\010\uffe7\012\uffe7\015\uffe7" +
    "\016\uffe7\032\uffe7\001\002\000\024\004\uffe2\005\uffe2\006" +
    "\uffe2\007\uffe2\010\uffe2\012\uffe2\015\uffe2\016\uffe2\032\uffe2" +
    "\001\002\000\024\004\uffe4\005\uffe4\006\uffe4\007\uffe4\010" +
    "\uffe4\012\uffe4\015\uffe4\016\uffe4\032\uffe4\001\002\000\014" +
    "\004\uffef\005\044\006\045\015\uffef\016\uffef\001\002\000" +
    "\024\004\uffea\005\uffea\006\uffea\007\050\010\047\012\uffea" +
    "\015\uffea\016\uffea\032\uffea\001\002\000\016\011\037\040" +
    "\041\041\034\042\031\043\033\044\040\001\002\000\024" +
    "\004\uffe1\005\uffe1\006\uffe1\007\uffe1\010\uffe1\012\uffe1\015" +
    "\uffe1\016\uffe1\032\uffe1\001\002\000\024\004\uffe5\005\uffe5" +
    "\006\uffe5\007\uffe5\010\uffe5\012\uffe5\015\uffe5\016\uffe5\032" +
    "\uffe5\001\002\000\010\005\044\006\045\012\043\001\002" +
    "\000\024\004\uffe6\005\uffe6\006\uffe6\007\uffe6\010\uffe6\012" +
    "\uffe6\015\uffe6\016\uffe6\032\uffe6\001\002\000\016\011\037" +
    "\040\041\041\034\042\031\043\033\044\040\001\002\000" +
    "\016\011\037\040\041\041\034\042\031\043\033\044\040" +
    "\001\002\000\024\004\uffeb\005\uffeb\006\uffeb\007\050\010" +
    "\047\012\uffeb\015\uffeb\016\uffeb\032\uffeb\001\002\000\016" +
    "\011\037\040\041\041\034\042\031\043\033\044\040\001" +
    "\002\000\016\011\037\040\041\041\034\042\031\043\033" +
    "\044\040\001\002\000\024\004\uffe9\005\uffe9\006\uffe9\007" +
    "\uffe9\010\uffe9\012\uffe9\015\uffe9\016\uffe9\032\uffe9\001\002" +
    "\000\024\004\uffe8\005\uffe8\006\uffe8\007\uffe8\010\uffe8\012" +
    "\uffe8\015\uffe8\016\uffe8\032\uffe8\001\002\000\024\004\uffec" +
    "\005\uffec\006\uffec\007\050\010\047\012\uffec\015\uffec\016" +
    "\uffec\032\uffec\001\002\000\016\011\037\040\041\041\034" +
    "\042\031\043\033\044\040\001\002\000\014\004\ufff0\005" +
    "\044\006\045\015\ufff0\016\ufff0\001\002\000\004\004\057" +
    "\001\002\000\024\002\ufffc\026\ufffc\027\ufffc\030\ufffc\033" +
    "\ufffc\034\ufffc\036\ufffc\037\ufffc\042\ufffc\001\002\000\016" +
    "\011\037\040\041\041\034\042\031\043\033\044\040\001" +
    "\002\000\012\004\ufff5\005\044\006\045\015\ufff5\001\002" +
    "\000\010\004\ufff3\013\063\015\ufff3\001\002\000\016\011" +
    "\037\040\041\041\034\042\031\043\033\044\040\001\002" +
    "\000\012\004\ufff4\005\044\006\045\015\ufff4\001\002\000" +
    "\010\005\044\006\045\032\066\001\002\000\004\014\067" +
    "\001\002\000\020\026\014\027\013\030\006\033\020\034" +
    "\004\036\023\042\015\001\002\000\004\015\071\001\002" +
    "\000\006\004\uffee\015\uffee\001\002\000\004\002\000\001" +
    "\002\000\010\005\044\006\045\032\074\001\002\000\004" +
    "\014\075\001\002\000\020\026\014\027\013\030\006\033" +
    "\020\034\004\036\023\042\015\001\002\000\004\015\077" +
    "\001\002\000\006\004\uffed\015\uffed\001\002\000\010\005" +
    "\044\006\045\032\101\001\002\000\020\026\014\027\013" +
    "\030\006\033\020\034\004\036\023\042\015\001\002\000" +
    "\006\004\ufff2\015\ufff2\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\100\000\024\002\011\003\016\004\004\005\020\006" +
    "\006\007\007\010\010\011\015\012\021\001\001\000\010" +
    "\014\077\015\031\016\035\001\001\000\002\001\001\000" +
    "\010\014\072\015\031\016\035\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\010\014\064\015\031\016\035\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\017\055\001" +
    "\001\000\002\001\001\000\002\001\001\000\020\003\016" +
    "\004\004\005\020\006\006\007\007\010\024\011\015\001" +
    "\001\000\022\003\016\004\004\005\020\006\006\007\007" +
    "\010\010\011\015\012\023\001\001\000\020\003\016\004" +
    "\004\005\020\006\006\007\007\010\024\011\015\001\001" +
    "\000\002\001\001\000\002\001\001\000\012\013\027\014" +
    "\034\015\031\016\035\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\010\014\041" +
    "\015\031\016\035\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\015\031" +
    "\016\052\001\001\000\006\015\031\016\045\001\001\000" +
    "\002\001\001\000\004\015\051\001\001\000\004\015\050" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\010\014\054\015\031\016\035\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\010\014" +
    "\060\015\031\016\035\001\001\000\002\001\001\000\002" +
    "\001\001\000\010\014\063\015\031\016\035\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\016" +
    "\003\067\004\004\005\020\006\006\007\007\011\015\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\016\003\075\004" +
    "\004\005\020\006\006\007\007\011\015\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\016\003" +
    "\101\004\004\005\020\006\006\007\007\011\015\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
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
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // factor ::= CHAR 
            {
              Aexp RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		char c = (char)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Aexp(c); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("factor",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // factor ::= BL 
            {
              Aexp RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Boolean b = (Boolean)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Aexp(b); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("factor",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // factor ::= ID 
            {
              Aexp RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Aexp(i); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("factor",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // factor ::= FNUM 
            {
              Aexp RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Float f = (Float)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Aexp(f); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("factor",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // factor ::= INUM 
            {
              Aexp RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Aexp(n); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("factor",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // factor ::= LPAREN expr RPAREN 
            {
              Aexp RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Aexp e = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = e; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("factor",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // group ::= factor 
            {
              Aexp RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Aexp f = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = f; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("group",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // group ::= group DIVIDE factor 
            {
              Aexp RESULT =null;
		int gleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int gright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Aexp g = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Aexp f = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Aexp(new Args(g,f), sym.DIVIDE); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("group",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // group ::= group TIMES factor 
            {
              Aexp RESULT =null;
		int gleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int gright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Aexp g = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Aexp f = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Aexp(new Args(g,f), sym.TIMES); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("group",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // expr ::= group 
            {
              Aexp RESULT =null;
		int gleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int gright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Aexp g = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = g; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // expr ::= expr MINUS group 
            {
              Aexp RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Aexp e = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int gleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int gright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Aexp g = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Aexp(new Args(e,g), sym.MINUS); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // expr ::= expr PLUS group 
            {
              Aexp RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Aexp e = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int gleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int gright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Aexp g = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Aexp(new Args(e,g), sym.PLUS); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // ifthen ::= ELSEIF expr THEN LBRACE statement RBRACE 
            {
              Astat RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Aexp e = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Astat s = (Astat)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = Astat.ifthen(e,s); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ifthen",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // ifthen ::= IF expr THEN LBRACE statement RBRACE 
            {
              Astat RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Aexp e = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Astat s = (Astat)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = Astat.ifthen(e,s); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ifthen",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // print_val ::= expr 
            {
              ArrayList<Aexp> RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Aexp e = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = Astat.createPrintArrayList(e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("print_val",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // print_val ::= print_val LSHIFT expr 
            {
              ArrayList<Aexp> RESULT =null;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		ArrayList<Aexp> p = (ArrayList<Aexp>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Aexp e = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = Astat.appendPrintArrayList(p,e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("print_val",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // console ::= CONSOLE LSHIFT print_val 
            {
              Astat RESULT =null;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ArrayList<Aexp> p = (ArrayList<Aexp>)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = Astat.print(p); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("console",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // while ::= WHILE expr THEN statement 
            {
              Astat RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Aexp e = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Astat s = (Astat)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = Astat.whileloop(e,s); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("while",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // assigntype ::= TYPE ID 
            {
              Astat RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = Astat.assigntype(t.toString(),i); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("assigntype",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // assigntype ::= TYPE ID EQ expr 
            {
              Astat RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Aexp e = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = Astat.assigntype(t.toString(),i,e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("assigntype",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // assignment ::= ID EQ expr 
            {
              Astat RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Aexp e = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = Astat.assignment(i,e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("assignment",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // statement ::= BEGIN statement_list END 
            {
              Astat RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Lstat s = (Lstat)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = Astat.block(s); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // statement ::= while 
            {
              Astat RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Astat s = (Astat)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = s; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // statement ::= console 
            {
              Astat RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Astat s = (Astat)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = s; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // statement ::= ifthen 
            {
              Astat RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Astat s = (Astat)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = s; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // statement ::= assigntype 
            {
              Astat RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Astat s = (Astat)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = s; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // statement ::= assignment 
            {
              Astat RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Astat s = (Astat)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = s; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // statement_part ::= statement NT$0 SEMI 
            {
              Astat RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Astat) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Astat s = (Astat)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement_part",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // NT$0 ::= 
            {
              Astat RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Astat s = (Astat)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
 RESULT = s; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$0",13, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // statement_list ::= statement_part 
            {
              Lstat RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Astat s = (Astat)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Lstat(s); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement_list",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // statement_list ::= statement_list statement_part 
            {
              Lstat RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Lstat l = (Lstat)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Astat s = (Astat)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Lstat(l,s) ; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement_list",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // program ::= statement_list 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Lstat s = (Lstat)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 s.execute(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

