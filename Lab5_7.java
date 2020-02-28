/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fun;
import java.util.Scanner;
/**
 *
 * @author 2
 */
public class Lab5_7 {
    public static void main(String[] args) { 
        Scanner scan=new Scanner(System.in);
        
        final int START=10;
        
        RoachPopulation x=new RoachPopulation(START);
        
        for (int i=1; i>0; i++)
        {
        System.out.println("To double the population, enter 1. To spray the roaches, enter 2. To see the current roach population, enter 3");
        int answer=scan.nextInt();


            if (answer==1)    
                 x.waitforDoubling();
             else if (answer==2)
                  x.SprayRoaches();
            else if (answer==3)
                   x.getRoaches();
             else 
           System.out.println("Enter a number between 1 and 3");
        
        System.out.println("Current roach count: " + x.size);
        System.out.println();
        }
        
    }
}
