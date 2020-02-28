package fun;

import java.util.Scanner;
import java.util.ArrayList;

// Aadi Jain

public class Lab8_3 {
          public static void main(String[] args) {
          
          Scanner scan=new Scanner(System.in);
          ArrayList friends = new ArrayList();
          
          int MIN=1;
          int MAX=10;
          String count="";
          int e=1;
          int ans, output;
          
          
          while (e==1)
          {
              System.out.print("Enter a number between 1 and 100. Enter 999 to exit the program: \t");
              ans=scan.nextInt();              
              
              if (ans>100 || ans<0)
              {
                  System.out.print("Please enter a value between 0 and 100");
                  System.out.println();
                  scan.nextLine();
              }
              
              friends.add(ans);
              System.out.println();
          
            if (ans==999)              //exit program if statement
            {
                System.out.println();
                
                  for (int i=0; i<10; i++)
                  {
                          
                       for (int j=0; j<friends.size(); j++)
                      {
                            output=(int) (friends.get(j));
                            if(output>=MIN && output<=MAX)                            //loop to create stars
                            {
                                count+="*";
                            }
                       }

                        System.out.print(MIN + " to " + MAX + "\t" + "|" + count);            //creates histogram
                        System.out.println();
                        count="";
                        MIN+=10;                                                    //range of numbers changing
                        MAX+=10;
                }
                  e=2;
          }
         
          
          }
      }
}


