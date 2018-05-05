package src;

import src.Aexp.AexpType;
import java.lang.IllegalArgumentException;
import java.io.*;
import java.util.*;

public class Astat {

    int statementType;
    public static int assignment = 0;
    public static int assigntype = 1;
    public static int print = 2;
    public static int ifthen = 3;
    public static int block = 4;
    public static int whileloop = 5;
    public static int funDeclaration = 6;
    public static int returnStatement = 7;
    public static int ifthenelse = 8;
    public static int ifelse = 9;
    public static int functiondef = 10;
    public static int function_return = 11;
    public static int function_call_void = 12;
    
    public Aexp ret_expr;
    public String ret_id;
    
    public static Astat fnreturn(Aexp e){
        Astat statement = new Astat();
        statement.statementType = function_return;
        statement.ret_expr = e;
        return statement;
    }
    
    public static Astat fnreturn(){
        Astat statement = new Astat();
        statement.statementType = function_return;
        return statement;
    }
    
    public String f_void_id;
    public ArrayList<Aexp> f_void_params;
    
    public static Astat fncallvoid(String function_id,  ArrayList<Aexp> function_params){
        Astat statement = new Astat();
        statement.statementType = function_call_void;
        statement.f_void_id = function_id;
        statement.f_void_params = function_params;
        return statement;
    }

    /*
     * assignment statement: variable = expr
     * adding : floating , boolean
     */
    
    
    public String assVarType;
    public String assVariable;
    public Aexp assExpr;
    public Aexp assArrayIndexExpr;
    public AexpType assArrayType;
    public Integer assArraySize;
    
    public static Astat assignment(String Variable, Aexp expr) {
//    public static Astat assignment(String type, String Variable, Aexp expr) {
        Astat statement = new Astat();
        statement.statementType = assignment;

//        statement.assVarType = type;
        statement.assVariable = Variable;
        statement.assExpr = expr;

        return statement;
    }
    
    public static Astat assignmentArray(String Variable, Aexp index_expr, Aexp val_expr){
        Astat statement = new Astat();
        statement.statementType = assignment;
        statement.assVariable = Variable;
        statement.assArrayIndexExpr = index_expr;
        statement.assExpr = val_expr;
        return statement;
    }
    
    /*
     * assignment statement: variable = expr
     * adding : floating , boolean
     */
    public AexpType assType;
    public static Astat assigntype(String type, String Variable, Aexp expr) {
         String FullType = "";
         if(type.equals("boolean")){
             FullType = "BOOLEAN";
         }
         else if(type.equals("int")){
             FullType = "INTEGER";
         }
         else if(type.equals("float")){
             FullType = "FLOAT";
         }
         else if(type.equals("char")){
             FullType = "CHAR";
         }
        Astat statement = new Astat();
        statement.statementType = assigntype;
        statement.assType = AexpType.valueOf(FullType);
        statement.assVariable = Variable;
        statement.assExpr = expr;

        return statement;
    }
    /*
      For null declaration assignment: i.e. int a;
    */
    

    public static Astat assigntype(String type, String Variable) {
         
         String FullType = "";
         if(type.equals("boolean")){
             FullType = "BOOLEAN";
         }
         else if(type.equals("int")){
             FullType = "INTEGER";
         }
         else if(type.equals("float")){
             FullType = "FLOAT";
         }
         else if(type.equals("char")){
             FullType = "CHAR";
         }
         else{
             System.out.println("Type Error!");
             throw new IllegalArgumentException("Type Error for id: " + Variable);
         }
        Astat statement = new Astat();
        statement.statementType = assigntype;
        statement.assType = AexpType.valueOf(FullType); // conver string to enum
        statement.assVariable = Variable;
        statement.assExpr = null;

        return statement;
    }
    
    public static Astat assignTypeArray(String t1, String t2, int arr_size, String Variable){
        Astat statement = new Astat();
        if ((t1.toUpperCase().equals("ARRAY") )){
            statement.statementType = assigntype;
            statement.assType = AexpType.valueOf("ARRAY"); // conver string to enum
            statement.assVariable = Variable;
            String arr_type = "";
            if (t2.equals("int")){
                arr_type = "INTEGER";
            }else{
                arr_type = t2.toUpperCase();
            }
            statement.assArrayType = AexpType.valueOf( arr_type );
            statement.assArraySize = new Integer(arr_size);
            statement.assExpr = null;
        
        } else{
            System.out.println("Type Error!");
            throw new IllegalArgumentException("Type Error for id: " + Variable);
        }
        
        
        return statement;
    }
      
