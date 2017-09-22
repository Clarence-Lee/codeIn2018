import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/10.
 */
public class iaiyi03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.print(sultion(A, B));
    }

    private static int sultion(int a, int b) {
        int num = 0;

        for (int i = 1; i <= a; i++) {
            //double sqrtA = Math.sqrt(i);
            for (int j = 1; j <= b; j++) {
                double temp = Math.sqrt(i * j);
                //double temp = sqrtA * Math.sqrt(j);

                if (Math.abs(temp - Math.round(temp)) < 0.000000000001) {
                    num++;
                    System.out.println(i + " "+ j);
                }
            }
        }
        //double temp = Math.sqrt(3)*Math.sqrt(3);
        //DecimalFormat("0.00")
        //System.out.println(Math.round(temp));
        return num;
    }
}
