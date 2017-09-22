

import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/23.
 */
public class huawei03 {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        String stc = sc.next();

        //System.out.println(M+N);
        String nValue = "";
        while (stc.length() > 0) {
            nValue = qiuyu(stc, M, N) + nValue;
        }

        System.out.println(nValue);

    }

    private static String qiuyu(String MTempValue , int M, int N) {
        String Shang = "";
        int temp = 0;
        while (MTempValue.length() > 0) {
            int t = getIntFromStr(MTempValue.substring(0, 1));
            MTempValue = MTempValue.substring(1);
            temp = temp * M + t;
            Shang += getStrFromInt(temp / N);
            temp = temp % N;
        }
        while(Shang.length() > 0 && Shang.charAt(0) == '0'){
            Shang = Shang.substring(1);
        }
        return getStrFromInt(temp);
    }

    private static int getIntFromStr(String str){
        return str.charAt(0) <= '9' && str.charAt(0) >= '0'?
                str.charAt(0) - '0' : str.charAt(0) - 'a' + 10;
    }

    private static String getStrFromInt(int value){
        String result = null;
        if (value >= 0 && value <= 9)
            result = String.valueOf((char)('0' + value));
        else if (value > 9 && value < 36)
        {
            result = String.valueOf((char)('a' + value - 10));
        }
        else
        {
            result = "-1";// 出错误了
        }
        return result;
    }
}
