public class Fibonacci {
    static void fibnocci(int a, int b, int num){
        if(num == 0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        fibnocci(b, c,num-1);
    }
    public static void main(String[] args) {
        int a =0;
        int b = 1;
        int n = 7;
        System.out.println(a);
        System.out.println(b);
        fibnocci(a,b,n-2);
    }
}
