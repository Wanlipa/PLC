
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sat Apr 28 10:53:16 ICT 2018
//----------------------------------------------------

package src;

import java_cup.runtime.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Sat Apr 28 10:53:16 ICT 2018
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
    "\000\034\000\002\002\003\000\002\002\004\000\002\012" +
    "\004\000\002\012\003\000\002\016\002\000\002\011\005" +
    "\000\002\003\003\000\002\003\003\000\002\003\003\000" +
    "\002\003\003\000\002\003\003\000\002\003\005\000\002" +
    "\010\006\000\002\007\004\000\002\005\006\000\002\004" +
    "\005\000\002\006\005\000\002\013\005\000\002\013\005" +
    "\000\002\013\003\000\002\015\005\000\002\015\005\000" +
    "\002\015\003\000\002\014\005\000\002\014\003\000\002" +
    "\014\003\000\002\014\003\000\002\014\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\061\000\014\015\013\017\016\020\005\022\021\026" +
    "\014\001\002\000\004\004\ufff8\001\002\000\014\011\032" +
    "\024\027\025\034\026\025\027\026\001\002\000\004\004" +
    "\ufffb\001\002\000\004\004\ufffa\001\002\000\020\002\ufffe" +
    "\015\ufffe\017\ufffe\020\ufffe\022\ufffe\023\ufffe\026\ufffe\001" +
    "\002\000\004\004\ufff7\001\002\000\004\002\060\001\002" +
    "\000\014\011\032\024\027\025\034\026\025\027\026\001" +
    "\002\000\006\013\051\014\052\001\002\000\004\004\ufffd" +
    "\001\002\000\014\011\032\024\027\025\034\026\025\027" +
    "\026\001\002\000\004\004\ufff9\001\002\000\016\002\001" +
    "\015\013\017\016\020\005\022\021\026\014\001\002\000" +
    "\014\015\013\017\016\020\005\022\021\026\014\001\002" +
    "\000\016\015\013\017\016\020\005\022\021\023\024\026" +
    "\014\001\002\000\020\002\uffff\015\uffff\017\uffff\020\uffff" +
    "\022\uffff\023\uffff\026\uffff\001\002\000\004\004\ufff6\001" +
    "\002\000\022\004\uffe7\005\uffe7\006\uffe7\007\uffe7\010\uffe7" +
    "\012\uffe7\016\uffe7\021\uffe7\001\002\000\022\004\uffe6\005" +
    "\uffe6\006\uffe6\007\uffe6\010\uffe6\012\uffe6\016\uffe6\021\uffe6" +
    "\001\002\000\022\004\uffe9\005\uffe9\006\uffe9\007\uffe9\010" +
    "\uffe9\012\uffe9\016\uffe9\021\uffe9\001\002\000\022\004\uffeb" +
    "\005\uffeb\006\uffeb\007\uffeb\010\uffeb\012\uffeb\016\uffeb\021" +
    "\uffeb\001\002\000\022\004\uffee\005\uffee\006\uffee\007\041" +
    "\010\040\012\uffee\016\uffee\021\uffee\001\002\000\014\011" +
    "\032\024\027\025\034\026\025\027\026\001\002\000\010" +
    "\004\ufff4\005\035\006\036\001\002\000\022\004\uffe8\005" +
    "\uffe8\006\uffe8\007\uffe8\010\uffe8\012\uffe8\016\uffe8\021\uffe8" +
    "\001\002\000\014\011\032\024\027\025\034\026\025\027" +
    "\026\001\002\000\014\011\032\024\027\025\034\026\025" +
    "\027\026\001\002\000\022\004\uffef\005\uffef\006\uffef\007" +
    "\041\010\040\012\uffef\016\uffef\021\uffef\001\002\000\014" +
    "\011\032\024\027\025\034\026\025\027\026\001\002\000" +
    "\014\011\032\024\027\025\034\026\025\027\026\001\002" +
    "\000\022\004\uffed\005\uffed\006\uffed\007\uffed\010\uffed\012" +
    "\uffed\016\uffed\021\uffed\001\002\000\022\004\uffec\005\uffec" +
    "\006\uffec\007\uffec\010\uffec\012\uffec\016\uffec\021\uffec\001" +
    "\002\000\022\004\ufff0\005\ufff0\006\ufff0\007\041\010\040" +
    "\012\ufff0\016\ufff0\021\ufff0\001\002\000\010\005\035\006" +
    "\036\012\046\001\002\000\022\004\uffea\005\uffea\006\uffea" +
    "\007\uffea\010\uffea\012\uffea\016\uffea\021\uffea\001\002\000" +
    "\004\004\050\001\002\000\020\002\ufffc\015\ufffc\017\ufffc" +
    "\020\ufffc\022\ufffc\023\ufffc\026\ufffc\001\002\000\014\011" +
    "\032\024\027\025\034\026\025\027\026\001\002\000\014" +
    "\011\032\024\027\025\034\026\025\027\026\001\002\000" +
    "\004\004\ufff1\001\002\000\010\004\ufff2\005\035\006\036" +
    "\001\002\000\010\005\035\006\036\016\056\001\002\000" +
    "\014\015\013\017\016\020\005\022\021\026\014\001\002" +
    "\000\004\004\ufff3\001\002\000\004\002\000\001\002\000" +
    "\010\005\035\006\036\021\062\001\002\000\014\015\013" +
    "\017\016\020\005\022\021\026\014\001\002\000\004\004" +
    "\ufff5\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\061\000\024\002\011\003\014\004\005\005\016\006" +
    "\006\007\003\010\010\011\007\012\017\001\001\000\002" +
    "\001\001\000\010\013\060\014\027\015\030\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\010\013\054\014\027\015" +
    "\030\001\001\000\002\001\001\000\004\016\046\001\001" +
    "\000\010\013\032\014\027\015\030\001\001\000\002\001" +
    "\001\000\020\003\014\004\005\005\016\006\006\007\003" +
    "\010\010\011\022\001\001\000\022\003\014\004\005\005" +
    "\016\006\006\007\003\010\010\011\007\012\021\001\001" +
    "\000\020\003\014\004\005\005\016\006\006\007\003\010" +
    "\010\011\022\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\010\013\044\014\027" +
    "\015\030\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\014\027\015\043\001\001\000\006\014\027\015\036" +
    "\001\001\000\002\001\001\000\004\014\042\001\001\000" +
    "\004\014\041\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\010\013\053\014\027" +
    "\015\030\001\001\000\004\014\052\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\016\003\056" +
    "\004\005\005\016\006\006\007\003\010\010\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\016" +
    "\003\062\004\005\005\016\006\006\007\003\010\010\001" +
    "\001\000\002\001\001" });

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
          case 27: // factor ::= BL 
            {
              Aexp RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Boolean b = (Boolean)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Aexp(b); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("factor",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // factor ::= ID 
            {
              Aexp RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Aexp(i); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("factor",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // factor ::= FNUM 
            {
              Aexp RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Float f = (Float)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Aexp(f); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("factor",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // factor ::= INUM 
            {
              Aexp RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Aexp(n); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("factor",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // factor ::= LPAREN expr RPAREN 
            {
              Aexp RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Aexp e = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = e; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("factor",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // term ::= factor 
            {
              Aexp RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Aexp f = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = f; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("term",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // term ::= term DIVIDE factor 
            {
              Aexp RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Aexp t = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Aexp f = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Aexp(new Args(t,f), sym.DIVIDE); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("term",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // term ::= term TIMES factor 
            {
              Aexp RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Aexp t = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Aexp f = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Aexp(new Args(t,f), sym.TIMES); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("term",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expr ::= term 
            {
              Aexp RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Aexp t = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = t; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expr ::= expr MINUS term 
            {
              Aexp RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Aexp e = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Aexp t = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Aexp(new Args(e,t), sym.MINUS); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expr ::= expr PLUS term 
            {
              Aexp RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Aexp e = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Aexp t = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Aexp(new Args(e,t), sym.PLUS); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // vardec ::= ID COLON factor 
            {
              Astat RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Aexp f = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = Astat.varDeclaration(i,f); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("vardec",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // assignment ::= ID EQ expr 
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
          case 14: // ifthen ::= IF expr THEN statement 
            {
              Astat RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Aexp e = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Astat s = (Astat)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = Astat.ifthen(e,s); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ifthen",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // print ::= PRINT expr 
            {
              Astat RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Aexp e = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = Astat.print(e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("print",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // while ::= WHILE expr DO statement 
            {
              Astat RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Aexp e = (Aexp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Astat s = (Astat)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = Astat.whileloop(e,s); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("while",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
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
          case 9: // statement ::= print 
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
          case 7: // statement ::= vardec 
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

              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement_part",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
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
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$0",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
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

