import java.util.ArrayList;
public class AsciValue {
    public static void main(String[] args) {
        System.out.println(subseqret("", "abc"));
    }
    static ArrayList<String> subseqret(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subseqret(p+ch, up.substring(1));
        ArrayList<String> second = subseqret(p, up.substring(1));
        ArrayList<String> third = subseqret(p+(ch+0) , up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
