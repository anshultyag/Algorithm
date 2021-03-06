package com.company;
public class TwoString {

    static void printPermutation(String str, String ans){
        // If string is empty
        if (str.length() == 0){
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);                     // ith character of str
            String leftSide = str.substring(0, i);
            String rightSide = str.substring(i + 1);
            String ros = leftSide + rightSide;
            printPermutation(ros, ans + ch);        // Recurvise call
        }
    }

    public static void main(String args[]) {
        String s1 = "abc";
        String s2 = "dcba";
        printPermutation(s1, " ");
        printPermutation(s2, " ");
    }
}