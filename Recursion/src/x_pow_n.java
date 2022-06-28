public class x_pow_n {
    static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xpow_nm1 = power(x,n-1);
        int xpow_n = x*xpow_nm1;
        return xpow_n;
    }

    public static void main(String[] args) {
        int n = 5;
        int x = 2;
        System.out.println(x + "^"+ n +"= "+power(x, n));
    }
}
