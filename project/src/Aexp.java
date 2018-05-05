package src;


public class Aexp {

    public enum AexpType {
        INTEGER,        
        FLOAT,
        ID,
        IDARRAY,
        BOOLEAN,
        CHAR,
        ARRAY,
        EXP
    }
    
    private final AexpType eType;
    private Integer inum;
    private Float fnum;
    private String id;
    private Integer idx_num; // for array
    private String idx_id; // for array
    private Boolean bl = null;
    private char character;
    private boolean error = false;
    
    
    private Args operands;
    private int operator;

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
    
    Aexp(String x, Integer idx){
        eType = AexpType.IDARRAY;
        id = x;
        idx_num = idx;
    }
    
    Aexp(String x, String idd){
        // System.out.println("I SHOULD BE HERE: " + x + ", " + id);
        eType = AexpType.IDARRAY;
        id = x;
        idx_id = idd;
    }
    
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
                //System.out.println("I AM HEEREERERERE11");
                Atype id_array = SymbolTable.getValue(id);
                //System.out.println("I AM HEEREERERERE22");
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
                
                if (idx_num != null){
                  // Static index 
                  index = idx_num;
                }
                else{
                  // Find index val by ID
                  //System.out.println("I AM HEEREERERERE");
                  Atype idx_val = SymbolTable.getValue(idx_id);
                  
                    if (idx_val == null){
                        System.out.println("Exception: " + idx_id + " was not declared");
                        System.exit(0);
                    }
                    
                    if (! idx_val.type.equals("INTEGER")) {
                        System.out.println("Exception: " + "Array index must be int");
                        System.exit(0);
                    }
                  index = (Integer) idx_val.value;
                }
                  
                
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
                              int f = (Integer)fi.value;
                              int s = (Integer)se.value;
                              if (f == s) {
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
