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
public class Lab5_5 {
    public static void main (String[] args) {
     String name;
     int score;
     int quizNum=1;
     Scanner scan=new Scanner(System.in);
     int scoreTot=0;
    for (int i=1; i>0; i++)
    {
        System.out.println("Enter the name of the student");
        name=scan.next();
        System.out.println("Enter the quiz score. Enter -1 to exit the program");
        score=scan.nextInt();
        
        scoreTot+=score;
        Student a=new Student(name, score, quizNum, scoreTot);
        quizNum++;
        System.out.println(a);
    }
}

}
