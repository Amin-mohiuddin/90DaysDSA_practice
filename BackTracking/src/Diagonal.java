import java.util.ArrayList;

public class Diagonal {
    public static void main(String[] args) {
        System.out.println(pathdiare("", 3,3));

    }
    static void pathdia(String p, int r, int c){
        if(r==1&&c==1){

            System.out.println(p);
            return;
        }
        if(r>1&&c>1){
            pathdia(p+'D', r-1, c-1);
        }
        if(r>1){
            pathdia(p+'V', r-1, c);
        }
        if(c>1){
            pathdia(p+'H', r, c-1);
        }
    }

    static ArrayList<String> pathdiare(String p, int r, int c){
        if(r==1&&c==1){
            ArrayList<String> List = new ArrayList<>();
            List.add(p);
//            System.out.println(p);
            return List;
        }

        ArrayList<String> List = new ArrayList<>();
        if(r>1&&c>1){
            List.addAll(pathdiare(p+'D', r-1, c-1));
        }
        if(r>1){

            List.addAll(pathdiare(p+'V', r-1, c));
        }
        if(c>1){
            List.addAll(pathdiare(p+'H', r, c-1));
        }
        return List;
    }
}
