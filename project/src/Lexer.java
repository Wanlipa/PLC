/* The following code was generated by JFlex 1.4_pre3 on 5/4/18 5:59 PM */



/* --------------------------Usercode Section------------------------ */
package src;
import java_cup.runtime.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4_pre3
 * on 5/4/18 5:59 PM from the specification file
 * <tt>file:/home/wanlipa/Documents/AIT/PLC/Project/Project PLC/project/flex/lcalc.flex</tt>
 */
class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int YY_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /** 
   * Translates characters to character classes
   */
  private static final char [] yycmap = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  3,  2,  0,  3,  1,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     3,  0,  0,  0,  0,  0, 38, 18, 22, 23,  5, 20,  0, 21,  8,  4, 
     6,  7,  7,  7,  7,  7,  7,  7,  7,  7,  0, 19, 32, 24, 28,  0, 
     0,  9,  9,  9,  9,  9,  9,  9,  9,  9,  9,  9,  9,  9,  9,  9, 
     9,  9,  9,  9,  9,  9,  9,  9,  9,  9,  9,  0,  0,  0,  0,  9, 
     0, 15, 36, 29, 35, 13, 14, 37, 34, 27,  9,  9, 16,  9, 31, 30, 
     9,  9, 11, 17, 10, 12,  9, 33,  9, 40,  9, 25, 39, 26,  0,  0
  };


  /** 
   * Translates a state to a row index in the transition table (packed version)
   */
  final private static String yy_rowMap_packed = 
    "\0\0\0\51\0\122\0\51\0\173\0\51\0\244\0\315\0\366\0\u011f"+
    "\0\u0148\0\u0171\0\u019a\0\u01c3\0\51\0\51\0\51\0\51\0\51\0\u01ec"+
    "\0\51\0\51\0\u0215\0\u023e\0\u0267\0\u0290\0\u02b9\0\u02e2\0\u030b\0\51"+
    "\0\51\0\u0334\0\u035d\0\u0386\0\u03af\0\u03d8\0\u0401\0\u042a\0\u0453\0\u047c"+
    "\0\u04a5\0\51\0\51\0\366\0\u04ce\0\51\0\u04f7\0\u0520\0\51\0\51"+
    "\0\51\0\u0549\0\366\0\u0572\0\u059b\0\u05c4\0\u05ed\0\u0386\0\u0616\0\u063f"+
    "\0\366\0\u0668\0\u0691\0\u06ba\0\51\0\366\0\u06e3\0\u070c\0\u0735\0\u075e"+
    "\0\u0787\0\u07b0\0\u05c4\0\366\0\u07d9\0\u0802\0\u082b\0\u0854\0\u087d\0\u08a6"+
    "\0\u08cf\0\u08f8\0\366\0\366\0\u0921\0\366\0\u094a\0\u0973\0\366";

  /** 
   * Translates a state to a row index in the transition table
   */
  final private static int [] yy_rowMap = yy_unpack_rowMap(yy_rowMap_packed);


  /** 
   * Unpacks the compressed row translation table.
   *
   * @param packed   the packed row translation table
   * @return         the unpacked row translation table
   */
  private static int [] yy_unpack_rowMap(String packed) {
    int [] map = new int[178];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 178) {
      int high = ((int) packed.charAt(i++)) << 16;
      map[j++] = high | packed.charAt(i++);
    }
    return map;
  }
  /** 
   * The packed transition table of the DFA (part 0)
   */
  private static final String yy_packed0 = 
    "\1\2\1\3\2\4\1\5\1\6\1\7\1\10\1\2"+
    "\1\11\1\12\2\11\1\13\1\14\1\15\2\11\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\2\11\1\32\1\33\1\11\1\34"+
    "\1\35\1\11\1\36\1\37\1\11\53\0\1\4\52\0"+
    "\1\40\1\41\53\0\1\42\46\0\2\10\1\42\46\0"+
    "\2\11\1\0\11\11\11\0\1\11\1\0\3\11\1\0"+
    "\5\11\2\0\1\11\6\0\2\11\1\0\2\11\1\43"+
    "\6\11\11\0\1\11\1\0\3\11\1\0\5\11\2\0"+
    "\1\11\6\0\2\11\1\0\7\11\1\44\1\11\11\0"+
    "\1\11\1\0\2\11\1\45\1\0\5\11\2\0\1\11"+
    "\6\0\2\11\1\0\6\11\1\46\1\47\1\11\11\0"+
    "\1\11\1\0\3\11\1\0\5\11\2\0\1\11\6\0"+
    "\2\11\1\0\2\11\1\50\6\11\11\0\1\11\1\0"+
    "\3\11\1\0\5\11\2\0\1\11\6\0\2\51\1\0"+
    "\11\51\11\0\1\51\1\0\3\51\1\0\5\51\2\0"+
    "\1\51\30\0\1\52\3\0\1\53\22\0\2\11\1\0"+
    "\5\11\1\54\3\11\11\0\1\11\1\0\2\11\1\55"+
    "\1\0\5\11\2\0\1\11\30\0\1\56\26\0\2\11"+
    "\1\0\11\11\11\0\1\11\1\0\1\11\1\57\1\11"+
    "\1\0\1\11\1\60\3\11\2\0\1\11\30\0\1\61"+
    "\3\0\1\62\3\0\1\63\16\0\2\11\1\0\11\11"+
    "\11\0\1\11\1\0\3\11\1\0\1\11\1\64\3\11"+
    "\2\0\1\11\6\0\2\11\1\0\11\11\11\0\1\11"+
    "\1\0\1\11\1\65\1\11\1\0\5\11\2\0\1\11"+
    "\6\0\2\11\1\0\4\11\1\66\4\11\11\0\1\11"+
    "\1\0\1\11\1\67\1\11\1\0\5\11\2\0\1\11"+
    "\1\40\1\3\1\4\46\40\5\70\1\71\43\70\6\0"+
    "\2\72\47\0\2\11\1\0\3\11\1\73\5\11\11\0"+
    "\1\11\1\0\3\11\1\0\5\11\2\0\1\11\6\0"+
    "\2\11\1\0\10\11\1\74\11\0\1\11\1\0\3\11"+
    "\1\0\5\11\2\0\1\11\6\0\2\11\1\0\11\11"+
    "\11\0\1\11\1\0\3\11\1\0\2\11\1\75\2\11"+
    "\2\0\1\11\6\0\2\11\1\0\7\11\1\76\1\11"+
    "\11\0\1\11\1\0\3\11\1\0\5\11\2\0\1\11"+
    "\6\0\2\11\1\0\11\11\11\0\1\11\1\0\1\11"+
    "\1\77\1\11\1\0\5\11\2\0\1\11\6\0\2\11"+
    "\1\0\2\11\1\100\6\11\11\0\1\11\1\0\3\11"+
    "\1\0\5\11\2\0\1\11\22\0\1\101\34\0\2\11"+
    "\1\0\1\11\1\102\7\11\11\0\1\11\1\0\3\11"+
    "\1\0\5\11\2\0\1\11\6\0\2\11\1\0\11\11"+
    "\11\0\1\11\1\0\2\11\1\103\1\0\5\11\2\0"+
    "\1\11\6\0\2\11\1\0\6\11\1\104\2\11\11\0"+
    "\1\11\1\0\3\11\1\0\5\11\2\0\1\11\6\0"+
    "\2\11\1\0\11\11\11\0\1\105\1\0\3\11\1\0"+
    "\5\11\2\0\1\11\6\0\2\11\1\0\11\11\11\0"+
    "\1\11\1\0\3\11\1\0\4\11\1\106\2\0\1\11"+
    "\6\0\2\11\1\0\11\11\11\0\1\11\1\0\1\11"+
    "\1\107\1\11\1\0\5\11\2\0\1\11\5\70\1\110"+
    "\47\70\1\111\1\110\43\70\6\0\2\11\1\0\4\11"+
    "\1\112\4\11\11\0\1\11\1\0\3\11\1\0\5\11"+
    "\2\0\1\11\6\0\2\11\1\0\4\11\1\113\4\11"+
    "\11\0\1\11\1\0\3\11\1\0\5\11\2\0\1\11"+
    "\6\0\2\11\1\0\10\11\1\73\11\0\1\11\1\0"+
    "\3\11\1\0\5\11\2\0\1\11\6\0\2\11\1\0"+
    "\6\11\1\55\2\11\11\0\1\11\1\0\3\11\1\0"+
    "\5\11\2\0\1\11\6\0\2\11\1\0\6\11\1\114"+
    "\2\11\11\0\1\11\1\0\3\11\1\0\5\11\2\0"+
    "\1\11\6\0\2\11\1\0\10\11\1\115\11\0\1\11"+
    "\1\0\3\11\1\0\5\11\2\0\1\11\6\0\2\11"+
    "\1\0\2\11\1\102\6\11\11\0\1\11\1\0\3\11"+
    "\1\0\5\11\2\0\1\11\6\0\2\11\1\0\7\11"+
    "\1\116\1\11\11\0\1\11\1\0\3\11\1\0\5\11"+
    "\2\0\1\11\6\0\2\11\1\0\11\11\11\0\1\117"+
    "\1\0\3\11\1\0\5\11\2\0\1\11\6\0\2\11"+
    "\1\0\7\11\1\120\1\11\11\0\1\11\1\0\3\11"+
    "\1\0\5\11\2\0\1\11\4\70\1\4\1\110\43\70"+
    "\6\0\2\11\1\0\11\11\11\0\1\121\1\0\3\11"+
    "\1\0\5\11\2\0\1\11\6\0\2\11\1\0\11\11"+
    "\11\0\1\11\1\0\3\11\1\0\5\11\2\0\1\102"+
    "\6\0\2\11\1\0\11\11\11\0\1\11\1\0\1\11"+
    "\1\122\1\11\1\0\5\11\2\0\1\11\6\0\2\11"+
    "\1\0\4\11\1\123\4\11\11\0\1\11\1\0\3\11"+
    "\1\0\5\11\2\0\1\11\6\0\2\11\1\0\11\11"+
    "\11\0\1\11\1\0\2\11\1\124\1\0\5\11\2\0"+
    "\1\11\6\0\2\11\1\0\4\11\1\125\4\11\11\0"+
    "\1\11\1\0\3\11\1\0\5\11\2\0\1\11\6\0"+
    "\2\11\1\0\5\11\1\126\3\11\11\0\1\11\1\0"+
    "\3\11\1\0\5\11\2\0\1\11\6\0\2\11\1\0"+
    "\7\11\1\127\1\11\11\0\1\11\1\0\3\11\1\0"+
    "\5\11\2\0\1\11\6\0\2\11\1\0\6\11\1\130"+
    "\2\11\11\0\1\11\1\0\3\11\1\0\5\11\2\0"+
    "\1\11\6\0\2\11\1\0\4\11\1\131\4\11\11\0"+
    "\1\11\1\0\3\11\1\0\5\11\2\0\1\11\6\0"+
    "\2\11\1\0\11\11\11\0\1\11\1\0\2\11\1\102"+
    "\1\0\5\11\2\0\1\11";

  /** 
   * The transition table of the DFA
   */
  private static final int yytrans [] = yy_unpack();


  /* error codes */
  private static final int YY_UNKNOWN_ERROR = 0;
  private static final int YY_ILLEGAL_STATE = 1;
  private static final int YY_NO_MATCH = 2;
  private static final int YY_PUSHBACK_2BIG = 3;

  /* error messages for the codes above */
  private static final String YY_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Internal error: unknown state",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * YY_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final byte YY_ATTRIBUTE[] = {
     0,  9,  1,  9,  1,  9,  1,  1,  1,  1,  1,  1,  1,  1,  9,  9, 
     9,  9,  9,  1,  9,  9,  1,  1,  1,  1,  1,  1,  1,  9,  9,  1, 
     0,  0,  1,  1,  1,  1,  1,  1,  0,  9,  9,  1,  1,  9,  1,  1, 
     9,  9,  9,  1,  1,  1,  1,  0,  0,  1,  1,  1,  1,  1,  1,  1, 
     9,  1,  1,  1,  1,  1,  1,  0,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1
  };

  /** the input device */
  private java.io.Reader yy_reader;

  /** the current state of the DFA */
  private int yy_state;

  /** the current lexical state */
  private int yy_lexical_state = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char yy_buffer[] = new char[YY_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int yy_markedPos;

  /** the textposition at the last state to be included in yytext */
  private int yy_pushbackPos;

  /** the current text position in the buffer */
  private int yy_currentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int yy_startRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int yy_endRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn; 

  /** 
   * yy_atBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean yy_atBOL = true;

  /** yy_atEOF == true <=> the scanner is at the EOF */
  private boolean yy_atEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean yy_eof_done;

  /* user code: */
    /* To create a new java_cup.runtime.Symbol with information about
       the current token, the token will have no value in this
       case. */
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }

    /* Also creates a new java_cup.runtime.Symbol with information
       about the current token, but this object has a value. */
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.yy_reader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the split, compressed DFA transition table.
   *
   * @return the unpacked transition table
   */
  private static int [] yy_unpack() {
    int [] trans = new int[2460];
    int offset = 0;
    offset = yy_unpack(yy_packed0, offset, trans);
    return trans;
  }

  /** 
   * Unpacks the compressed DFA transition table.
   *
   * @param packed   the packed transition table
   * @return         the index of the last entry
   */
  private static int yy_unpack(String packed, int offset, int [] trans) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do trans[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   IOException  if any I/O-Error occurs
   */
  private boolean yy_refill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (yy_startRead > 0) {
      System.arraycopy(yy_buffer, yy_startRead, 
                       yy_buffer, 0, 
                       yy_endRead-yy_startRead);

      /* translate stored positions */
      yy_endRead-= yy_startRead;
      yy_currentPos-= yy_startRead;
      yy_markedPos-= yy_startRead;
      yy_pushbackPos-= yy_startRead;
      yy_startRead = 0;
    }

    /* is the buffer big enough? */
    if (yy_currentPos >= yy_buffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[yy_currentPos*2];
      System.arraycopy(yy_buffer, 0, newBuffer, 0, yy_buffer.length);
      yy_buffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = yy_reader.read(yy_buffer, yy_endRead, 
                                            yy_buffer.length-yy_endRead);

    if (numRead < 0) {
      return true;
    }
    else {
      yy_endRead+= numRead;  
      return false;
    }
  }


  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    yy_atEOF = true;            /* indicate end of file */
    yy_endRead = yy_startRead;  /* invalidate buffer    */

    if (yy_reader != null)
      yy_reader.close();
  }


  /**
   * Closes the current stream, and resets the
   * scanner to read from a new input stream.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>YY_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) throws java.io.IOException {
    yyclose();
    yy_reader = reader;
    yy_atBOL  = true;
    yy_atEOF  = false;
    yy_endRead = yy_startRead = 0;
    yy_currentPos = yy_markedPos = yy_pushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    yy_lexical_state = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return yy_lexical_state;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    yy_lexical_state = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( yy_buffer, yy_startRead, yy_markedPos-yy_startRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return yy_buffer[yy_startRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return yy_markedPos-yy_startRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void yy_ScanError(int errorCode) {
    String message;
    try {
      message = YY_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = YY_ERROR_MSG[YY_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  private void yypushback(int number)  {
    if ( number > yylength() )
      yy_ScanError(YY_PUSHBACK_2BIG);

    yy_markedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void yy_do_eof() throws java.io.IOException {
    if (!yy_eof_done) {
      yy_eof_done = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int yy_input;
    int yy_action;

    // cached fields:
    int yy_currentPos_l;
    int yy_startRead_l;
    int yy_markedPos_l;
    int yy_endRead_l = yy_endRead;
    char [] yy_buffer_l = yy_buffer;
    char [] yycmap_l = yycmap;

    int [] yytrans_l = yytrans;
    int [] yy_rowMap_l = yy_rowMap;
    byte [] yy_attr_l = YY_ATTRIBUTE;

    while (true) {
      yy_markedPos_l = yy_markedPos;

      boolean yy_r = false;
      for (yy_currentPos_l = yy_startRead; yy_currentPos_l < yy_markedPos_l;
                                                             yy_currentPos_l++) {
        switch (yy_buffer_l[yy_currentPos_l]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          yy_r = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          yy_r = true;
          break;
        case '\n':
          if (yy_r)
            yy_r = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          yy_r = false;
          yycolumn++;
        }
      }

      if (yy_r) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean yy_peek;
        if (yy_markedPos_l < yy_endRead_l)
          yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        else if (yy_atEOF)
          yy_peek = false;
        else {
          boolean eof = yy_refill();
          yy_markedPos_l = yy_markedPos;
          yy_buffer_l = yy_buffer;
          if (eof) 
            yy_peek = false;
          else 
            yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        }
        if (yy_peek) yyline--;
      }
      yy_action = -1;

      yy_startRead_l = yy_currentPos_l = yy_currentPos = 
                       yy_startRead = yy_markedPos_l;

      yy_state = yy_lexical_state;


      yy_forAction: {
        while (true) {

          if (yy_currentPos_l < yy_endRead_l)
            yy_input = yy_buffer_l[yy_currentPos_l++];
          else if (yy_atEOF) {
            yy_input = YYEOF;
            break yy_forAction;
          }
          else {
            // store back cached positions
            yy_currentPos  = yy_currentPos_l;
            yy_markedPos   = yy_markedPos_l;
            boolean eof = yy_refill();
            // get translated positions and possibly new buffer
            yy_currentPos_l  = yy_currentPos;
            yy_markedPos_l   = yy_markedPos;
            yy_buffer_l      = yy_buffer;
            yy_endRead_l     = yy_endRead;
            if (eof) {
              yy_input = YYEOF;
              break yy_forAction;
            }
            else {
              yy_input = yy_buffer_l[yy_currentPos_l++];
            }
          }
          int yy_next = yytrans_l[ yy_rowMap_l[yy_state] + yycmap_l[yy_input] ];
          if (yy_next == -1) break yy_forAction;
          yy_state = yy_next;

          int yy_attributes = yy_attr_l[yy_state];
          if ( (yy_attributes & 1) == 1 ) {
            yy_action = yy_state; 
            yy_markedPos_l = yy_currentPos_l; 
            if ( (yy_attributes & 8) == 8 ) break yy_forAction;
          }

        }
      }

      // store back cached position
      yy_markedPos = yy_markedPos_l;

      switch (yy_action) {

        case 57: 
          {  return symbol(sym.FVAL, new Float(yytext()));  }
        case 90: break;
        case 88: 
          {  return symbol(sym.CONSOLE);  }
        case 91: break;
        case 85: 
          {  return symbol(sym.ELSEIF);  }
        case 92: break;
        case 21: 
          {  return symbol(sym.RBRACE);  }
        case 93: break;
        case 20: 
          {  return symbol(sym.LBRACE);  }
        case 94: break;
        case 18: 
          {  return symbol(sym.RPAREN);  }
        case 95: break;
        case 17: 
          {  return symbol(sym.LPAREN);  }
        case 96: break;
        case 4: 
          {  return symbol(sym.DIVIDE);  }
        case 97: break;
        case 50: 
          {  return symbol(sym.LSHIFT);  }
        case 98: break;
        case 2: 
        case 3: 
          {  /* just skip what was found, do nothing */  }
        case 99: break;
        case 6: 
        case 7: 
          {  return symbol(sym.IVAL, new Integer(yytext()));  }
        case 100: break;
        case 31: 
        case 72: 
          {  /* just skip what was found, do nothing */  }
        case 101: break;
        case 73: 
          {  return symbol(sym.BLVAL, new Boolean (yytext())); }
        case 102: break;
        case 8: 
        case 9: 
        case 10: 
        case 11: 
        case 12: 
        case 22: 
        case 24: 
        case 26: 
        case 27: 
        case 28: 
        case 34: 
        case 35: 
        case 36: 
        case 37: 
        case 38: 
        case 39: 
        case 44: 
        case 46: 
        case 47: 
        case 51: 
        case 53: 
        case 54: 
        case 58: 
        case 59: 
        case 61: 
        case 62: 
        case 63: 
        case 66: 
        case 67: 
        case 68: 
        case 69: 
        case 70: 
        case 75: 
        case 76: 
        case 77: 
        case 78: 
        case 79: 
        case 80: 
        case 81: 
        case 84: 
        case 86: 
        case 87: 
          {  return symbol(sym.ID, yytext()); }
        case 103: break;
        case 29: 
          {  return symbol(sym.AND);  }
        case 104: break;
        case 25: 
          {  return symbol(sym.LT);  }
        case 105: break;
        case 23: 
          {  return symbol(sym.GT);  }
        case 106: break;
        case 19: 
          {  return symbol(sym.EQ);  }
        case 107: break;
        case 30: 
          {  return symbol(sym.OR);  }
        case 108: break;
        case 43: 
          {  return symbol(sym.IF);  }
        case 109: break;
        case 49: 
          {  return symbol(sym.NEQ);  }
        case 110: break;
        case 52: 
          {  return symbol(sym.DO);  }
        case 111: break;
        case 60: 
          {  return symbol(sym.END);  }
        case 112: break;
        case 65: 
          {  return symbol(sym.TYPE, yytext()); }
        case 113: break;
        case 16: 
          {  return symbol(sym.MINUS);  }
        case 114: break;
        case 5: 
          {  return symbol(sym.TIMES);  }
        case 115: break;
        case 14: 
          {  return symbol(sym.SEMI);  }
        case 116: break;
        case 15: 
          {  return symbol(sym.PLUS);  }
        case 117: break;
        case 41: 
          {  return symbol(sym.EQEQ);  }
        case 118: break;
        case 42: 
          {  return symbol(sym.THEN);  }
        case 119: break;
        case 45: 
          {  return symbol(sym.GTEQ);  }
        case 120: break;
        case 48: 
          {  return symbol(sym.LTEQ);  }
        case 121: break;
        case 74: 
          {  return symbol(sym.ELSE);  }
        case 122: break;
        case 82: 
          {  return symbol(sym.WHILE);  }
        case 123: break;
        case 83: 
          {  return symbol(sym.BEGIN);  }
        case 124: break;
        case 1: 
        case 13: 
          {  throw new Error("Illegal character <"+yytext()+">");  }
        case 125: break;
        case 64: 
          {  return symbol(sym.CHARVAL, yytext()); }
        case 126: break;
        default: 
          if (yy_input == YYEOF && yy_startRead == yy_currentPos) {
            yy_atEOF = true;
            yy_do_eof();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            yy_ScanError(YY_NO_MATCH);
          }
      }
    }
  }


}
