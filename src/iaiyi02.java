import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Administrator on 2017/9/10.
 */
public class iaiyi02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<String> stack = new Stack<String>();
        String str = sc.next();
        char[] chars = str.toCharArray();
        if (chars.length == 0) {
            System.out.println(0);
        }

        int k = 0;
        int max = 0;
        for(int i = 0; i < chars.length; i++) {

            if (chars[i] == '(') {
                k++;
                if (k > max) {
                    max = k;
                }
            }else {
                k--;
            }
        }
        System.out.print(max);
    }
}
