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
    
    public V value;
    public final boolean error;
    public String type;

    
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
    
    public boolean typeEquals(Atype x){
        return (this.type.equals(x.type));
    }
    
    public String getArrayValueType(){
        if (this.type.equals("ARRAY") ){
            String tmp = this.value.getClass().getSimpleName();
            return tmp.substring(0, tmp.length() - 2 ).toUpperCase(); // should get something like FLOAT, INTEGER, BOOLEAN
        }
        else{
            return "";
        }
    }
   
}
