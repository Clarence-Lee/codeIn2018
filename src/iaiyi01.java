import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/10.
 */
public class iaiyi01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        StringBuilder list1 = new StringBuilder();
        StringBuilder list2 = new StringBuilder();
        int num1 = in.nextInt();
        int k1 = in.nextInt();
        int num2 = in.nextInt();
        int k2 = in.nextInt();

        String x1 = Integer.toString(num1);
        String x2 = Integer.toString(num2);
        for (int i = 0; i< k1; i++) {
            list1.append(x1);
        }
        for (int i = 0; i< k2; i++) {
            list2.append(x2);
        }

        if (list1.length() > list2.length()) {
            System.out.println("Greater");
        }else if (list1.length() < list2.length()) {
            System.out.println("Less");
        }else {
            System.out.println(sul(list1, list2));
        }

    }
    private static String sul(StringBuilder list1, StringBuilder list2) {
        int len = list1.length();
        for (int i =0; i < len; i++) {

            if (list1.charAt(i) > list2.charAt(i)) {
                return "Greater";

            }else if (list1.charAt(i) < list2.charAt(i)){
                return "Less";

            }else
                continue;
        }
        return "Equal";
    }

}
