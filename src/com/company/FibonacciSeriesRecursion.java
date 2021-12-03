package com.company;

import java.util.Scanner;

public class FibonacciSeriesRecursion {

    //Recursive function
    public static int fibonacci(int i){
        if(i == 0){
            return 0;
        }
        if(i == 1 || i == 2){
            return 1;
        }
        //Recursive Function Call
        return fibonacci(i-2) + fibonacci(i-1);
    }

    public static void main(String[] args) {

        // Logic to find out the fibonacci series using recursion for the user input number
        Scanner sn = new Scanner(System.in);
        int num;

        System.out.println("Find out the fibonacci series using recursion based on your input number");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("How many numbers you want in Fibonacci series : ");

        if(sn.hasNextInt()) {
            num = sn.nextInt();
            System.out.print("Fibonacci Series of " + num + " numbers : ");
        }
        else
        {
            System.out.println("Oops! The entered value is not a whole number.");
            return;
        }

        for (int i = 0; i < num; i++)
        {
            System.out.print(fibonacci(i) +" ");
        }
    }
}
