import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/18.
 */
public class enniu01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();

        while (sc.hasNextLine()){
            int id = sc.nextInt();
            list.add(id);
        }
        int size = list.size()/2;
        int num = 0;
        for(int i = 0; i< size; i++){
            if(list.get(i) > num){
                num = list.get(i);
            }
        }
        int[][] id = new int[num][2];
        for (int i = 0; i < size; i++) {
            int idnum = list.get(i);
            int quan = list.get(i+size);
            id[idnum][1] = id[idnum][1]+1;
            id[idnum][2] = id[idnum][2]+quan;
        }

        int maxV = 0;
        int i = 0;

        while (i < size){
            if(id[i][0] > maxV){
                maxV = id[i][0];
            }
        }


    }

}
