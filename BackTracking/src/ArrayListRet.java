import java.util.ArrayList;
public class ArrayListRet {
    public static void main(String[] args) {
        System.out.println(Pathret("", 3,3));

    }
    static ArrayList<String> Pathret(String p, int r, int c){
        if(r==1&&c==1){
            ArrayList<String> List =new ArrayList<>();
            List.add(p);
            return List;
        }
        ArrayList<String> List = new ArrayList<>();
        if(r>1){
            List.addAll(Pathret(p+'D', r-1, c));
        }
        if(c>1){
            List.addAll(Pathret(p+'R', r, c-1));
        }
        return List;
    }
}
