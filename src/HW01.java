
import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/23.
 */
public class HW01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (str.length() > 20) {
            System.out.println("ERROR!");
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char j = str.charAt(i);
                if ((j < 0 && j > 9) && (j > 'z' || j < 'A')) {
                    System.out.println("ERROR2");
                    break;
                }
                if (i % 2 == 0) {
                    sb.append(str.charAt(i));
                }
            }
            System.out.println(sb);
        }
    }
}
