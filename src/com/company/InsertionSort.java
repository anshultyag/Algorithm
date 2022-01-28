package com.company;

import java.util.Scanner;
public class InsertionSort {
    public static String []insertionSort(String []array,int l)
    {
        String temp="";
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if(array[i].compareToIgnoreCase(array[j])>0)
                {
                    temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }

        return array;
    }
    public static void display(String []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Strings");
        int size=sc.nextInt();
        //sc.nextLine();
        String []arr = new String[size];
        for(int i=0;i<size;i++)
        {
            System.out.println("Please Enter your string : " );
            arr[i]=sc.nextLine();
        }
        arr = insertionSort(arr,arr.length);
        System.out.println("Sorted Strings : ");
        display(arr);
            }
}
