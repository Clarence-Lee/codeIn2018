import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/23.
 */
public class didi092302 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] grid = new int[m][n];
        int[][] tmp = new int[m][n];
        for (int i = 0; i < k; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            grid[a][b] = 1;
            //System.arraycopy(grid, 0, tmp, 0, grid.length);
            tmp = copy(grid);
            System.out.print(numIslands(grid));
            if (sc.hasNextInt()){
                System.out.print(" ");
            }
            grid = copy(tmp);
            //copy(grid);
            //System.out.print(tmp);
            //System.arraycopy(tmp, 0, grid, 0, grid.length);
        }

        //System.out.print(numIslands(grid) + " ");

    }
    private static int[][] copy(int[][] grid) {

        int row = grid.length, column = grid[0].length;

        int[][] tmp = new int[row][column];
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++) {
                tmp[i][j] = grid[i][j];
            }
        return tmp;
    }
    public static void DFS(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length)
            return;
        if (grid[i][j] == 1) {
            grid[i][j] = 2;
            DFS(grid, i + 1, j);
            DFS(grid, i - 1, j);
            DFS(grid, i, j + 1);
            DFS(grid, i, j - 1);
        }
    }

    public static int numIslands(int[][] grid) {
        if (grid == null || grid.length == 0)
            return 0;
        int row = grid.length, column = grid[0].length, count = 0;
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == 1) {
                    count++;
                    DFS(grid, i, j);
                }
            }
        return count;
    }
}

