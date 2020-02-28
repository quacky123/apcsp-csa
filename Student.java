/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fun;

/**
 *
 * @author 2
 */
public class Student {
      
  private String personName;
  private int quizTot=0;
  private double Average;
  
  private int scoreCurrent;
  private int scoreAccum;

    public Student(String name, int score, int quizNum, int scoreTot)
    {
      personName= name;
      quizTot= quizNum;
      scoreCurrent=score;
      scoreAccum=scoreTot;
    }
    
    public double Average()
    {
     Average = (double) scoreAccum/quizTot;
     return Average;
    }
    
    public String getName()
    {
        return personName;
    }
    
    public int getScoreAccum()
    {
        return scoreAccum;
    }
        
    public String toString()
    {
       String result;
       result="Name: "+ getName() + " Average: " + Average() + " Total Quiz Score: " + getScoreAccum() + " # of Quizzes Taken: " + quizTot;
       return result;
    }
}


