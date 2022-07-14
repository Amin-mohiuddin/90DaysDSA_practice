import java.util.ArrayList;

public class FindOccurences {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 50, 60, 70, 88};
        int target = 50;
        find(array, 50, 0);
        System.out.println(list);

    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void find(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        find(arr, target, index+1);

    }



}
