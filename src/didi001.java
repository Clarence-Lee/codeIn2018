import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/10.
 */
public class didi001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        List<Integer> list = new ArrayList<Integer>();
        while (in.hasNextInt()) {
            list.add(in.nextInt());
        }
        */
        int num = in.nextInt();
        System.out.println(nthUglyNumber(num));

    }
    public static int nthUglyNumber(int n) {
        int[] dp=new int[n];dp[0]=1;
        return DFS(dp,1,0,0,0,n);
    }

    private static int DFS(int[] dp, int i, int p2, int p3, int p5, int n) {
        if (i==n)return dp[n-1];
        dp[i]=Math.min(dp[p2]*2, Math.min(dp[p3]*3,dp[p5]*5));
        if (dp[i]==dp[p2]*2)p2++;
        if(dp[i]==dp[p3]*3)p3++;
        if (dp[i]==dp[p5]*5)p5++;
        return DFS(dp, i+1, p2, p3, p5, n);
    }
}
