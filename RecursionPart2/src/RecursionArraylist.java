import java.util.ArrayList;
import java.util.Arrays;

public class RecursionArraylist {
    public static void main(String[] args) {
        int[] array = {5, 4, 4, 3, 2, 1, 0};
        System.out.println(findIndex(array, 4, 0));
    }

    static ArrayList<Integer> findIndex (int [] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        // this will contain ans for that function call only
        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelow = findIndex(arr, 4, index+1);
        list.addAll(ansFromBelow);
        return list;


    }

}
