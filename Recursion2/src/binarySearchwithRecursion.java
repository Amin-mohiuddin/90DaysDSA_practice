public class binarySearchwithRecursion {
    public static void main(String[] args) {
        int [] array = {10, 20, 30, 45, 66, 85, 86, 89, 99, 100};
        int start = 0;
        int end = array.length-1;
        int ams = Binsearch(array, 99, start,end);
        System.out.println(ams);
    }

    static int Binsearch(int [] arr, int target, int start, int end){
        int mid = start + (end-start)/2;
        if (start > end) {
            return -1;
        }
        if(target == arr[mid]){
            return mid;
        }
        if(target> arr[mid]){
            return Binsearch(arr, target,mid+1, end);
        }
        return Binsearch(arr, target, start,mid-1);
    }}
