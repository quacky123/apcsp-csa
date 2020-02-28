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
public class Lab5_6 {
   public static void main(String[] args) { 
    Scanner scan=new Scanner(System.in);
    
    System.out.print("Enter the mpg of the car: ");
    int mpg=scan.nextInt();
    
     System.out.print("Enter the number of gallons you would like to add in the empty tank: ");
     double galInitial=scan.nextLong();
     Car x=new Car(mpg, galInitial);
     x.FirstGas(galInitial);

    double distance = 0.0;
    String ans;
    double galAdd;
    
    for (int i=1; i>0; i++)
    {
        System.out.println("Enter how far you would like to travel");
        distance=scan.nextDouble();
        x.Drive(distance);
        System.out.println(x);
        System.out.println();

        while (x.fueltank<0)
        {
            System.out.println("Enter a distance less than " + x.fueltank);
            System.out.println("Enter how far you would like to travel");
            x.Drive(distance);
            System.out.println();
        }
        
     while (x.fueltank<x.beforefueltank && x.fueltank>=0)
     {
        System.out.println("Fill up gas: y or n. Enter 1 to check gas levels");
        ans=scan.next();
        System.out.println();

        
        if (ans.equals("1"))
        {
            x.getGas();
            System.out.println(x);
            System.out.println();
            continue;
        }
            
        if (ans.equals("y"))
        {
            System.out.println("Enter how many gallons you would like to enter");
            galAdd=scan.nextDouble();
            x.AddGas(galAdd);
            System.out.println(x);
            System.out.println();

        }
        if (ans.equals("n"))
            break;
        else
            continue;
     }  
        
    }
    
   }
}