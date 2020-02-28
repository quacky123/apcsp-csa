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
public class Lab5_2 {
    
    public static void main(String[] args) { 
        
    String response;  
    int i=1;
     Scanner scan=new Scanner(System.in);

    Lightbulb b1=new Lightbulb();
    Lightbulb b2=new Lightbulb();
    Lightbulb b3=new Lightbulb();
    Lightbulb b4=new Lightbulb();
    Lightbulb b5=new Lightbulb();

      while (i>0)
        {  
    System.out.print("Enter the number of the bulb you want to turn off or on: ");
    response=scan.next();
    
    
    if (response.equals("1"))
        b1.Switch();
    else if (response.equals("2"))
        b2.Switch();                
    else if (response.equals("3"))
        b3.Switch();
    else if (response.equals("4"))
        b4.Switch();
    else if (response.equals("5"))
        b5.Switch();
    else
        System.out.println("Try Again");
           
    
    System.out.println("Bulb One: "+ b1);
    System.out.println("Bulb Two: "+ b2);
    System.out.println("Bulb Three: "+ b3);
    System.out.println("Bulb Four: "+ b4);
    System.out.println("Bulb Five: "+ b5);
    System.out.println();
        }
    }
}
