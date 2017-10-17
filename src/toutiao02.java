import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/10/17.
 */
public class toutiao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int end;
        //List<Integer> list = new LinkedList<Integer>();

        while(sc.hasNext()){
            num = sc.nextInt();
            end = sc.nextInt();
            int[] mat = new int[num];
            for(int i = 0; i < num; i++) {
                mat[i] = sc.nextInt();
            }
            int[] res = sul(mat, end);
            for (int i = 0; i < num-1; i++){
                System.out.print(res[i] + " ");
            }
            System.out.print(res[num-1]);
        }
    }
    private static int[] sul(int[] mat, int end) {
        //end = end - 1;
        int len = mat.length;
        int min = mat[0];
        int pos = 0;
        for (int i = 1; i < len; i++){
            if(min > mat[i]){
                min = mat[i];
                pos = i;
            }
        }
        for (int i = 0; i < len; i++) {
            mat[i] = mat[i] - min;
        }

        int j = end-1;
        int count = 0;
        while(mat[j]>0) {
            mat[j]--;
            if (j == 0)
                j = len - 1;
            else
                j--;
            count++;
        }
        mat[pos] = count+min*len;
        return mat;
    }
}
