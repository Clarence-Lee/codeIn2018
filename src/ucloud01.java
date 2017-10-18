import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/10/17.
 * //
 */

public class ucloud01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (sc.hasNextInt()){
            list.add(sc.nextInt());
        }
        int len = list.size();
        int cur = 0;
        for (int i = 0; i < len; i++) {
            if(list.get(i) != 0) {
                list.set(cur, list.get(i));
                cur++;
            }
        }
        for (int i = cur; i < len; i++) {
            list.set(i, 0);
        }
        for (int i = 0; i < len-1; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.print(list.get(len-1));

    }

}
