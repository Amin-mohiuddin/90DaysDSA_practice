package com.company;

public class FindMaxIn2DArray {
    public static void main(String[] args){
        int[][] array = {{20, 15, 16, 36},
                {10, 20, 254, 66, 6},
                {65, 68, 68, 98},
                {156, 654, 999}
        };
        System.out.println(findMax(array));
    }

        static int findMax(int[][] arr){
            int max = Integer.MIN_VALUE;
            for (int[] ints : arr) {
                for (int anInt : ints) {
                    if (max < anInt) {
                        max = anInt;
                    }
                }
            }
        return max;
    }
}
