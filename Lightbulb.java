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

enum switchStatus { ON, OFF };

public class Lightbulb {

     
    switchStatus status = switchStatus.OFF;
    
    public Lightbulb()
    {
            
    }
    
    public void On()
    {
        status = switchStatus.ON;      
    }
    
    public void Off()
    {
        status = switchStatus.OFF;
    }
    
    public void Switch()
    {
        if (status == switchStatus.OFF)
        {
           On();
           
        }
        else 
        {   
           Off();
        }
        
        return ;
    }
   
    
    public String toString()
    {
        //System.out.println(status);
        return status.toString();
    }
}