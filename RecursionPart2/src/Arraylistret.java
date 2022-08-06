import java.util.ArrayList;

public class Arraylistret {
    public static void main(String[] args) {
        System.out.println(subseq1("", "abc"));

    }
    static ArrayList<String> subseq1(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseq1(p+ch , up.substring(1));
        ArrayList<String> right = subseq1(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}
