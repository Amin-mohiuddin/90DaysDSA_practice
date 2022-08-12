import java.util.Arrays;
public class NumberPad {
    public static void main(String[] args) {
//        pad("", "12");
//    }
//    static void pad(String p, String up){
//        if(up.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//        int digit = up.charAt(0) - '0';
//        System.out.println(digit);
//        for(int i =(digit-1)*3; i< digit*3; i++){
//            char ch = (char)('a' +i);
//            pad(p+ch, up.substring(1));
//        }

    int[] arr = {5,0,1,2,3,4};
        int [] ans = ans(arr);
        for (int aa:ans) {
            System.out.print(aa);
        }
    }

    static int[] ans(int [] arr){
        int [] nearr = new int[6];
        for(int i =0; i< arr.length; i++){
            nearr[i] = arr[arr[i]];
        }
    return nearr;
    }

}
