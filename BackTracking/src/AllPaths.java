import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean [][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int [][] path = new int[maze.length][maze[0].length];

        Allpath("", maze, 0, 0, path, 1);
    }
    static void Allpath(String p, boolean[][] maze, int r, int c, int[][] path, int step){
        if(r == path.length-1 && c == path[0].length-1){
            path[r][c] = step;
            for (int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        path[r][c] = step;

        if(r< path.length-1){
            Allpath(p + 'D', maze, r+1, c, path, step+1);
        }
        if(c<path[0].length-1){
            Allpath(p+'R', maze, r, c+1, path, step+1);
        }
        if(c>0){
            Allpath(p+'L', maze, r, c-1, path, step+1);
        }
        if(r>0){
            Allpath(p+'U', maze, r-1, c, path, step+1);
        }
        maze[r][c] = true;
        path[r][c] =0;

    }
}
