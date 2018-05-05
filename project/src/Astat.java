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
    
    public static ArrayList<Aexp> createPrintArrayList(Aexp e){
        ArrayList<Aexp> l = new ArrayList<Aexp>();
        l.add(e);
        return l;
    }
    
    public static ArrayList<Aexp> appendPrintArrayList(ArrayList<Aexp> p, Aexp e){
        ArrayList<Aexp> l = new ArrayList<Aexp>(p);
        l.add(e);
        return l;
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
                //System.out.println("Array CLASS NAME: " + id.value.getClass().getSimpleName());
                String id_type =  id.value.getClass().getSimpleName();
                String array_val_type = id_type.substring(0, id_type.length() - 2 ).toUpperCase(); // should get something like FLOAT, INTEGER, BOOLEAN
                // System.out.println("Array Type:" + array_val_type);
                // System.out.println("Value Type:" + value.type);
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
                      tmp[idx] = (char) value.value;
                      id.value = tmp;
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
            System.out.println("-------------------");
            String out = "";
            for (Aexp expr : printEvalList){
                Atype val = (Atype)expr.getValue();
                if(expr.getErr()){
                    System.out.println("Type Error in printing Evaluation");
                    System.exit(0);
                }
                else{
                    out += val.value.toString() + " ";
                }
                
            }
            
            System.out.println(out);
            
        } else if (statementType == block) {
            for (Astat s : blockBody.statementList) {
                s.execute();
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
