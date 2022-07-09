import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(ReverseString(" Aminj"));
    }

    static String ReverseString(String str){
            String newString = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            newString = newString+str.charAt(i);

        }
            return newString;
    }

}
