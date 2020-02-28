/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fun;
import java.util.Scanner;
import java.math.*;
import java.util.Random;
import java.util.Timer;
/**
 *
 * @author 2
 */
public class Lab3_EC {
    public static void main(String[] args) { 

    int  playerlose, tie, roundnum, playerwin, compwin, complose;
    String input=""; 
    String computer ="";
    Timer timer=new Timer();

    
    roundnum=0;
    playerwin=0;            // giving values to all the variables
    playerlose=0;
    tie=0;
    compwin=0;
    complose=0;
    
    String [] computernum={"rock", "paper", "scissors", "spock", "lizard"};
    int roll=0;
    


    while(playerwin<10 && compwin<10){
        System.out.println("You have 15 seconds to choose or else the program will stop");
        System.out.println("Enter a string which is either paper, scissors, spock, lizard, or rock.");
        System.out.println("Enter 0 to quit the program."); //sentinel value
        Scanner scan= new Scanner (System.in);
        
        input=scan.next();
        input=input.toLowerCase();
    
        if (input.equals("0"))
            System.exit(0);
        
        roundnum ++;
        roll=(int) (Math.random() * 5);
        computer=computernum[roll].toString();

        System.out.println("Computer chose :" + computer + ":");
        System.out.println("You chose :" + input + ":");

       if (input.equals(computer)) {
           System.out.println("It's a tie");
           tie++;
       }
       
       if (input.equals("paper") && computer.equals("scissors")){     //paper and scissors
           compwin++;
           playerlose++;
       }
       else if (input.equals("scissors") && computer.equals("paper")){  
                   complose++;
                   playerwin++;
       }
       
       if (input.equals("rock") && computer.equals("scissors")) {       //rock and scissors
               playerwin++;
               complose++;
       }
       else if (input.equals("scissors") && computer.equals("rock")){
                playerlose++;
                compwin++; 
       }
       
       if (input.equals("lizard") && computer.equals("paper")){         //lizard and paper
                playerwin++;
                complose++; 
       }
       else if (input.equals("paper") && computer.equals("lizard")){
                playerlose++;
                compwin++; 
       }
       
       if (input.equals("scissors") && computer.equals("lizard")) {     //scissors and lizards
                playerwin++;
                complose++; 
       }
       else if (input.equals("lizard") && computer.equals("scissors")) {
                playerlose++;
                compwin++;
       }
       
       if (input.equals("rock") && computer.equals("lizard")) {      // rock and lizard
                playerwin++;
                complose++; 
       }
       else if (input.equals("lizard") && computer.equals("rock")) {
                playerlose++;
                compwin++; 
       }
      
      if (input.equals("paper") && computer.equals("rock")) {     //rock and paper
                playerwin++;
                complose++; 
      }
      else if (input.equals("rock") && computer.equals("paper")) {
                playerlose++;
                compwin++; 
      }
      
      if (input.equals("spock") && computer.equals("rock")) {   //spock and rock
                playerwin++;
                complose++; 
      }
      else if (input.equals("rock") && computer.equals("spock")) {
                playerlose++; 
                compwin++; 
      }
      
      if (input.equals("lizard") && computer.equals("spock")) {   //spock and lizard
                playerwin++;
                complose++; 
      }
      else if (input.equals("spock") && computer.equals("lizard")) {
                playerlose++;
                compwin++;
      }
      
      if (input.equals("paper") && computer.equals("spock")) {  // spock and paper
                playerwin++;
                complose++; 
      }
      else if (input.equals("spock") && computer.equals("paper")) {
                playerlose++;
                compwin++; 
      } 
      
      if (input.equals("spock") && computer.equals("scissors")) {   //spock and scissors
                playerwin++;
                complose++; 
      }
      else if (input.equals("scissors") && computer.equals("spock")) {
                playerlose++;
                compwin++; 
      }
           
    
   
    if (playerwin > 10) {      // if statement to determine who won
            System.out.println("You are the winner");
    }
    else if (compwin> 10) {
            System.out.println("You lost, the computer won");
    }

    System.out.println("Round #: "+ roundnum);  //scores
    System.out.println("You have won: " + playerwin + " rounds");
    System.out.println("You have lost: " + playerlose + " rounds");
    System.out.println("Both of you have tied: " + tie + " rounds");
    System.out.println("The computer has won: " + compwin + " rounds");
    System.out.println("The computer has lost: " + complose + " rounds"); 
    System.out.println();
}
          
} 
}