    public AexpType getEType(){
        return this.assType;
    }
    
    
    /*
     * print statement: print e
     */
    ArrayList<Aexp> printEvalList;
    
    public static Astat print(ArrayList<Aexp> p) {
        Astat statement = new Astat();
        statement.statementType = print;
        statement.printEvalList = p;
        return statement;

    }
    
    public static ArrayList<Aexp> createArrayList(Aexp e){
        ArrayList<Aexp> l = new ArrayList<Aexp>();
        l.add(e);
        return l;
    }
    
    public static ArrayList<Aexp> appendArrayList(ArrayList<Aexp> p, Aexp e){
        ArrayList<Aexp> l = new ArrayList<Aexp>(p);
        l.add(e);
        return l;
    }
    
    
    /**
     * Function Definition
     * 
     *
     */
    
    
    FunctionObject fobj;
    
    public static Astat funcdef(ArrayList<FuncArg> fargs, String fid, String ret_type, Astat body){
        Astat statement = new Astat();
        statement.statementType = functiondef;
        String tmp_ret_type = ret_type.toUpperCase();
        if (tmp_ret_type.equals("INT")){
            tmp_ret_type = "INTEGER";
        }
        // TODO -- Check Allow Type other wise abort!!!  
        statement.fobj = new FunctionObject(fid, tmp_ret_type, fargs, body);
        
        // Maybe can set Symbol here to get compile time evaluation
        return statement;
    }
    
    
    
    
    /*
     * if then statement: if ifcondition then ifbody
     *
     */
    Aexp ifcondition;
    Astat ifbody;

    public static Astat ifthen(Aexp Condition, Astat Ifbody) {
        Astat statement = new Astat();
        statement.statementType = ifthen;
        statement.ifcondition = Condition;
        statement.ifbody = Ifbody;

        return statement;
    }
    
    Aexp elseifcondition;
    Astat elseifbody;
    Astat elsebody;
    public static Astat ifthenelse(Aexp Condition, Astat Ifbody, Aexp Condition2, Astat Elseifbody, Astat Elsebody){
        Astat statement = new Astat();
        statement.statementType = ifthenelse;
        statement.ifcondition = Condition;
        statement.ifbody = Ifbody;
        statement.elseifcondition = Condition2;
        statement.elseifbody = Elseifbody;
        statement.elsebody = Elsebody;
        return statement;
    }    
        
    public static Astat ifelse(Aexp Condition, Astat Ifbody, Astat Elsebody) {
        Astat statement = new Astat();
        statement.statementType = ifelse;
        statement.ifcondition = Condition;
        statement.ifbody = Ifbody;
        statement.elsebody = Elsebody;
        return statement;
    }

    /*
     * block statement: begin statement_list end
     */
    Lstat blockBody;

    public static Astat block(Lstat l) {
        Astat statement = new Astat();
        statement.statementType = block;
        statement.blockBody = l;
        return statement;
    }
    
    /*
     * while loop: while whileCondition begin whileBody end
     *
     */
    Aexp whileCondition;
    Astat whileBody;

    public static Astat whileloop(Aexp condition, Astat WhileBody) {
        Astat statement = new Astat();
        statement.statementType = whileloop;
        statement.whileCondition = condition;
        statement.whileBody = WhileBody;
        return statement;

    }


    public String getstat() {
        if (statementType == assignment) {
            return assVariable + "=" + assExpr.getexp();        
        }else if (statementType == ifthen) {
            return "if " + ifcondition.getexp() + " " + ifbody.getstat();
        } 
        //else if (statementType == print) {
        //    return "print " + printE.getexp();
        //} 
        else if (statementType == whileloop) {
            return "while " + whileCondition.getexp() + " => " + whileBody.getstat();
        } else if (statementType == block) {
            return "block";
        } else {
            return "unknown";
        }
    }
    


