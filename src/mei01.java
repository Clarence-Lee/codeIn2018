import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/31.
 */
public class mei01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }
        int K = sc.nextInt();

        for(int i = 1; i <=N; i++) {
            int w = list.get(i) + list.get(i-1);
            list.add(i,(w%K + K) % K);
        }
        Collections.sort(list);
        int max = 0;
        int last = 1;
        for (int i =1; i <= N; i++) {
            if (list.get(i) == list.get(i-1)) {
                last++;
            }
        }


    }

}
