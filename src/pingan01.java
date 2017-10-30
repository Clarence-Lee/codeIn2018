import java.util.Scanner;

/**
 * Created by Administrator on 2017/10/19.
 */
public class pingan01 {
    public static int[] a = new int[10000];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(compute(num));
    }
    private static int compute(int num) {
        int count = 0;
        int size = zhishu();
        for (int i = 1; i < size; i++){
            for (int j = i; j < size; j++) {
                if (num == a[i] + a[j]) {
                    count++;
                }
            }
        }
        return count;
    }
    /*
    private static int zhishu() {
        a[1] = 1;
        int flag = 1;
        for (int i = 0; i < 10000; i++){
            for(int j = 2; j < i; j++) {
                if (i%j == 0){
                    break;
                }else {
                    if(j == i - 1) {
                        a[++flag] = i;
                    }
                }
            }
        }
        return flag;
    }
    */
    private static int zhishu() {
        a[1] = 1;
        int flag = 1;
        int i = 2;
        while (true){
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j+=2) {
                if (i%j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                a[++flag] = i;
            }
            i++;
        }

    }
}
