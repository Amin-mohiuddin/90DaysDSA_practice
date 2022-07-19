import java.util.Arrays;
import java.util.Scanner;

public class pascal2 {
    public static void main(String[] args) {
        boolean set = false;
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i+1; j++) {
                if (j > 0) {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
                if (j == 0) {
                    arr[i][j] = 1;
//                    set = true;
                }
                if (i == j) {
                    arr[i][j] = 1;
                }

            }
        }
            for (int[] as : arr) {
                System.out.println(Arrays.toString(as));
            }
        }
    }


