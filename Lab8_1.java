package fun;
import java.util.Scanner;

// Aadi Jain

public class Lab8_1 {

    public static void main(String[] args) {
        Lab8_1_1 lab = new Lab8_1_1();
        lab.repeatMe();
    }
}

class Lab8_1_1 {
    public void repeatMe(){

        Scanner scan = new Scanner(System.in);

        final int LIMIT = 51;
        int[] num = new int[LIMIT];

        int input;
        int counter=0;

        
        for (int w = 0; w < num.length; w++) {
            num[w] = w;                       //give all the values to an array
        }

        while (true) {

            System.out.println("Enter a number between 0 and 50. Enter 999 to exit the program");
            input = scan.nextInt();

            if ((input < 0 || input > 50) && input != 999) {
                System.out.println("Please enter a number between 0 and 50. Nothing outside of this range");
                scan.nextLine();
            }

            for (int y = 0; y < num.length; y++) //adding values to the array
            {
                if (input==0)
                {
                    num[0]++;
                }
                else if (y == input) 
                {
                    num[y] += input;
                }
            }
            
            if (input == 999) //what happens when program is exited
            {
                for (int a = 0; a < num.length; a++) 
                {
                    counter=0;
                    
                    if (a == 0) {
                        if (num[a] - a != 0) {
                            counter = numHits(num, a);
                            System.out.println("The number 0 was entered " + counter + "times");
                        }
                    } 
                    else if (num[a] - a != 0) 
                    {
                        counter = numHits(num, a);
                        System.out.println("The number " + a + "was entered " + counter + "times");
                    }

                }
            }
        }
    }
     
    public  int numHits(int[] num, int a) {
        if (a==0)
            return num[0];
        else 
           return (num[a] / a) -1; // Reduce by 1 as number was added using initilization
    }
    
}
    


