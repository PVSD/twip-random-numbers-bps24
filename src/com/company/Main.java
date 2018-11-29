package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        int run =100;
        while(run>=1)
        {
            //establish variables
            int sum, count;
            double totalcount =0, avecount=0;
            int arr[] = new int[100];

            //prompt the user
            System.out.println("How many times should the program run?");

            //Scanner grabs user input
            Scanner s = new Scanner(System.in);
            run=s.nextInt();

            //checks the numbers a certain number of times
            for (int h = 0; h < run; h++)
            {
                //reset count
                count=0;
                for (int k = 0; k < arr.length; k++) {arr[k] = 0;}

                while (true)
                {
                    //iterate variables
                    count++;
                    sum = 0;

                    //pick a random number 0-100 and fill array
                    int i = (int) (Math.random() * 100 + 1);
                    arr[i - 1] = 1;

                    //check if array is full
                    for (int j = 0; j < arr.length; j++) {sum += arr[j];}
                    if (sum == 100) {break;}
                }

                //calculate total average
                totalcount+=count;
                avecount=totalcount/run;
            }
            System.out.println("The average after " + run + " iterations is " + avecount);
            System.out.println("\nWould you like to continue?\nEnter 1 for Yes\nEnter 0 for No");
            run=s.nextInt();
        }
        System.out.println("Thanks and goodbye!");




    }
}

