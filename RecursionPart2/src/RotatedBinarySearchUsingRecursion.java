public class RotatedBinarySearchUsingRecursion {
    public static void main(String[] args) {
        int [] array = {7, 8, 9, 1, 2, 3, 4};
        System.out.println(search(array, 4, 0, array.length-1));

    }

    static int search(int[] array, int target, int start, int end){
        int mid = start + (end-start)/2;
        if(start > end){
            return -1;
        }
        if(array[mid] == target){
            return mid;
        }if(array[start] <= array[mid]){

            if(target <= array[mid] && target >= array[start]){
                 return search(array, target, start, mid-1);

            }
            else{
                 return search(array, target, mid+1, end);


            }


        }
        if(target >= array[mid] && target <= array[end]){
            return search(array, target, mid+1, end);

        }
            return search(array, target, start, mid-1);

    }


}
