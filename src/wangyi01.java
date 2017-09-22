import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/9.
 */
public class wangyi01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numSeq = sc.nextInt();


        for (int i = 0; i < numSeq; i++) {
            int num = sc.nextInt();

            int yu2 = 0;
            int yu = 0;
            int yu4 = 0;
            for (int j = 0; j < num; j++){
                int index = sc.nextInt();
                if (index % 4 == 0){
                    yu4++;
                }else if(index % 4 ==2){
                    yu2++;
                }else {
                    yu++;
                }
            }
            if ((yu2/2 + yu4) >= yu) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }

    }

}
