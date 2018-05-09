package src;
import java.util.*;


public class Aexp {

    public enum AexpType {
        INTEGER,        
        FLOAT,
        ID,
        IDARRAY,
        FUNCTION_EVAL,
        BOOLEAN,
        CHAR,
        ARRAY,
        EXP
    }
    
    private final AexpType eType;
    private Integer inum;
    private Float fnum;
    private String id;
    private Aexp exp; // for array
//    private Integer idx_num; // for array
//    private String idx_id; // for array
    private Boolean bl = null;
    private char character;
    private boolean error = false;
    private String f_id;
    private ArrayList<Aexp> f_params;
    private Args operands;
    private int operator;
    
    
    public static Aexp explicitConvert(String t, Float val){
      if (t.toUpperCase().equals("INT")){
          return new Aexp( val.intValue() );
      } 
      else{
          System.out.println("Exception: Type " + t.toString() + "is not convertable to int");
          System.exit(0);
          return null;
      }
    }
    
    public static Aexp explicitConvert(String t, Integer val){
      if (t.toUpperCase().equals("FLOAT")){
          return new Aexp( val.floatValue() );
      } 
      else{
          System.out.println("Exception: Type " + t.toString() + "is not convertable to float");
          System.exit(0);
          return null;
      }
    }

    
    Aexp(String function_id,  ArrayList<Aexp> function_params){
     // Function evaluation
     eType = AexpType.FUNCTION_EVAL;
     f_id = function_id;
     f_params = function_params;
    }

    Aexp(Integer x) {
        eType = AexpType.INTEGER;
        inum = x;        

    }
    
    Aexp(Float x) {
        eType = AexpType.FLOAT;
        fnum = x;

    }
    
    Aexp(String x) {
        eType = AexpType.ID;
        id = x;        

    }
    
    Aexp(Boolean x) {
        eType = AexpType.BOOLEAN;
        bl = x;

    }
    
    Aexp(char x){
        eType = AexpType.CHAR;
        this.character = x;
    }
    
    Aexp(String x, Aexp e){
        eType = AexpType.IDARRAY;
        id = x;
        exp = e;
    }
        
//    Aexp(String x, Integer idx){
//        eType = AexpType.IDARRAY;
//        id = x;
//        idx_num = idx;
//    }
//    
//    Aexp(String x, String idd){
//        // System.out.println("I SHOULD BE HERE: " + x + ", " + id);
//        eType = AexpType.IDARRAY;
//        id = x;
//        idx_id = idd;
//    }
    
    Aexp(Args x, int op) {
        eType = AexpType.EXP;
        operands = x;
        operator = op;
    }

    public AexpType getEType(){
        return this.eType;
    }
    
    public boolean getErr(){
        return this.error;
    }
    
    public String getexp() {

        String s = "";
        switch (this.eType) {
            case INTEGER: s = "" + inum; break;
            case FLOAT: s = "" + fnum; break;
            case ID: s = id; break;
            case BOOLEAN: s = bl.toString(); break;
            case CHAR: s = "" + character; break;
            case EXP:
                switch (operator) {
                    case sym.PLUS:
                        s = "PLUS(" + operands.getfi().getexp() + "," + operands.getse().getexp() + ")";
                        break;
                    case sym.MINUS:
                        s = "MINUS(" + operands.getfi().getexp() + "," + operands.getse().getexp() + ")";
                        break;
                    case sym.TIMES:
                        s = "TIMES(" + operands.getfi().getexp() + "," + operands.getse().getexp() + ")";
                        break;
                    case sym.DIVIDE:
                        s = "DIVIDE(" + operands.getfi().getexp() + "," + operands.getse().getexp() + ")";
                        break;
                    default: break;
                } break;
            default: break;
        }

        return s;
    }

