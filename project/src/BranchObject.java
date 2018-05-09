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
public class BranchObject {
    public Aexp condition;
    public Astat body;
    
    public BranchObject(Aexp cond, Astat s){
        this.condition = cond;
        this.body = s;
    }
    
    public static ArrayList<BranchObject> createArrayList(BranchObject bo){
        ArrayList<BranchObject> l = new ArrayList<BranchObject>();
        l.add(bo);
        return l;
    }
    
    public static ArrayList<BranchObject> appendArrayList(ArrayList<BranchObject> l, BranchObject bo){
        ArrayList<BranchObject> l2 = new ArrayList<BranchObject>(l);
        l2.add(bo);
        return l2;
    }
    
    
}
