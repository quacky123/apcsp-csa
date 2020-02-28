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
public class Lab5_4 {
   public static void main(String[] args) { 
       
       String name;
       int salary;
       Scanner scan=new Scanner(System.in);
               

       for (int i=1; i>0; i++)
       {
        System.out.println("Enter the name of the worker");
        name=scan.next();
        System.out.println("Enter the salary of the worker");
        salary=scan.nextInt();
        
         while (salary<0)
         {
            System.out.println("Enter a salay of the worker greater than 0. ");
            salary=scan.nextInt();
         }
        
        Employee x=new Employee(name, salary);

        System.out.println(x);
        System.out.println();
        
       }
           
           
       }
           
      }
   
   


