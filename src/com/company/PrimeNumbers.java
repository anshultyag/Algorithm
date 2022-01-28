package com.company;
import java.util.Scanner;
public class PrimeNumbers {
    public void primecheck(int num){
        boolean flag = false;
        for (int i = 2; i <= num / 2; i++) {
             //System.out.println(i);
              if (num % i == 0) {
                  flag = true;
                   break;
              }
        }
        if (!flag) {
            System.out.println("Prime number is : "+num);
        }
    }

    public static void main(String[] args) {
        PrimeNumbers abc = new PrimeNumbers();
        int num = 100;
        for (int i = 1; i < num; i++) {
            abc.primecheck(i);
        }
    }
}