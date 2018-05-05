package src;

import java.util.Hashtable;

public class SymbolTable extends Hashtable<String,Object>{
    
    
    static SymbolTable globalTable;
    
    static {globalTable = new SymbolTable();}

    
    static void setValue(String id, Atype value){
        globalTable.put(id, value);
    }


    static Atype getValue(String id){
        return (Atype) globalTable.get(id);
    }
    

}
