/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author kandithws
 */
public class FunctionObject {
    
    ArrayList<FuncArg> argslist;
    //ArrayList<Integer> ret_statement_idxs;
    Astat f_body;
    //String scope_addr;
    String ret_type;
    String ret_id; // create at runtime at global scope
    String f_id;
    
    // ArrayList<Atype> binded_input_args;
    
    
   FunctionObject(String function_id ,String return_type, ArrayList<FuncArg> args, Astat block ){
       this.f_id = function_id;
       this.ret_type = return_type;
       this.argslist = args;
       
       if (block.statementType != Astat.block){
           System.out.println("Compiler: Function Syntax Error!");
           System.exit(0);
       }
       
       // ret_statement_idxs = new ArrayList<Integer>();
     
//       boolean ret_exist = false;
//       for (Astat s : block.blockBody.statementList){
//           if (s.statementType == Astat.function_return){
//               ret_exist = true;
//               break;
//           }
//       }
//       
//       if (!ret_exist){
//           System.out.println("Compiler: Function :" + f_id  + " has no return statement");
//           System.exit(0);
//       }
       // Validate return
       
       this.f_body = block;
   }
   
   public boolean isReturnVoid(){
       return this.ret_type.equals("VOID");
   }
    
    
   public Atype execute(ArrayList<Atype> inputs){
       // 1. Validate type of CAll args
       validateArgs(inputs);
       // 2. Set context
       // 2.1 declare return address
       if (!isReturnVoid()){
           createReturnID(); // in global scope
       }
       
       
       String current_context = SymbolTable.createUniqueContext();
       
       SymbolTable.pushContext(current_context);
       if (!isReturnVoid()){
           SymbolTable.setContextReturnAddress(current_context, ret_id);
       }
       
       // set return address for return statement in blocks
       

       // 2.5 bind input args to call context, Kind of Copying Mechanism
       for (int i = 0; i < argslist.size(); i++){
           FuncArg fa = argslist.get(i);
           Atype in = inputs.get(i);
           
           SymbolTable.setValue(fa.arg_id, in); //
       }
      
       // 3. Execute block
       f_body.execute();
       // 3.2 evaluate return value
       Atype retval = null;
       if (!isReturnVoid()){

        retval = SymbolTable.getValue(ret_id);
        
        if(retval == null){
            System.out.println("Compiler Error:  Cannot get return value of " + f_id + "at context: " + current_context  );
            System.exit(0);
        }
        
        // return type evaluation
        if (!retval.type.equals(ret_type)){
            System.out.println("Exception: Function " + f_id + "Return type miss matched");
            System.out.println("Expected Return type: " + ret_type + ", Get: " + retval.type);
            System.exit(0);
        }
       }
       
       // 4. Clear Context
       SymbolTable.popContext();
       SymbolTable.clearContextData(current_context);
       SymbolTable.context_break = false;
       return retval;
       //System.exit(0);
   }
   
   private void validateArgs(ArrayList<Atype> inputs){
       if (inputs.size() != argslist.size()){
           System.out.format("Exception: Invalid call for function: %s, Given = %d  Expected = %d \n", f_id, inputs.size() , argslist.size() );
           System.exit(0);
       }
       
       for (int i = 0; i < argslist.size(); i++){
           FuncArg fa = argslist.get(i);
           Atype in = inputs.get(i);
           
           if (! fa.compareType(in)){
               System.out.println("Exception: Parameter mismatch for function call: " + f_id + "()");
               System.exit(0);
           }
       
       }
   
   }
   
   private void createReturnID(){
       //this.ret_id =  f_id + "_" + "ret" + "@" + randomString(6);
       this.ret_id =  f_id + "_" + "ret";
   }
   
   
   private static String randomString(int len) {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < len) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

   }
    
    
}
