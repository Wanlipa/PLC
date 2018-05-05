/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;
import java.util.*;

/**
 *
 * @author kandithws
 */
public class FuncArg {
    
    public String type;
    public String arg_id;
    public static String[] permitted_types = {"INTEGER", "CHAR", "BOOLEAN", "FLOAT"};
    
    public FuncArg(String t, String a_id){
        String tmp_type = t.toUpperCase();
        if (tmp_type.equals("INT")){
            tmp_type = "INTEGER";
        }
        
        boolean is_permitted = false;
        for (String p_type : this.permitted_types){
            if (tmp_type.equals(p_type)){
                is_permitted = true;
                break;
            }
        }
        
        if (!is_permitted){
            System.out.println("Exception => Function type not permitted");
            System.exit(-1);
        }
        this.type = tmp_type;
        this.arg_id = a_id;
    }
    
    public String toString(){
        return "[fargs=> type: " + type + ", " + "arg_id: " + arg_id + "]"; 
    }
    
    public boolean compareType(Atype t){
        return (t.type.equals(this.type));
    }
    
    public static ArrayList<FuncArg> createArrayList(FuncArg fa){
        ArrayList<FuncArg> l = new ArrayList<FuncArg>();
        l.add(fa);
        return l;
    }
    
    public static ArrayList<FuncArg> appendArrayList(ArrayList<FuncArg> l, FuncArg fa){
        ArrayList<FuncArg> l2 = new ArrayList<FuncArg>(l);
        l2.add(fa);
        return l2;
    }
    
    
}
