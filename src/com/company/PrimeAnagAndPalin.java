package com.company;

import java.util.Arrays;

public class PrimeAnagAndPalin {
    public static void main(String[] args) {
        System.out.print("Prime Number between 0-1000 are : ");
        for (int num = 0; num <= 1000; num++) {
            if (isPrime(num)) {
                for (int num2 = num; num2 < 1000; num2++) {
                    if (num != num2) {
                        if (isPrime(num2)) {
                            if (isAnagram(String.valueOf(num), String.valueOf(num2)) && isPalindrome(num)) {
                                System.out.println(num + " " + num2 + " is prime and anagram and palindrome");
                            }
                        }
                    }
                }
            }
            System.out.print("");
        }
    }

    public static boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int num) {
        int r, sum = 0;
        int temp = num;
        while (num > 0) {
            r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;
        }
        if (temp == sum) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isAnagram(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        if (str1.length() != str2.length()) {
            return false;
        } else {
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if (Arrays.equals(arr1, arr2)) {
                return true;
            }
        }
        return false;
    }
}
