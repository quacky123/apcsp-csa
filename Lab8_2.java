package fun;

import java.util.Scanner;

// Aadi Jain
public class Lab8_2 {

    public static void main(String[] args) {
        Lab8_2_1 lab = new Lab8_2_1();
        lab.repeatMe();
    }
}

class Lab8_2_1 {

    public void repeatMe() {

        Scanner scan = new Scanner(System.in);

        final int LIMIT = 51;
        int[] num = new int[LIMIT];

        int input, b;
        int counter = 0;
        boolean d=true;
        
        for (int w = -30; w < 21; w++) {
            num[w + 30] = w;
        }

        while (d==true) {

            System.out.println("Enter a number between -30 and 20. Enter 999 to exit the program");
            input = scan.nextInt();

            if ((input > 20 || input < -30) && input != 999) {
                System.out.println("Please enter a number between -30 and 20. Nothing outside of this range");
                scan.nextLine();
            }

            for (int y = -30; y < 21; y++) //adding values to the array
            {
                if (input == 0) {
                    num[30]++;
                } else if (y == input && y > 0) {
                    num[y+30] += input;
                } else if (y == input && y < 0) {
                    num[y + 30] -= input;
                }

            }

            System.out.println();
            
            if (input == 999) //what happens when program is exited
            {
                for (int a = -30; a < 21; a++) {
                    counter = 0;
                    
                    if (a > 0) {
                        if (num[a + 30] - a != 0) {
                            counter = numHits(num, a);
                            System.out.println("The number " + a + " was entered " + counter  + " times");
                            d=false;
                        }
                    } else if (a < 0) {
                        if (num[a+30] + (a*-1) != 0) {
                            counter = numHits(num, a);
                            System.out.println("The number " + a + " was entered " + (counter * -1) + " times");
                            d=false;
                        }
                    }
                    else if (a==0) {
                        if (num[30]!=0) {
                            System.out.println("The number 0 was entered " + num[30] + " times");
                            d=false;
                        }
                    }
            }
        }
    }
}

public int numHits(int[] num, int a) {
            return (num[a + 30] / a) - 1; // Reduce by 1 as number was added using initilization
    }
}
