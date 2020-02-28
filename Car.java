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
public class Car {
    public double fueltank=0;
    private double eff;
    private double NumGalAdded;
    private double galInt;
    public double beforefueltank;
    
    public Car(int mpg, double galInitial)
    {   
     eff=mpg;
     galInt=galInitial;
    }
    
    public double FirstGas(double galInitial)
    {
      double addintgal=galInitial;
     
     fueltank+=(addintgal*eff);
     return fueltank;

    }
    public double AddGas(double galAdd)
    {
     NumGalAdded=galAdd;
     
     fueltank+=(NumGalAdded*eff);
     return fueltank;
    }

        
    public double getGas()
    {
        return fueltank;
    }
 
    
    public double Drive(double distance)
    {
      beforefueltank=fueltank;
     
     if (fueltank>0)
     {
         fueltank-=distance;
         if (fueltank<0)
         {
             fueltank=beforefueltank;
             System.out.println("Enter a distance less than in the fueltank" + "which is " + beforefueltank);
         } 
     }
     return fueltank;  
    }
    
    public String toString()
    {
        String result= "Current fuel tank level " + fueltank + "miles";
        return result;
    }
    
}
