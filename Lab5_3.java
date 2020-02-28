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
public class Lab5_3 {
  public static void main(String[] args) { 
   
   int rolls, sides;
   int numHit=0;
   int numtrack=0;
   double chance;
   Scanner scan=new Scanner(System.in);
   
   System.out.print("Enter how many sides you would like on the die ");
   sides=scan.nextInt();
    
   if (sides<4)
       sides=4;
   
   System.out.print("How many times would you like to roll both die ");
   rolls=scan.nextInt();
   System.out.print("Enter the number you would like to track ");
   numtrack=scan.nextInt();
   
   
   Die x=new Die(sides);
   Die y=new Die(sides);
   

  while (numtrack>sides)
  {
      System.out.println("Enter a number to track less than " + sides);
      System.out.println("Enter the number you would like to track");
      numtrack=scan.nextInt();
  }
  
  int num1=0; 
  int num2=0;
  int rollcount=0;
  
   for(int i=1; i<=rolls; i++)
   {   
       num1=x.roll();
       num2=y.roll();
       
       if (num1==numtrack)
           numHit++;
       
       if (num2==numtrack)
           numHit++;
       
       rollcount+=2;
   
    chance=100*(double)numHit/rollcount;
    System.out.println("X roll: " + num1 + " Y roll: " + num2 + " Chance of # landing: " + chance  + "%  # of times landed " + numHit);
       
   }
   
  }
  
}
