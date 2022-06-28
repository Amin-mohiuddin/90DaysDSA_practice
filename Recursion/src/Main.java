import java.util.Scanner;
public class Main {

    static int  calfact(int n){
        if(n==0||n==1){
            return 1;
        }
        int fact_nm1 = calfact(n-1);
        int fact_n = n*fact_nm1;
        return fact_n;
    }

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(calfact(num));
    }
}
