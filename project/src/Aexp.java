package src;

public class Aexp {

    private enum AexpType {
        INTEGER,        
        FLOAT,
        ID,
        BOOLEAN,
        EXP
    }
    
    private final AexpType eType;
    private Integer inum;
    private Float fnum;
    private String id;
    private Boolean bl;
    
    
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
    

    Aexp(Args x, int op) {
        eType = AexpType.EXP;
        operands = x;
        operator = op;
    }

    public String getexp() {

        String s = "";
        switch (this.eType) {
            case INTEGER: s = "" + inum; break;
            case FLOAT: s = "" + fnum; break;
            case ID: s = id; break;
            case BOOLEAN: s = bl.toString(); break;
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

    public int getValue() {
        Integer val = 0;
//        Float fval = 0.0f;
        switch (this.eType) {
            case INTEGER:
                // expression is a number
                val = inum; break;
            case FLOAT:
                //expression is a number
                val = (int)(Math.round(fnum)); break;
//                fval = fnum; break;
//                System.out.print(fnum + " is float can't calculate");
//                System.exit(0);
            case ID:
                //expression is a variable
                val = SymbolTable.getValue(id);
                if (val == null) {
                    System.out.print(id + " was not declared");
                    System.exit(0);
                }   break;
            case BOOLEAN:
                //expression is a variable
                val = SymbolTable.getValue(bl.toString());
                if (val == null) {
                    System.out.print(bl + " was not declared");
                    System.exit(0);
                }   break;
            case EXP:
                //expression is a math expression
                switch (operator) {
                    case sym.PLUS:
                        val = operands.getfi().getValue() + operands.getse().getValue();
                        break;
                    case sym.MINUS:
                        val = operands.getfi().getValue() - operands.getse().getValue();
                        break;
                    case sym.TIMES:
                        val = operands.getfi().getValue() * operands.getse().getValue();
                        break;
                    case sym.DIVIDE:
                        val = operands.getfi().getValue() / operands.getse().getValue();
                        break;
                    default:
                        break;
                } break;
            default: break;
        }
        return val;
    }
    
    public float getValuef() {
        Float fval = 0.0f;
        switch (this.eType) {
            case INTEGER:
                // expression is a number
                fval = (float)inum; break;
            case FLOAT:
                //expression is a number
                fval = fnum; break;
            case ID:
                //expression is a variable
                fval = SymbolTable.getValuef(id);
                if (fval == null) {
                    System.out.print(id + " was not declared");
                    System.exit(0);
                }   break;
            case BOOLEAN:
                //expression is a variable
                fval = SymbolTable.getValuef(bl.toString());
                if (fval == null) {
                    System.out.print(bl + " was not declared");
                    System.exit(0);
                }   break;
            case EXP:
                //expression is a math expression
                switch (operator) {
                    case sym.PLUS:
                        fval = operands.getfi().getValuef() + operands.getse().getValuef();
                        break;
                    case sym.MINUS:
                        fval = operands.getfi().getValuef() - operands.getse().getValuef();
                        break;
                    case sym.TIMES:
                        fval = operands.getfi().getValuef() * operands.getse().getValuef();
                        break;
                    case sym.DIVIDE:
                        fval = operands.getfi().getValuef() / operands.getse().getValuef();
                        break;
                    default:
                        break;
                } break;
            default: break;
        }
        return fval;
    }
        
    public String getType(){    
        String t = "";
            switch (this.eType) {
                case INTEGER: t = "Integer" ; break;
                case FLOAT: t = "Float"; break;
                case ID: t = "Char"; break;
//                        t = SymbolTable.getType(id);
//                        if (t == null) {
//                            System.out.print(id + " was not Type");
//                            System.exit(0);
//                        }   break;
                
                case BOOLEAN: t = "Boolean"; break;           
                default: break;
            }        
        return t;
    }
    
}
