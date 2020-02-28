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
public class Lab3_6 {
    public static void main(String[] args) { 
        
    System.out.println("Enter a string");
    Scanner scan=new Scanner (System.in);
    String str=scan.next();
    System.out.println();
    
    int length=str.length()-1;
    
        for (int j=0; j<=length; j++)
            System.out.println(str.charAt(j));
    }
}
