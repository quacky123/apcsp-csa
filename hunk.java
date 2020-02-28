/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fun;

/**
 *
 * @author 2
 */
public class hunk {
    
    private int agenum=0;
    private String who;
    public hunk(int age, String name)
    {
        agenum=age;
        who=name;
    }
    
    public int setAge()
    {
        agenum+=agenum;
        return agenum;
    }
    
    public String toString() 
    {
      return (who + "'s age is " + agenum);  
    }    
}
