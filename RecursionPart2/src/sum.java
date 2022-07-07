public class sum {
    public static void main(String[] args) {
        int ans = Sum(45);
        System.out.println(ans);
    }
    static int Sum(int n){
        if(n%10 == n){
            return n;
        }
        return (n%10)+ Sum(n/10);
    }

}

