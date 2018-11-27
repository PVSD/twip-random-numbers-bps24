package com.company;

public class Main {

    public static void main(String[] args) {

        int arr[] = new int[100];
        int sum = 0;
        int count = 0;
        double totalcount =0;
        double avecount=0;
        int run =100;



        for (int h = 0; h < run; h++)
        {
            count=0;
            for (int k = 0; k < arr.length; k++) {arr[k] = 0;}

            while (true)
            {
                count++;

                int i = (int) (Math.random() * 100 + 1);

                arr[i - 1] = 1;

                sum = 0;

                for (int j = 0; j < arr.length; j++) {sum += arr[j];}

                if (sum == 100) {break;}
            }
            System.out.println(count);
            totalcount+=count;
            avecount=totalcount/run;
        }
        System.out.println("average is " + avecount);
    }
}

