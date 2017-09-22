import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/31.
 */
public class meituan01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        //System.out.println(n);

        Arrays.sort(num);
        int[] newNum = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            newNum[i] = num[n - i - 1];
            sum += newNum[i];
        }
        System.out.println(newNum[0]);
        if (newNum[0] >= (sum / 2)) {
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }
    }

}
