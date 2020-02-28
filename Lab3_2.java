/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fun;
import java.util.Scanner;
/**
 * Aadi Jain
 * @author 2
 */
public class Lab3_2 {
   public static void main(String[] args) { 
       int age, price, total;
       price=0;
       total=0;                     //variables
       String residence;
       final int CHILD=5;
       final int SENIOR=65;
       
       
       for (int i=1; i<=4; i++) {
     
           System.out.println("Enter the age of the person");
           Scanner scan= new Scanner (System.in);
           age=scan.nextInt();
           System.out.println("Enter the county of residence");
           residence=scan.next();
           residence=residence.toLowerCase();
           
           if (age>=CHILD && age<SENIOR)
           {    
               if (residence.equals("union"))
                   price=30;
               else
                   price=40; 
           }
           else
           {    
               if (age<CHILD)
                   price=0;
               else 
                   price=20; 
           }
           
           System.out.println("The price of the ticket is: " + price);
           System.out.println();
           total+=price;
       }
       
    System.out.println("The total cost is: " + total);
}
}
