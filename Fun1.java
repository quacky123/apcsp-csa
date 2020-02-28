/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fun;

import java.util.Random;
/**
 *
 * @author 2
 */
public class Fun1{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Random rand= new Random();
    
    int num1, num2, num3;
    num1=rand.nextInt(800);
    num2=rand.nextInt(742);
    num3=rand.nextInt(10000);
    
    System.out.printf("Phone Number: %03d-%03d-%04d\n", num1, num2,num3);
        
        
    }
                       
    }
    

