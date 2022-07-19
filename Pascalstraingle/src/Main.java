import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int [][] arr = new int[size+1][size+1];
        for (int i = 0; i <size+1 ; i++) {
            if(i==size){
                break;
            }
            int length = i+1;
            for (int j = 0; j <length ; j++) {

                if(j ==0|| i == j){
                    arr[i][j] = 1;
                }
                arr[i+1][j+1] = arr[i][j]+arr[i][j+1];



            }
        }

            for (int[] as:arr) {
                System.out.println(Arrays.toString(as));

            }

        }
    }

