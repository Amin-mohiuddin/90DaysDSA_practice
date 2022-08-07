public class ArrayRecursion {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(sort(array, 0));
    }

    static boolean sort(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }
        return (arr[index] < arr[index+1]) && sort(arr, index+1);
    }
}
