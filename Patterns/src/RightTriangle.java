public class RightTriangle {
    public static void main(String[] args) {
        int size = 4;
        for(int row = 0; row < size; row++){
            for(int col = 0; col <= row; col++){
//                if(col<= row){
                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
            }
            System.out.println();
        }
    }
}
