import java.io.StringWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
	// write your code here
        int [] array = {1, 2, 3, 4, 5};
        bubble(array);
        System.out.println(Arrays.toString(array));
    }

    static void bubble(int[] arr){
        boolean swapped;
        //run the steps n-1 times
        for(int i = 0; i < arr.length; i++){
            swapped = false;
            // for each step max item comes at last respective index;
            for(int j =1; j < arr.length-i; j++){
                //Swap if the item is smaller than the previous element;
                if (arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
        if(!swapped){
            break;
        }
        }


    }
}
