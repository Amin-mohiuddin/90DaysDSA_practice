public class Ceiling {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 5, 6, 8, 9, 12, 65, 656, 999};
        int target = 62;
        int ans = ceiling(array , target);
        System.out.println(ans);
    }
    static int ceiling(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(target > arr[mid]){
                start = mid+1;
            }
            if(target < arr[mid]){
                end = mid-1;
            }}
        return start;
        }
}




