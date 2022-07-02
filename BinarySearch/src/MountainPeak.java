public class MountainPeak {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 6, 8, 9, 10, 2, 1, 0};
        System.out.println(findPeak(array));

    }
    static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            if(arr[mid] < arr[mid+1]){
                start = mid+1;
            }
        }
    return start;}
 }
