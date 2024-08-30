
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package com.example.calculadorakotlin.analyzers;

import java_cup.runtime.Symbol;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class S_Analyzer extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return Symbols.class;
}

  /** Default constructor. */
  @Deprecated
  public S_Analyzer() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public S_Analyzer(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public S_Analyzer(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\012\000\002\002\004\000\002\002\003\000\002\003" +
    "\005\000\002\003\005\000\002\003\005\000\002\003\005" +
    "\000\002\004\002\000\002\003\006\000\002\003\003\000" +
    "\002\003\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\022\000\010\010\007\012\005\013\004\001\002\000" +
    "\016\002\ufff8\004\ufff8\005\ufff8\006\ufff8\007\ufff8\011\ufff8" +
    "\001\002\000\016\002\ufff9\004\ufff9\005\ufff9\006\ufff9\007" +
    "\ufff9\011\ufff9\001\002\000\014\002\000\004\015\005\016" +
    "\006\013\007\017\001\002\000\010\010\007\012\005\013" +
    "\004\001\002\000\004\002\011\001\002\000\004\002\001" +
    "\001\002\000\014\004\015\005\016\006\013\007\017\011" +
    "\ufffb\001\002\000\010\010\007\012\005\013\004\001\002" +
    "\000\004\011\023\001\002\000\010\010\007\012\005\013" +
    "\004\001\002\000\010\010\007\012\005\013\004\001\002" +
    "\000\010\010\007\012\005\013\004\001\002\000\016\002" +
    "\ufffd\004\ufffd\005\ufffd\006\ufffd\007\ufffd\011\ufffd\001\002" +
    "\000\016\002\ufffe\004\ufffe\005\ufffe\006\013\007\017\011" +
    "\ufffe\001\002\000\016\002\uffff\004\uffff\005\uffff\006\013" +
    "\007\017\011\uffff\001\002\000\016\002\ufffa\004\ufffa\005" +
    "\ufffa\006\ufffa\007\ufffa\011\ufffa\001\002\000\016\002\ufffc" +
    "\004\ufffc\005\ufffc\006\ufffc\007\ufffc\011\ufffc\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\022\000\006\002\007\003\005\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\003\011" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\004" +
    "\013\001\001\000\004\003\023\001\001\000\002\001\001" +
    "\000\004\003\021\001\001\000\004\003\020\001\001\000" +
    "\004\003\017\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$S_Analyzer$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$S_Analyzer$actions(this);
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
    return action_obj.CUP$S_Analyzer$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public String resultado="";

    //Metodo al que se llama automaticamente ante algun error sintactico
    public void syntax_error(Symbol s)
    {
        String lexema = s.value.toString();
        int fila = s.right;
        int columna = s.left;

        System.out.println("!!!!!!! Error Sintactico Recuperado !!!!!!!");
        System.out.println("\t\tLexema: "+lexema);
        System.out.println("\t\tFila: "+fila);
        System.out.println("\t\tColumna: "+columna);

    }

    //Metodo al que se llama en el momento en que ya no es posible una recuperacion de errores
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception
    {
        String lexema = s.value.toString();
        int fila = s.right;
        int columna = s.left;

        System.out.println("!!!!!!! Error Sintactico, Panic Mode !!!!!!! ");
        System.out.println("\t\tLexema: "+lexema);
        System.out.println("\t\tFila: "+fila);
        System.out.println("\t\tColumna: "+columna);

    }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$S_Analyzer$actions {



  private final S_Analyzer parser;

  /** Constructor */
  CUP$S_Analyzer$actions(S_Analyzer parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$S_Analyzer$do_action_part00000000(
    int                        CUP$S_Analyzer$act_num,
    java_cup.runtime.lr_parser CUP$S_Analyzer$parser,
    java.util.Stack            CUP$S_Analyzer$stack,
    int                        CUP$S_Analyzer$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$S_Analyzer$result;

      /* select the action based on the action number */
      switch (CUP$S_Analyzer$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-1)).right;
		String start_val = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-1)).value;
		RESULT = start_val;
              CUP$S_Analyzer$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-1)), ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$S_Analyzer$parser.done_parsing();
          return CUP$S_Analyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= E 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer$stack.peek()).value;
		 resultado=a; 
              CUP$S_Analyzer$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()), ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // E ::= E mas E 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer$stack.peek()).value;
		 double val1= Double.parseDouble(a);
                    double val2= Double.parseDouble(b);
                    double r = val1+val2;
                    RESULT = String.valueOf(r); 
              CUP$S_Analyzer$result = parser.getSymbolFactory().newSymbol("E",1, ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)), ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // E ::= E menos E 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer$stack.peek()).value;
		 double val1= Double.parseDouble(a);
                    double val2= Double.parseDouble(b);
                    double r = val1-val2;
                    RESULT = String.valueOf(r); 
              CUP$S_Analyzer$result = parser.getSymbolFactory().newSymbol("E",1, ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)), ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // E ::= E div E 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer$stack.peek()).value;
		 double val1= Double.parseDouble(a);
                    double val2= Double.parseDouble(b);
                    double r = val1/val2;
                    RESULT = String.valueOf(r); 
              CUP$S_Analyzer$result = parser.getSymbolFactory().newSymbol("E",1, ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)), ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // E ::= E por E 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer$stack.peek()).value;
		 double val1= Double.parseDouble(a);
                    double val2= Double.parseDouble(b);
                    double r = val1*val2;
                    RESULT = String.valueOf(r); 
              CUP$S_Analyzer$result = parser.getSymbolFactory().newSymbol("E",1, ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)), ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // NT$0 ::= 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer$stack.peek()).value;
 RESULT = a; 
              CUP$S_Analyzer$result = parser.getSymbolFactory().newSymbol("NT$0",2, ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // E ::= paro E NT$0 parc 
            {
              String RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (String) ((java_cup.runtime.Symbol) CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-1)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-2)).value;

              CUP$S_Analyzer$result = parser.getSymbolFactory().newSymbol("E",1, ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.elementAt(CUP$S_Analyzer$top-3)), ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // E ::= number 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer$stack.peek()).value;
		 RESULT = a; 
              CUP$S_Analyzer$result = parser.getSymbolFactory().newSymbol("E",1, ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()), ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // E ::= decimal 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer$stack.peek()).value;
		 RESULT = a; 
              CUP$S_Analyzer$result = parser.getSymbolFactory().newSymbol("E",1, ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()), ((java_cup.runtime.Symbol)CUP$S_Analyzer$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$S_Analyzer$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$S_Analyzer$do_action(
    int                        CUP$S_Analyzer$act_num,
    java_cup.runtime.lr_parser CUP$S_Analyzer$parser,
    java.util.Stack            CUP$S_Analyzer$stack,
    int                        CUP$S_Analyzer$top)
    throws java.lang.Exception
    {
              return CUP$S_Analyzer$do_action_part00000000(
                               CUP$S_Analyzer$act_num,
                               CUP$S_Analyzer$parser,
                               CUP$S_Analyzer$stack,
                               CUP$S_Analyzer$top);
    }
}

}
