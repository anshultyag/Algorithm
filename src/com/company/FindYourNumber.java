package com.company;

import java.util.Scanner;

public class FindYourNumber {
    Scanner sc = new Scanner(System.in);

    public void guess(int min, int max) {
        if (min == max) {
            System.out.println("Your number is " + min);
        } else {

            System.out.println("1. Number is between " + min + " to " + ((min + max) / 2) + "\n2.Number is between "
                    + (((min + max) / 2) + 1) + " to " + max);
            int choice = sc.nextInt();
            int temp = max / 2;
            System.out.println(temp);
            switch (choice) {
                case 1:
                    guess(min, ((min + max) / 2));
                    break;
                case 2:
                    guess((((min + max) / 2) + 1), max);
                    break;
                default:
                    System.out.println("Enter valid choice");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter number for range");
        FindYourNumber algo = new FindYourNumber();
        int range = algo.sc.nextInt();
        System.out.println("Think a number in your mind within this number");

        algo.guess(0, range);
    }
}
