import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/10/30.
 */
public class jingChi01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int boxNum = sc.nextInt();
        sc.nextLine();
        String pos = sc.nextLine();
        if (pos == null || pos.length() ==0){
            System.out.println("True");
            return;
        }

        List<String> boxsStr = new LinkedList<>();
        for (int i = 0; i < boxNum; i++) {
            boxsStr.add(sc.nextLine());
        }

        int lenPos = pos.length();
        int[][] mat = new int[lenPos][boxNum];

        for (int i = 0; i < lenPos; i++) {
            String cTmp = String.valueOf(pos.charAt(i));
            for (int j = 0; j < boxNum; j++) {
                if (boxsStr.get(j).contains(cTmp)){
                    mat[i][j] = j+1;
                }
            }
        }

        int sum;
        int count = 0;
        //boolean flag = true;
        for (int j = 0; j < boxNum; j++) {
            sum = 0;
            for (int i = 0; i < lenPos; i++) {
                sum += mat[i][j];
            }
            if (sum != 0){
                count++;
            }
        }

        System.out.println(count >= lenPos ? "True":"False");
    }
}
