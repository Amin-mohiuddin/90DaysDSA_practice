public class Main {

    public static void main(String[] args) {
	// write your code here
        int an = fibo(6);
        System.out.println(an);
    }
    static int fibo(int n){
        if (n <2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);

    }
}
