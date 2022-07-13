public class RecursionLinearSearch {
    public static void main(String[] args) {
        int[] array = {10, 22, 24, 45, 46, 75, 66, 99, 263};
        System.out.println(find(array, 49, 0));
    }
    static boolean find(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index]==target || find(arr, target, index+1);
    }

}
