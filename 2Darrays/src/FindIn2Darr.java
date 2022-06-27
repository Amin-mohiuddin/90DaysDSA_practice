package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class FindIn2Darr {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 32},
                {12, 45, 635},
                {154, 21, 21, 54},
                {14, 321}
        };
//        System.out.println(arr.length);

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the target element : ");
        int target = in.nextInt();
        int[] ans = findEle(arr, target);
        System.out.println(Arrays.toString(ans));
    }

//         static int findEle(int[][] array, int Element) {
//            for (int i = 0; i < array.length; i++) {
//                for (int j = 0; j < array[i].length; j++) {
//                  if (Element == array[i][j]) {
//                      System.out.println("The target element is found at row; col: " + i + ";" +j);
//                     return array[i][j];
//                }
//            }
//        }
//            System.out.println("The Target element you are looking for is not present in the Array !!!");
//            return -1;
//    }}


    static int[] findEle(int[][] array, int Element) {
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                if (Element == array[i][j]) {
//                    System.out.println("The target element is found at row; col: " + i + ";" +j);
                    return new int[]{i, j};
                }
            }
        }
        System.out.println("The Target element you are looking for is not present in the Array !!!");
        return new int[] {-1, -1};
    }}


