package com.company;

public class Wealthyperson {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 6},
                {5, 6, 9},
                {5, 9, 8}
        };
        System.out.println(findWealthy(arr));
    }

static int findWealthy(int[][] array){
        int ans =0;
        for(int[] ints: array){
            int count = 0;
            for(int anints: ints){
                count = count + anints;
            }
            if(count > ans){
                ans = count;
            }
        }
return ans;}
}
