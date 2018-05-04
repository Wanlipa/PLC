/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author wanlipa
 */
public class Atype<V, Boolean> {
    
    public final V value;
    // public final Boolean error;
    public final boolean error;
    public String type;
//    Atype (V value, Boolean error,String type){
//        this.value = value;
//        this.error = error;
//        this.type = type;
//    }
    
       Atype (V value, boolean error,String type){
        this.value = value;
        this.error = error;
        this.type = type;
    }
       
    
    public void setType(String type){
        this.type = type;
    }
    
    public boolean getErr(){
        return this.error;
    }
    
    
    public static Atype createConcatPrintString(Atype p, Aexp expr){
        System.out.println("HEllo world");

        if (p.type == "PRINTSTRING"){
            Atype val = (Atype)expr.getValue();
            String eval_str = p.value + val.value.toString();
            return new Atype(eval_str, false , "PRINTSTRING");
        }
        else{
            return new Atype("", true, "PRINTSTRING");
        }
        
    }
    
    
    public static Atype createPrintEval(Aexp expr){
        // Hacking, evaluate on the fly
        String eval_str = "";
        System.out.println("Create print Eval");
        Atype val = (Atype)expr.getValue();
         System.out.println("22222222222222222222222222");
        eval_str = val.value.toString();
        System.out.println(eval_str);
        Atype out = new Atype(eval_str, false, "PRINTSTRING");
        return out;
    }
    
 
    

}
