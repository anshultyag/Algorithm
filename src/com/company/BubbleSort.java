package com.company;

import java.util.Scanner;
public class BubbleSort {
    public int[] bubbleSort(int[] arr) {
        int temp;
        int size = arr.length;
         for (int i = 0; i < size; i++) {
             for (int j = 0; j < size-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        arr = sort.bubbleSort(arr);
        sort.print(arr);
        sc.close();
    }
}