package com.company;
import java.util.Scanner;
public class FindMinInArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the array elements: ");
        int[] arr = new int[7];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(findMin(arr));
    }

    static int findMin(int[] arr) {
        int min =  arr[0];
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];}}
        System.out.print("The minimum number in the Array is: ");
        return min;}
}