    public void execute() {

        if (statementType == assignment) {
            
            if (assArrayIndexExpr != null){
                // Array Assignment
                Atype id = SymbolTable.getValue(assVariable);
                if (! id.type.equals("ARRAY") ){
                    System.out.println("Exception: " + "Non-array type is not accessible by index");
                    System.exit(-1);
                }
                
                Atype idx_type = (Atype)assArrayIndexExpr.getValue();
               
                if (!idx_type.type.equals("INTEGER") ){
                    System.out.println("Exception: " + "Array index must be int");
                    System.exit(-1);
                }
                
                if (idx_type.getErr()){
                    System.out.println("Exception: " + "Eval Type Error");
                    System.exit(-1);
                }
                
                Integer idx = (Integer)idx_type.value; 
                Atype value = (Atype)assExpr.getValue();
//                System.out.println("Array CLASS NAME: " + id.value.getClass().getSimpleName());
                String id_type =  id.value.getClass().getSimpleName();
                String array_val_type = id_type.substring(0, id_type.length() - 2 ).toUpperCase(); // should get something like FLOAT, INTEGER, BOOLEAN
//                 System.out.println("Array Type:" + array_val_type);
//                 System.out.println("Value Type:" + value.type);
                if(array_val_type.equals(value.type)){
                  if (array_val_type.equals("INTEGER")){
                      Integer[] tmp = (Integer[]) id.value;
                      tmp[idx] = (Integer) value.value;
                      id.value = tmp;
                      SymbolTable.setValue(assVariable, id);
                  }
                  else if (array_val_type.equals("BOOLEAN")){
                      Boolean[] tmp = (Boolean[]) id.value;
                      tmp[idx] = (Boolean) value.value;
                      id.value = tmp;
                      SymbolTable.setValue(assVariable, id);
                  }
                  else if (array_val_type.equals("FLOAT")) {
                      Float[] tmp = (Float[]) id.value;
                      tmp[idx] = (Float) value.value;
                      id.value = tmp;
                      SymbolTable.setValue(assVariable, id);
                  }
                  else if (array_val_type.equals("CHAR")) {
                      char[] tmp = (char[]) id.value;
                      System.out.println("char val :: "+value.value);
                      tmp[idx] = (char) value.value;
                      System.out.println("char tmp :: "+tmp[idx]);
                      id.value = tmp;
                      System.out.println("char id :: "+ id.value);
                      SymbolTable.setValue(assVariable, id);
                  }
                  else {
                    System.out.println("Exception: " + "Comipler Error:Array Type check");
                    System.exit(-1);
                  }
                }
                else{
                    System.out.println("Exception: " + "Assignment Type Error!");
                    System.exit(-1);
                }
               
                
            }else{
                
                Atype value = (Atype)assExpr.getValue();
                Atype id = SymbolTable.getValue(assVariable);
                if (value.typeEquals(id)){
                 SymbolTable.setValue(assVariable, value);
                } else{
                    System.out.println("Exception: " + "Assignment Type Error!");
                    System.exit(-1);
                }
               
               
            }
            
//            SymbolTable.setValue(assVarType , assVariable, assExpr.getValue());
            

        }else if (statementType == assigntype){
            if (assExpr != null){
                // If there is an expression, we will validate it
                // TODO -- may include implicit type conversion here
                Atype value = null;
                value = (Atype) assExpr.getValue();
                if (this.checkType(value)){
                    SymbolTable.setValue(assVariable, value);
                }
                else{
    
                      System.out.println("Exception: " + "Assignment Type Error");
                      System.exit(0);
                }
            }
            else{
                // Assign Type with default value for each datatype
                Atype default_value = null;
                switch(assType){
                    case BOOLEAN:
                        default_value = new Atype(new Boolean(false), false, "BOOLEAN");
                        SymbolTable.setValue(assVariable, default_value);
                        break;
                    case INTEGER:
                        default_value = new Atype(new Integer(0), false, "INTEGER");
                        SymbolTable.setValue(assVariable, default_value);
                        break;              
                    case FLOAT:
                        default_value = new Atype(new Float(0.0), false, "FLOAT");
                        SymbolTable.setValue(assVariable, default_value);
                        break;                        
                    case CHAR:
                        default_value = new Atype(new char[('\u0000')], false, "CHAR");
                        SymbolTable.setValue(assVariable, default_value);
                        break;
                    case ARRAY:
                        //default_value = new Atype(new Array(0.0), false, "ARRRAY");
                        switch(assArrayType) {
                            case BOOLEAN:
                                default_value = new Atype(new Boolean[assArraySize], false, "ARRAY");
                                SymbolTable.setValue(assVariable, default_value);
                                break;
                            case INTEGER:
                                System.out.println("Creating Array type INT SIZE : " + assArraySize.toString());
                                default_value = new Atype(new Integer[assArraySize], false, "ARRAY");
                                SymbolTable.setValue(assVariable, default_value);
                                break;
                            case FLOAT:
                                default_value = new Atype(new Float[assArraySize], false, "ARRAY");
                                SymbolTable.setValue(assVariable, default_value);
                                break;
                            case CHAR:
                                System.out.println("Creating Array type CHAR SIZE : " + assArraySize.toString());
                                default_value = new Atype(new char[assArraySize], false, "ARRAY");
                                SymbolTable.setValue(assVariable, default_value);
                                break;
                            default:
                                break;
                        }
                        break;
                    default:
                        System.out.println("Type NOT EXIST!");
                        break;
                        
                }
            }
      
                
            
        }else if (statementType == ifthen) {

            Atype val = (Atype)ifcondition.getValue();
            if (ifcondition.getErr()) {
                System.out.println("Exception: Type Error");
                System.exit(0);
            }
            else if(val.type.equals("INTEGER")){
                if((Integer)val.value != 0){
                    ifbody.execute();
                }
            }
            else if(val.type.equals("FLOAT")){
                if((Float)val.value != 0){
                    ifbody.execute();
                }
            }
            else if(val.type.equals("BOOLEAN")){
                if((Boolean)val.value){
                    ifbody.execute();
                }
            }
//            if (ifcondition.getValue() != 0) {
//                ifbody.execute();
//            }


        }else if (statementType == ifelse) {

            Atype val = (Atype)ifcondition.getValue();
            if (ifcondition.getErr()) {
                System.out.println("Exception: Type Error");
                System.exit(0);
            }
            else if(val.type.equals("INTEGER")){
                if((Integer)val.value != 0){
                    ifbody.execute();
                }else{
                    elsebody.execute();
                }
            }
            else if(val.type.equals("FLOAT")){
                if((Float)val.value != 0){
                    ifbody.execute();
                }else{
                    elsebody.execute();
                }
            }
            else if(val.type.equals("BOOLEAN")){
                if((Boolean)val.value){
                    ifbody.execute();
                }else{
                    elsebody.execute();
                }
            }


        }else if (statementType == ifthenelse) {
            
            Atype val = (Atype)ifcondition.getValue();
            Atype val2 = (Atype)elseifcondition.getValue();
            
            if (ifcondition.getErr()) {
                System.out.println("Exception: Type Error");
                System.exit(0);
            }
            
            if (elseifcondition.getErr()){
                System.out.println("Exception: Type Error");
                System.exit(0);
            }

            boolean exec_if = false;
            boolean exec_elif = false;
            
            if (val.type.equals("INTEGER")){
                exec_if = ((Integer)val.value != 0);
            }
            else if (val.type.equals("FLOAT")){
                exec_if = ((Float)val.value != 0.0);
            }
            else if (val.type.equals("BOOLEAN")){
                exec_if = ((Boolean)val.value);
            }
            
            if (val2.type.equals("INTEGER")){
                exec_elif = ((Integer)val2.value != 0);
            }
            else if (val2.type.equals("FLOAT")){
                exec_elif = ((Float)val2.value != 0.0);
            }
            else if (val2.type.equals("BOOLEAN")){
                exec_elif = ((Boolean)val2.value);
            }
            
            if (exec_if){
                ifbody.execute();
            }
            else if (exec_elif){
                elseifbody.execute();
            }
            else{
                elsebody.execute();
            }
            

        }else if (statementType == whileloop) {
            
            for (;;) {
                Atype val = (Atype)whileCondition.getValue();
                if(whileCondition.getErr()){
                    System.out.println("Type Error");   
                    System.exit(0);
                }
                else if(val.type.equals("INTEGER")){
                    if((Integer)val.value != 0){
                        
                    whileBody.execute();
                    }
                    else{
                    break;
                    }
                }
                else if(val.type.equals("FLOAT")){
                    if((Float) val.value !=0){
                        whileBody.execute();
                    }
                    else{
                        break;
                    }
                }
                else if(val.type.equals("BOOLEAN")){
                    if((Boolean) val.value){
                        whileBody.execute();
                    }
                    else{
                        break;
                    }
                }
                
//                if (whileCondition.getValue() != 0) {
//                    whileBody.execute();
//                } else {
//                    break;
//                }

            }

        } 
        else if (statementType == print){
            System.out.println("---------CONSOLE----------");
            String out = "";
            for (Aexp expr : printEvalList){
                Atype val = (Atype)expr.getValue();    
                char[] charArrays = new char[]{'1', '2', '3', 'A', 'B', 'C'};
                String str = String.valueOf(val.value);
//                System.out.println("type : "+ val.type+" | print :"+ new String(str));
                if(expr.getErr()){
                    System.out.println("Type Error in printing Evaluation");
                    System.exit(0);
                }
                else{
                    out += val.value.toString() + " ";
                }
                
            }
            
            System.out.println(out);
            System.out.println("--------------------------");
            
        } else if (statementType == block) {
            for (Astat s : blockBody.statementList) {
                
                if(!SymbolTable.context_break){
                    s.execute();
                }
                else{
                    break;
                }
                
            }
        }
        else if (statementType == functiondef){
            // Allocate in global scope
            Atype value = new Atype(fobj, false, "FUNCTION");
            SymbolTable.setValue(fobj.f_id, value, "GLOBAL");
        
        }
        else if (statementType == function_return){
            
            ret_id = SymbolTable.getCurrentContextReturnAddress();
            String cxt = SymbolTable.getCurrentContext();
//            if(ret_id == null){
//                System.out.println("Compiler Error: ret_id should be set by function before call");
//                System.exit(0);
//            }
            
            if (ret_expr != null){
                Atype retval = (Atype)ret_expr.getValue();
                if(retval.getErr()){
                    System.out.println("Exception: Type Error");
                    System.exit(0);
                }
            
            SymbolTable.setValue(ret_id, retval, cxt); // Return address will evaluate at global for now
            }
            
            SymbolTable.context_break = true;
        }
        else if (statementType == function_call_void){
            Atype fn_item = SymbolTable.getGlobalValue(f_void_id);
                    if (fn_item != null){
                        if (fn_item.type.equals("FUNCTION")){
                            // IMPLEMENT HERE!!!!
                            FunctionObject fn = (FunctionObject) fn_item.value;
                            // 1. Evaluate all Aexp first before passing through the method
                            ArrayList<Atype> input_args = new ArrayList<Atype>();
                            for (Aexp expr : f_void_params){
                                Atype v = (Atype)expr.getValue();
                                if(expr.getErr()){
                                    System.out.println("Exception: Type Error for " + f_void_id + " input arguments");
                                    System.exit(0);
                                }
                                else{
                                        input_args.add(v);
                                } 
                            }
                            
                            if(fn.isReturnVoid()){
                                Atype retval = fn.execute(input_args);
                                if(retval != null){
                                    System.out.println("Sorry Something went wrong when call void function" );
                                    System.exit(-1);
                                }
                            }
                            else{
                                System.out.println("Exception: " + "Function :" + f_void_id + " should be evaluated as expression" );
                                System.exit(-1);
                            }
                            
                          
                            
                            
                        }
                        else{
                            System.out.println("Exception: " + "Variable :" + f_void_id + ", type: " + fn_item.type + " is not callable");
                            System.exit(-1);
                        }
                    
                    }
                    else{
                        System.out.println("Exception: " + "Function " + f_void_id + " is not defined");
                        System.exit(-1);
                    }
        }
    }
    
    public boolean checkType(Atype value) {
        boolean checkT = false;
        
        if ((assType == assExpr.getEType())
                        || (value.type.equals("FLOAT") && assType == AexpType.FLOAT) 
                        || (value.type.equals("BOOLEAN") && assType == AexpType.BOOLEAN)
                        || (value.type.equals("INTEGER") && assType == AexpType.INTEGER)){
            checkT = true;            
        }        
        return checkT;
    }
    
}
