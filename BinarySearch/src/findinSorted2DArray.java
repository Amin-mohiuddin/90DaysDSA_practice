import java.util.Arrays;

public class findinSorted2DArray {
    public static void main(String[] args) {
        int [][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println(Arrays.toString(findtarget(array, 16)));}

    static int[] binSearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart<= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if(target == matrix[row][mid]){
                return new int[] {row, mid};
            }
            if(target > matrix[row][mid]){
                cStart = mid+1;
            }else{
                cEnd = mid-1;
            }
        }
    return new int[] {-1, -1};}


    static int[] findtarget(int[][] arr, int target) {
        int rows = arr.length;
        int cols = arr[0].length;
        int cMid = cols / 2;
        if (rows == 1) {
            return binSearch(arr, 0, 0, cols - 1, target);
        }
        int rStart = 0;
        int rEnd = rows - 1;
        while (rStart < (rEnd - 1)) {
            int rMid = rStart + (rEnd - rStart) / 2;
            if (target == arr[rMid][cMid]) {
                return new int[]{rMid, cMid};
            }
            if (target < arr[rMid][cMid]) {
                rEnd = rMid;
             }
            if (target > arr[rMid][cMid]) {
                rStart = rMid;
            }}
        //Search in the midlle column elements, whether they are equal to target or not..
            if(arr[rStart][cMid] == target){
                return new int[] {rStart, cMid};
            }
            if(arr[rStart+1][cMid] == target){
                return new int[] {rStart+1, cMid};
            }
            // now search in first part
        if(target <= arr[rStart][cMid-1]){
            return binSearch(arr, rStart, 0, cMid-1, target);
        }
        if(target >= arr[rStart][cMid+1] && target <= arr[rStart][cols-1] ){
            return binSearch(arr, rStart, cMid+1, cols-1, target);
        }
        if(target <= arr[rStart+1][cMid-1]){
            return binSearch(arr, rStart+1, 0, cMid-1, target);
        }
        if(target >= arr[rStart+1][cMid+1]){
            return binSearch(arr, rStart+1, cMid+1, cols-1, target);
        }

    return new int[]{-1,-1};}

}
