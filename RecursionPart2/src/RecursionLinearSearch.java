public class RecursionLinearSearch {
    public static void main(String[] args) {
        int[] array = {10, 22, 24, 45, 46, 46, 66, 99, 263};
        System.out.println(find(array, 46, 0));
        System.out.println(finds(array, 46, 0));
        System.out.println(findlast(array, 46, array.length-1));
    }
    static boolean find(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index]==target || find(arr, target, index+1);
    }
    static int finds(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return finds(arr, target, index+1);
        }
    }




    static int findlast(int[] arr, int target, int index){
        if(index == -1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return  findlast(arr, target, index-1);
    }


}
