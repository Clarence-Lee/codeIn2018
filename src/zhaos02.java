import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/13.
 */
public class zhaos02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] high = new int[num];
        for (int i = 0; i <num; i++) {
            high[i] = sc.nextInt();
        }

        int countA = 0;
        int countB = 0;

        int i = 0;
        while (i <= num-3) {
            if (high[i] > high[i+1]+high[2]) {
                countA += high[i];
                countB = countB + high[i+1] +high[i+2];
                i = i+3;
            }else {
                countA = countA + high[i] +high[i+1];
                countB = countB + high[i+2] +high[i+3];
                i = i+4;
            }
        }
        System.out.print(countA);


    }

    private static int count (int n, int[] high) {
        if (n <= 1) {
            return Math.max(high[1], high[0]);
            //return Math.max(high[3]+high[2], high[1]+high[0]);
        }

        int chaA = high[n] + count(n-3, high);
        int chaB = high[n] +high[n-1] + count(n-5, high);
        return Math.max(chaA, chaB);
    }
}
