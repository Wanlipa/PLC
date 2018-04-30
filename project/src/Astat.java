package src;

import src.Aexp.AexpType;

public class Astat {

    int statementType;
    public static int assignment = 0;
    public static int assigntype = 1;
//    public static int varDeclaration = 1;
    public static int print = 2;
    public static int ifthen = 3;
    public static int block = 4;
    public static int whileloop = 5;
    public static int funDeclaration = 6;
    public static int returnStatement = 7;
    public static int ifelse = 8;
    /*
     * assignment statement: variable = expr
     * adding : floating , boolean
     */
    
    String assVarType;
    String assVariable;
    Aexp assExpr;
    
    
    public static Astat assignment(String Variable, Aexp expr) {
//    public static Astat assignment(String type, String Variable, Aexp expr) {
        Astat statement = new Astat();
        statement.statementType = assignment;

//        statement.assVarType = type;
        statement.assVariable = Variable;
        statement.assExpr = expr;

        return statement;

    }
    
    /*
     * assignment statement: variable = expr
     * adding : floating , boolean
     */
    AexpType assType;
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
      
    public AexpType getEType(){
        return this.assType;
    }
    
    /*
     * varDeclaration statement: Variable : Type
     * 
     */
//    String assDec;
//    Aexp assType;
//    public static Astat varDeclaration(String Variable, Aexp type){
//        Astat statement = new Astat();
//        statement.statementType = varDeclaration;
//        
//        statement.assDec = Variable;
//        statement.assType = type;
//        return statement;
//    }
    
    /*
     * print statement: print e
     */
    Aexp printE;

    public static Astat print(Aexp expr) {

        Astat statement = new Astat();
        statement.statementType = print;
        statement.printE = expr;
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
    
    Aexp ifElse;
    public static Astat ifelse(Aexp expr){
        Astat statement = new Astat();
        statement.statementType = ifelse;
        statement.ifElse = expr;
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
        } else if (statementType == print) {
            return "print " + printE.getexp();
        } else if (statementType == whileloop) {
            return "while " + whileCondition.getexp() + " => " + whileBody.getstat();
        } else if (statementType == block) {
            return "block";
        } else {
            return "unknown";
        }
    }

    public void execute() {

        if (statementType == assignment) {
            Atype value = (Atype)assExpr.getValue();
            SymbolTable.setValuet(assVariable, value);
//            SymbolTable.setValue(assVarType , assVariable, assExpr.getValue());
            
//        } else if (statementType == varDeclaration) {
//            SymbolTable.setType(assDec, assType.getType());
        }else if (statementType == assigntype){
            Atype value = null;
            value = (Atype) assExpr.getValue();
                if ((assType == assExpr.getEType())
                        || (value.type.equals("FLOAT") && assType == AexpType.FLOAT) 
                        || (value.type.equals("BOOLEAN") && assType == AexpType.BOOLEAN)
                        || (value.type.equals("INTEGER") && assType == AexpType.INTEGER)){
                SymbolTable.setValuet(assVariable, value);
                }
                else{
                SymbolTable.setValuet(assVariable, value);    
                }
//            SymbolTable.setValuet(assVariable, new Atype(assType.toString(), ));
            
        }else if (statementType == ifthen) {

            Object val = ifcondition.getValue();
            if (ifcondition.getErr()) {
                System.out.println("Type Error");
                System.exit(0);
            }
            else if(val instanceof Integer){
                if((Integer)val != 0){
                    ifbody.execute();
                }
            }
            else if(val instanceof Float){
                if((Float)val != 0){
                    ifbody.execute();
                }
            }
            else if(val instanceof Boolean){
                if((Boolean)val){
                    ifbody.execute();
                }
            }
//            if (ifcondition.getValue() != 0) {
//                ifbody.execute();
//            }


        } else if (statementType == whileloop) {
            
            for (;;) {
                Atype val = (Atype)whileCondition.getValue();
                if(whileCondition.getErr()){
                    System.out.println("Type Error");   
                    System.exit(0);
                }
                else if(val.value instanceof Integer){
                    if((Integer)val.value != 0){
                        
                    whileBody.execute();
                    }
                    else{
                    break;
                    }
                }
                else if(val.value instanceof Float){
                    if((Float) val.value !=0){
                        whileBody.execute();
                    }
                    else{
                        break;
                    }
                }
                else if(val.value instanceof Boolean){
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

        } else if (statementType == print) {

            System.out.println(printE.getValue());     
            System.out.println(printE.getexp());
            System.out.println(printE.getType());
            System.out.println("-------------------");
            
            Atype val = (Atype)printE.getValue();
            
            if(printE.getErr()){
                System.out.println("Type Error");
                System.exit(0);
            }
            else{
            System.out.println(val.value);
            }

        } else if (statementType == block) {
            for (Astat s : blockBody.statementList) {
                s.execute();
            }
        }
    }
}
