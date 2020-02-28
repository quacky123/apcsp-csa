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
public class RoachPopulation {

 public int size;
    public RoachPopulation(int START)
    {
        size=START;
    }
    
    public int waitforDoubling()
    {
        size*=2;
        return size;
    }

    public int SprayRoaches()
    {
        size*=0.9;
        return size;
    }
    public int getRoaches()
    {
        return size;
    } 
    
       
    
}
