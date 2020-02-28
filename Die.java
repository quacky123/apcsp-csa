/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fun;
import java.util.Random;
/**
 *
 * @author 2
 */
public class Die {
    int face;
    int sides;
    
    public Die(int dieSides)
    {
     sides = dieSides;
    }
    
    public int roll() 
   {
       return face=(int) (Math.random() * sides +1);
    }
    
    
}
