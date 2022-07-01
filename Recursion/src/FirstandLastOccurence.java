import java.util.Arrays;
public class FirstandLastOccurence {
    public static void main(String[] args) {
        int [] array = {5, 7, 7, 7, 7, 8, 9, 10};
        int [] ans = {-1,-1};
        int target = 7;
        ans [0] = FindFirsAndLastOccurence(array, target, true);
        ans [1] = FindFirsAndLastOccurence(array, target, false);
        System.out.println(Arrays.toString(ans));
    }

    static int FindFirsAndLastOccurence(int [] arr, int target, boolean findingfirst) {
        int ans = -1;
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (target < arr[mid]) {
                e = mid - 1;
            }
            else if (target > arr[mid]) {
                s = mid + 1;
            }
            else{
                ans = mid;
                if(findingfirst){
                    e = mid-1;
                }
                else{
                    s = mid+1;
                }
            }
        }
        return ans;
    }

}



