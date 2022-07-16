import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] array = {4, 5, 1, 2, 3};
        Selectionsort(array);
        System.out.println(Arrays.toString(array));
    }

    static void Selectionsort(int[] arr){
        int start = 0;
        int max = 0;
        for(int i =0; i< arr.length; i++){
           if(arr[start] < arr[i]){
               int temp = arr[arr.length-1];
               arr[start] = arr[i];
               arr[i] = temp;
               max = arr[i];
           }
       }

    }


}

