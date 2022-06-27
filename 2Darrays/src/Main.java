package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the target element..: ");
        int target = in.nextInt();
        int[] arr = new int[7];
        System.out.println("Enter Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(findinRange(arr, 1 , 5, target));
    }

    static boolean findinRange(int[] array, int index1, int index2, int target){
        for(int i =index1; i<= index2; i++){
            if(array[i] == target){
                return true;}}
        return false;
    }
}

