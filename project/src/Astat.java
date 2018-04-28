package src;

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
    String assVariable;
    Aexp assExpr;
    String assVarType;
    

    public static Astat assignment(String Variable, Aexp expr) {
        Astat statement = new Astat();
        statement.statementType = assignment;

        statement.assVariable = Variable;
        statement.assExpr = expr;

        return statement;

    }
    
    /*
     * assignment statement: variable = expr
     * adding : floating , boolean
     */
    Atype assType;
    String assVartype;
    Aexp assExprtype;

    public static Astat assigntype(Atype type, String Variable, Aexp expr) {
        Astat statement = new Astat();
        statement.statementType = assigntype;

        statement.assType = type;
        statement.assVartype = Variable;
        statement.assExprtype = expr;

        return statement;

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
            
            SymbolTable.setValue(assVariable, assExpr.getValue());
            
//        } else if (statementType == varDeclaration) {
//            SymbolTable.setType(assDec, assType.getType());
        
        }else if (statementType == ifthen) {

            if (ifcondition.getValue() != 0) {
                ifbody.execute();
            }


        } else if (statementType == whileloop) {

            for (;;) {

                if (whileCondition.getValue() != 0) {
                    whileBody.execute();
                } else {
                    break;
                }

            }

        } else if (statementType == print) {

            System.out.println(printE.getValue());     
            System.out.println(printE.getexp());
            System.out.println(printE.getType());
            System.out.println("-------------------");

        } else if (statementType == block) {
            for (Astat s : blockBody.statementList) {
                s.execute();
            }
        }
    }
}
