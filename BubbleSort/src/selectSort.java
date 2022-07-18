import java.util.Arrays;

public class selectSort {
    public static void main(String[] args) {
        int [] array = {5, 4, 3, 1, 2};
        selection(array);
        System.out.println(Arrays.toString(array));

    }
    static void selection(int [] arr){
        for(int i =0; i< arr.length; i++){
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }
    static void swap (int[] arr, int first, int second){
        //this method swaps the maximum number with the last index element;
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end){
        //this method finds the maximum number index and returns it.
    int max = start;
    for(int j = start; j <= end; j++){
        if(arr[max] < arr[j]){
            max = j;
        }
    }
    return max;}
}
