package com.company;
import java.util.Arrays;

public class EvenNoofDigits {
    public static void main(String[] args) {
        int[] arr = {10, 2340, 556, 545, 4445, 5454};
        System.out.println("The Numbers with Even number of digits : ");
        System.out.println(Arrays.toString(arr));
        System.out.println(noofevenDigit(arr));
    }

    static int noofevenDigit(int[] arr) {
        int count = 0;
        for (int j : arr) {
            if (isEven(j)) {
                count++;
            }
        }
        return count;}

    static boolean isEven(int are) {
        int count = 0;
        while(are > 0){
            count++;
            are = are/10;
        }
        if(count %2 == 0){
            return true;
        }
    return false;}
}