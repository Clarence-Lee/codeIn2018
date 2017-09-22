import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/27.
 */

public class googler03 {

    public void solve()
    {
        try {
            BufferedReader br = new BufferedReader(new FileReader("E:/下载/chrome/C-small-attempt1.in"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("E:/下载/chrome/C_out.txt"));
            //BufferedWriter bw = new BufferedWriter(new FileWriter("D:/IIT Hyd Sem-4/CJdata/B_out_Large.txt"));
            int T = Integer.parseInt(br.readLine());
            for(int t=0;t<T;t++)
            {
                //int M = Integer.parseInt(br.readLine());
                double ans=0;
                String[] A = br.readLine().split(" ");
                String[] B = br.readLine().split(" ");
                String[] C = br.readLine().split(" ");
                int[] trianA = new int[3];
                int[] trianB = new int[3];
                int[] trianC = new int[3];
                for (int i = 0; i < 3; i++) {
                    trianA[i] = Integer.parseInt(A[i]);
                    trianB[i] = Integer.parseInt(B[i]);
                    trianC[i] = Integer.parseInt(C[i]);
                }
                bw.write("Case #"+(t+1)+": "+sultion(trianA, trianB,trianC)+"\n");
            }
            br.close();
            bw.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        googler03 a = new googler03();
        a.solve();
    }

    private static String sultion (int[] A, int[] B, int[] C){

        double res = 0.0;

        double distanceAB = Math.sqrt(Math.pow((A[0] - B[0]), 2)
                + Math.pow((A[1] - B[1]), 2) + Math.pow((A[2] - B[2]), 2));
        double distanceAC = Math.sqrt(Math.pow((A[0] - C[0]), 2)
                + Math.pow((A[1] - C[1]), 2) + Math.pow((A[2] - C[2]), 2));
        double distanceBC = Math.sqrt(Math.pow((C[0] - B[0]), 2)
                + Math.pow((C[1] - B[1]), 2) + Math.pow((C[2] - B[2]), 2));

        double[] distance = new double[]{distanceAB, distanceAC, distanceBC};
        Arrays.sort(distance);

        double jiaodu = Math.acos((Math.pow(distance[0], 2) +
                Math.pow(distance[1], 2) - Math.pow(distance[2], 2)) / 2*distance[0]*distance[1]);

        double R = distance[2];
        double min = 0.0;
        double max = R;
        double chazhi = 1;
        while(chazhi > 0.00000001 || chazhi < -0.00000001) {
                chazhi = Math.pow(3*R, 2) - Math.pow(R, 2) - Math.pow(distance[0], 2)
                        +2*R*distance[0]*Math.cos(jiaodu - Math.acos(((distance[1] / 2) - R) /R));

                if (chazhi > 0) {
                    min = R / 2;
                } else {
                    max = R / 2;
                }
                R = (max - min);
        }

        int[] zuida = new int[]{A[0], B[0], C[0]};
        Arrays.sort(zuida);
        res = (zuida[2] - zuida[0]) / 6.0;
        String result = String.format("%.10f",res);

        return result;
    }

}