    public Object getValue() {

        Object val = 0;
        switch (this.eType) {
            case INTEGER:
                // expression is a number
                val = new Atype(inum, false, "INTEGER"); break;
            case FLOAT:
                //expression is a number
                val = new Atype(fnum, false, "FLOAT"); break;
            case BOOLEAN:
                //expression is a variable
                val = new Atype(bl, false, "BOOLEAN"); break;    
                
            case ID:
                //expression is a variable
//                val = new Atype(id, false, "ID"); break;
                val = SymbolTable.getValue(id);
                if (val == null) {
                    System.out.print(id + " was not declared");
                    System.exit(0);
                }   
                
                break;
            case CHAR:
                val = new Atype(this.character, false, "CHAR"); break;                
                
            case IDARRAY:                
                
                Atype id_array = SymbolTable.getValue(id);
                if (id_array == null){
                    System.out.println("Exception: " + id + " was not declared");
                    System.exit(0);
                }
                if (! id_array.type.equals("ARRAY")) {
                    System.out.println("Exception: " + "Non-array type is not accessible by index");
                    System.exit(0);
                }
                
                String val_type = id_array.getArrayValueType();
                Integer index = null;
                
                Atype e_array = (Atype)exp.getValue();         
//                System.out.println("e_array val > " + e_array.value +"e_array type > "+e_array.type);                
                
                
                if (e_array.type.equals("INTEGER")){                         
                    if(e_array.value != null){       
                        index = (Integer)e_array.value;
                    }
                }else if (e_array.type.equals("ID")){
                    //Find index val by ID
                    if (e_array.value == null){
                        System.out.println("Exception: " + e_array + " was not declared");
                        System.exit(0);
                    }
                    if (! e_array.type.equals("INTEGER")){
                        System.out.println("Exception: " + "Array index must be int");
                        System.exit(0);
                    }
                    index = (Integer)e_array.value;
                }
//                if (idx_num != null){
//                  // Static index 
//                  index = idx_num;
//                }
//                else{
//                  // Find index val by ID
//                  //System.out.println("I AM HEEREERERERE");
//                  Atype idx_val = SymbolTable.getValue(idx_id);
//                  
//                    if (idx_val == null){
//                        System.out.println("Exception: " + idx_id + " was not declared");
//                        System.exit(0);
//                    }
//                    
//                    if (! idx_val.type.equals("INTEGER")) {
//                        System.out.println("Exception: " + "Array index must be int");
//                        System.exit(0);
//                    }
//                  index = (Integer) idx_val.value;
//                }
                  
                
                if (val_type.equals("INTEGER")){
                    Integer[] tmp = (Integer[]) id_array.value;                      
                    val = new Atype(new Integer(tmp[index]), false, "INTEGER");
                }
                else if (val_type.equals("FLOAT")){
                    Float[] tmp = (Float[]) id_array.value;                      
                    val = new Atype(new Float(tmp[index]), false, "FLOAT");              
                }
                else if (val_type.equals("BOOLEAN")){
                    Boolean[] tmp = (Boolean[]) id_array.value;                      
                    val = new Atype(new Boolean(tmp[index]), false, "BOOLEAN"); 
                    
                }
                else if (val_type.equals("CHAR")){
                    char[] tmp = (char[])id_array.value;
                    char s = tmp[index] ;
                    val = new Atype(s, false, "CHAR"); 
                }
                
                break;
                
            case FUNCTION_EVAL:
                    Atype fn_item = SymbolTable.getGlobalValue(f_id);
                    if (fn_item != null){
                        if (fn_item.type.equals("FUNCTION")){
                            // IMPLEMENT HERE!!!!
                            FunctionObject fn = (FunctionObject) fn_item.value;
                            // 1. Evaluate all Aexp first before passing through the method
                            ArrayList<Atype> input_args = new ArrayList<Atype>();
                            for (Aexp expr : f_params){
                                Atype v = (Atype)expr.getValue();
                                if(expr.getErr()){
                                    System.out.println("Exception: Type Error for " + f_id + " input arguments");
                                    System.exit(0);
                                }
                                else{
                                        input_args.add(v);
                                } 
                            }
                            
                            if (!fn.isReturnVoid()){
                                // 2. pass Function, and return
                                Atype retval = fn.execute(input_args);
                                if (retval != null){
                                    val = retval;
                                }
                                else {
                                    System.out.println("Exception: " + "Error in function evaluation :" + f_id);
                                    System.exit(-1);
                                }
                            
                            }
                            else {
                                System.out.println("Exception: " + "Void Return Type of Fuction :" + f_id + " is not evaluatable");
                                System.exit(-1);
                            
                            }
                            
                            
                        }
                        else{
                            System.out.println("Exception: " + "Variable :" + f_id + ", type: " + fn_item.type + " is not callable");
                            System.exit(-1);
                        }
                    
                    }
                    else{
                        System.out.println("Exception: " + "Function " + f_id + " is not defined");
                        System.exit(-1);
                    }
                    
                break;
            case EXP:
                Atype fi = (Atype)operands.getfi().getValue();           
                Atype se = (Atype)operands.getse().getValue();
                boolean relop = false;
                //expression is a math expression
                switch (operator) {
                    case sym.PLUS:
                        if(operands.getfi().error || operands.getse().error ){
                            error = true;
                        }
//                        else if((check.chType(fi)) && (check.chType(se)) ){
                        else if((fi.value instanceof Integer && se.value instanceof Integer) ){
                            val = new Atype(((Integer)fi.value) + ((Integer)se.value), false,"INTEGER");
                        }
                        else if(fi.value instanceof Float && se.value instanceof Float){                                
                            val = new Atype(new Float(fi.value.toString()) + new Float(se.value.toString()), false,"FLOAT");
                        }
                        else if(fi.value instanceof Integer && se.value instanceof Float){                                
                            val = new Atype(new Float(fi.value.toString()) + new Float(se.value.toString()), false,"FLOAT");
                        }
                        else if(fi.value instanceof Float && se.value instanceof Integer){                                
                            val = new Atype(new Float(fi.value.toString()) + new Float(se.value.toString()), false,"FLOAT");
                        }
                        else{
                            val = new Atype(0, true,"");
                            error = true;
                        }
//                        val = operands.getfi().getValue() + operands.getse().getValue();
                        break;
                    case sym.MINUS:
                        if(operands.getfi().error || operands.getse().error ){
                            error = true;
                        }
                        else if((fi.value instanceof Integer && se.value instanceof Integer) ){
                            val = new Atype(((Integer)fi.value) - ((Integer)se.value),false,"INTEGER");
                        }
                        else if(fi.value instanceof Float && se.value instanceof Float){                                
                            val = new Atype(new Float(fi.value.toString()) - new Float(se.value.toString()), false,"FLOAT");
                        }
                        else if(fi.value instanceof Integer && se.value instanceof Float){                                
                            val = new Atype(new Float(fi.value.toString()) - new Float(se.value.toString()), false,"FLOAT");
                        }
                        else if(fi.value instanceof Float && se.value instanceof Integer){                                
                            val = new Atype(new Float(fi.value.toString()) - new Float(se.value.toString()), false,"FLOAT");
                        }
                        else{
                            val = new Atype(0, true,"");
                            error = true;
                        }
//                        val = operands.getfi().getValue() - operands.getse().getValue();
                        break;
                    case sym.TIMES:
                        if(operands.getfi().error || operands.getse().error ){
                            error = true;
                        }
                        else if((fi.value instanceof Integer && se.value instanceof Integer) ){
                            val = new Atype(((Integer)fi.value) * ((Integer)se.value),false,"INTEGER");
                        }
                        else if(fi.value instanceof Float && se.value instanceof Float){                                
                            val = new Atype(new Float(fi.value.toString()) * new Float(se.value.toString()),false,"FLOAT");
                        }
                        else if(fi.value instanceof Integer && se.value instanceof Float){                                
                            val = new Atype(new Float(fi.value.toString()) * new Float(se.value.toString()),false,"FLOAT");
                        }
                        else if(fi.value instanceof Float && se.value instanceof Integer){                                
                            val = new Atype(new Float(fi.value.toString()) * new Float(se.value.toString()),false,"FLOAT");
                        }
                        else{
                             val = new Atype(0, true,"");
                            error = true;
                        }
//                        val = operands.getfi().getValue() * operands.getse().getValue();
                        break;
                    case sym.DIVIDE:
                        if(operands.getfi().error || operands.getse().error ){
                            error = true;
                        }
                        else if((fi.value instanceof Integer && se.value instanceof Integer) ){
                            val = new Atype(((Integer)fi.value) / ((Integer)se.value),false,"INTEGER");
                        }
                        else if(fi.value instanceof Float && se.value instanceof Float){                                
                            val = new Atype(new Float(fi.value.toString()) / new Float(se.value.toString()),false,"FLOAT");
                        }
                        else if(fi.value instanceof Integer && se.value instanceof Float){                                
                            val = new Atype(new Float(fi.value.toString()) / new Float(se.value.toString()),false,"FLOAT");
                        }
                        else if(fi.value instanceof Float && se.value instanceof Integer){                                
                            val = new Atype(new Float(fi.value.toString()) / new Float(se.value.toString()),false,"FLOAT");
                        }
                        else{
                                 val = new Atype(0, true,"");
                            error = true;
                        }
//                        val = operands.getfi().getValue() / operands.getse().getValue();
                        break;
                    case sym.EQEQ:
                        
                        if(operands.getfi().error || operands.getse().error ){
                            error = true;
                        }
                        else if((fi.value instanceof Integer && se.value instanceof Integer) ){
                              Integer f = (Integer)fi.value;
                              Integer s = (Integer)se.value;
                              if (f.intValue() == s.intValue()) {
                                  relop = true;
                              }
                              val = new Atype(relop,false,"BOOLEAN");
                        }
                        else if(fi.value instanceof Float && se.value instanceof Float){                                
                              float f = new Float(fi.value.toString());
                              float s = new Float(se.value.toString());
                              if (f == s){
                                  relop = true;
                              }
                              val = new Atype(relop,false,"BOOLEAN");
                        }
                        else if(fi.value instanceof Boolean && se.value instanceof Boolean){                                
                              //boolean f = new Boolean(fi.value.toString());
                              //boolean s = new Boolean(se.value.toString());
                              Boolean f = (Boolean) fi.value;
                              Boolean s = (Boolean) se.value;
                              if (f.booleanValue() == s.booleanValue()){
                                  relop = true;
                              }
                              val = new Atype(relop,false,"BOOLEAN");
                        }
                        else if(fi.type.equals("CHAR") && se.type.equals("CHAR")){                                
                              //boolean f = new Boolean(fi.value.toString());
                              //boolean s = new Boolean(se.value.toString());
                              char f = (char) fi.value;
                              char s = (char) se.value;
                              if (f == s){
                                  relop = true;
                              }
                              val = new Atype(relop,false,"BOOLEAN");
                        }
                        else{
                                 val = new Atype(relop, true,"");
                            error = true;
                        }
                        break;
                    case sym.NEQ:
                        if(operands.getfi().error || operands.getse().error ){
                            error = true;
                        }
                        else if((fi.value instanceof Integer && se.value instanceof Integer) ){
                              int f = (Integer)fi.value;
                              int s = (Integer)se.value;
                              if (f != s) {
                                  relop = true;
                              }
                              val = new Atype(relop,false,"BOOLEAN");
                        }
                        else if(fi.value instanceof Float && se.value instanceof Float){                                
                              float f = new Float(fi.value.toString());
                              float s = new Float(se.value.toString());
                              if (f != s){
                                  relop = true;
                              }
                              val = new Atype(relop,false,"BOOLEAN");
                        }
                        else if(fi.value instanceof Boolean && se.value instanceof Boolean){                                
                              //boolean f = new Boolean(fi.value.toString());
                              //boolean s = new Boolean(se.value.toString());
                              Boolean f = (Boolean) fi.value;
                              Boolean s = (Boolean) se.value;
                              if (f.booleanValue() != s.booleanValue()){
                                  relop = true;
                              }
                              val = new Atype(relop,false,"BOOLEAN");
                        }
                        else if(fi.type.equals("CHAR") && se.type.equals("CHAR")){                                
                              //boolean f = new Boolean(fi.value.toString());
                              //boolean s = new Boolean(se.value.toString());
                              char f = (char) fi.value;
                              char s = (char) se.value;
                              if (f != s){
                                  relop = true;
                              }
                              val = new Atype(relop,false,"BOOLEAN");
                        }
                        else{
                                 val = new Atype(relop, true,"");
                            error = true;
                        }
                        break;
                    case sym.GT:
                        if(operands.getfi().error || operands.getse().error ){
                            error = true;
                        }
                        else if((fi.value instanceof Integer && se.value instanceof Integer) ){
                              int f = (Integer)fi.value;
                              int s = (Integer)se.value;
                              if (f > s) {
                                  relop = true;
                              }
                              val = new Atype(relop,false,"BOOLEAN");
                        }
                        else if(fi.value instanceof Float && se.value instanceof Float){                                
                              float f = new Float(fi.value.toString());
                              float s = new Float(se.value.toString());
                              if (f > s){
                                  relop = true;
                              }
                              val = new Atype(relop,false,"BOOLEAN");
                        }
                        else{
                                 val = new Atype(relop, true,"");
                            error = true;
                        }
                        break;
                    case sym.LT:
                        if(operands.getfi().error || operands.getse().error ){
                            error = true;
                        }
                        else if((fi.value instanceof Integer && se.value instanceof Integer) ){
                              int f = (Integer)fi.value;
                              int s = (Integer)se.value;
                              if (f < s) {
                                  relop = true;
                              }
                              val = new Atype(relop,false,"BOOLEAN");
                        }
                        else if(fi.value instanceof Float && se.value instanceof Float){                                
                              float f = new Float(fi.value.toString());
                              float s = new Float(se.value.toString());
                              if (f < s){
                                  relop = true;
                              }
                              val = new Atype(relop,false,"BOOLEAN");
                        }
                        else{
                                 val = new Atype(relop, true,"");
                            error = true;
                        }
                        break;
                    case sym.LTEQ:
                        if(operands.getfi().error || operands.getse().error ){
                            error = true;
                        }
                        else if((fi.value instanceof Integer && se.value instanceof Integer) ){
                              int f = (Integer)fi.value;
                              int s = (Integer)se.value;
                              if (f <= s) {
                                  relop = true;
                              }
                              val = new Atype(relop,false,"BOOLEAN");
                        }
                        else if(fi.value instanceof Float && se.value instanceof Float){                                
                              float f = new Float(fi.value.toString());
                              float s = new Float(se.value.toString());
                              if (f <= s){
                                  relop = true;
                              }
                              val = new Atype(relop,false,"BOOLEAN");
                        }
                        else{
                                 val = new Atype(relop, true,"");
                            error = true;
                        }
                        break;
                    case sym.GTEQ:
                        if(operands.getfi().error || operands.getse().error ){
                            error = true;
                        }
                        else if((fi.value instanceof Integer && se.value instanceof Integer) ){
                              int f = (Integer)fi.value;
                              int s = (Integer)se.value;
                              if (f >= s) {
                                  relop = true;
                              }
                              val = new Atype(relop,false,"BOOLEAN");
                        }
                        else if(fi.value instanceof Float && se.value instanceof Float){                                
                              float f = new Float(fi.value.toString());
                              float s = new Float(se.value.toString());
                              if (f >= s){
                                  relop = true;
                              }
                              val = new Atype(relop,false,"BOOLEAN");
                        }
                        else{
                                 val = new Atype(relop, true,"");
                            error = true;
                        }
                        break;
                    default:
                        break;
                } break;
            default: break;
        }
        return val;
    }
    

    
}
