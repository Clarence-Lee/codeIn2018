import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class didi01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        while (in.hasNextInt()) {
            list.add(in.nextInt());
        }

        //System.out.print(list.get(1));
        int N = list.size();
        int[] dp = new int[N];
        dp[0] = list.get(0);
        int max = dp[0];
        for (int i = 1; i < N; i++) {
            dp[i] = Math.max(list.get(i), dp[i-1] + list.get(i));
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}