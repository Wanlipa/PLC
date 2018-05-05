package src;

import java.util.Hashtable;
import java.util.*;

public class SymbolTable extends Hashtable<String,Object>{
    
    
    static SymbolTable globalTable;
    
//  public String context_id = null;
    
    public ArrayList<String> context_ids; // Stack like, last elem is the top
    
    public Hashtable<String, String> context_return_addrs;
    
    public static boolean context_break = false;

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
    
    
    public static String setContextReturnAddress(String context_id, String addr){
        return globalTable.context_return_addrs.put(context_id, addr);
    }
    
    public static String getContextReturnAddress(String context_id){
        return globalTable.context_return_addrs.get(context_id);
    }
    
    public static String getCurrentContextReturnAddress(){
        String curr_context = getCurrentContext();
        if ( !curr_context.equals("GLOBAL")){
            return getContextReturnAddress(curr_context);
        }
        else{
            return null;
        }
    }
    
    public static String createUniqueContext(){        
        // TODO -- while loop until unique
        return randomString(8);
    }
    
    public static void pushContext(String c){
        globalTable.context_ids.add(c);
    }
    
    public static boolean popContext(){
        if (globalTable.context_ids.size() > 0){
            globalTable.context_ids.remove(globalTable.context_ids.size() - 1);
            return true;
        }
        
        return false;
    }
    
    public static void clearContext(){
        globalTable.context_ids.clear();
    }  
    
    public static void clearContextData(String context_id){
        for (Iterator<Map.Entry<String, Object> > it = globalTable.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, Object> item = it.next();
            String key = item.getKey();
            if (key.contains("#" + context_id)){
                it.remove();
            }
        }
        
        globalTable.context_return_addrs.remove(context_id);
        
        // Todo remove context return address
    }
    
    
    static {globalTable = new SymbolTable();
            globalTable.context_ids = new ArrayList<String>();
            globalTable.context_return_addrs = new Hashtable<String, String>();}

    
    static void setValue(String id, Atype value){
        // For now will only writeable to local scope
        // In the future may need keywords like (global in python) to determine scope
        if (globalTable.context_ids.size() > 0){
            String curr_context = getCurrentContext();
            globalTable.put(id + "#" + curr_context, value);
        }
        else{
            // Original Global Scope
            globalTable.put(id, value);
        }
        
    }
    
    static void setValue(String id, Atype value, String context_id){
        if (context_id.equals("GLOBAL")){
            globalTable.put(id, value);
        }
        else{
            globalTable.put(id + "#" + context_id, value);
        }
    }


    static Atype getValue(String id){
        if (globalTable.context_ids.size() > 0){
            // Traceback scopes
            for (int i = globalTable.context_ids.size() - 1; i >= 0; i-- ){
                String curr_scope = globalTable.context_ids.get(i);
                Atype tmp = (Atype) globalTable.get(id + "#" + curr_scope);
                if (tmp != null){
                    return tmp;
                }
                
            }          
            // If it comes to here means that it might be in global scope
            return (Atype) globalTable.get(id);
          
        }
        else{
            // Original Global Scope
            return (Atype) globalTable.get(id);
        }
               
    }
    
    static Atype getGlobalValue(String id){
        return (Atype) globalTable.get(id);
    }
    
    public static String getCurrentContext(){
        if (globalTable.context_ids.size() > 0){
            return globalTable.context_ids.get(globalTable.context_ids.size() - 1);
        }
        else{
            return "GLOBAL";
        }
    }
    
    private static String getPreviousContext(){
        if (globalTable.context_ids.size() > 1){
            return globalTable.context_ids.get(globalTable.context_ids.size() - 2);
        }
        else{
            return "GLOBAL";
        }
    }
    
    
    
    

}
