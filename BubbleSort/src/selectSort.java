import java.util.Arrays;

public class selectSort {
    public static void main(String[] args) {
        int [] array = {5, 4, 3, 2, 1};
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
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int getMaxIndex(int[] arr, int start, int last) {
    int max = start;
    for(int j = start; j <= last; j++){
        max = j;
    }
    return max;}
}
