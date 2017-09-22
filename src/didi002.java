import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/10.
 */
public class didi002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < num; i++) {
            list.add(sc.nextInt());
        }

        int temp = 0;
        int k = 0;

        for (int i = 0; i < num; i++) {
            temp = temp ^ list.get(i);
            if (temp == 0 || list.get(i) == 0) {
                k++;
                temp = 0;
            }
        }

        System.out.println((-1<< 31) );
    }
}
