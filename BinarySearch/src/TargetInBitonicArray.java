public class TargetInBitonicArray {
    public static void main(String[] args) {
        int [] array = {10, 20, 30, 45, 55, 85, 64, 32, 12, 11, 10, 3};
        int target = 11;
        int ans = findPeak(array,target);
        System.out.println("The peak of the array is at Index: "+ ans);
        System.out.println("If the ans is -1 then target is not found in ascend array : "+findTarget(array, target, true, 0, ans));
        int ans2 = (findTarget(array, target, false, ans, array.length-1));
        System.out.println("The Target element is found in desceding array at index : "+ans2);}

    static int findPeak(int[] array, int target) {
        int start = 0;
        int end = array.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(array[mid] > array[mid+1]){
                end = mid;
            }
            if(array[mid] < array[mid+1]){
               start = mid+1;
            }
        }
        return end;}

    static int findTarget(int [] arr, int target, boolean anscending, int start, int end){
        while (start <= end){
            int mid = start+(end - start)/2;
            if(arr[mid] == target){
                    return mid;
            }
            if(anscending == true) {
                if (target > arr[mid]) {
                    start = mid + 1;
                }else{
                    end = mid-1;
                }}
            else if (anscending == false){
                if(target > arr[mid]){
                    end = mid-1;
                }
                else if(target < arr[mid]){
                    start = mid+1;
                }}
        }
    return -1;}
}
