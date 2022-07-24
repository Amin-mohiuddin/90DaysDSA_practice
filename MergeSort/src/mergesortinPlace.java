import java.util.Arrays;

public class mergesortinPlace {
    public static void main(String[] args) {
        // write your code here
        int[] arr = {7, 6, 5, 3, 4, 8, 9, 1, 2};
        mergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

    }

    static void mergeSort(int[] arr, int s, int e) {
        if (e-s== 1) {
            return;
        }
        int mid = (s+e)/2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid, e);
        merge(arr, s, mid, e);
    }

    static void merge(int[] arr, int s, int m, int e) {
        int[] mix = new int[e-s];

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        //It may be possible that one of the arrrays is not complete;
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for(int l =0; l< mix.length;l++){
            arr[s+l] = mix[l];
        }
    }
}
