import java.util.Scanner;
import java.util.Arrays;

public class wangyi03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int strLen = str.length();
        int[] dp = new int[strLen + 1];

        dp[0] = 0;
        dp[1] = 1;
        int max = -1;

        for (int i = 1; i < strLen; i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                dp[i+1] = dp[i] + 1;
                max = Math.max(dp[i+1], max);
            }else {
                dp[i+1] = 1;
                max = Math.max(max, dp[i]);
            }
        }

        System.out.println(dp[strLen]);
    }
}