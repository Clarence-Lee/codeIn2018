import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/10/28.
 */
public class iqiyi01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextBigInteger().toString();
        String nu = num;
        String sum = null;

        while (true){
            String[] shu = new String[num.length()];

            for(int i = 0; i < num.length(); i++){
                shu[i] = num.substring(0, num.length() - i);
            }
            sum = shu[0];
            for (int i = 1; i < shu.length; i++){
                sum = additionTwoNumber(shu[i], sum);
            }
            BigInteger a = new BigInteger(num);
            BigInteger b = new BigInteger("1");
            if(sum.equals(nu)){
                System.out.print(shu[0]);
                break;
            }
            num = a.add(new BigInteger("-"+b)).toString();
        }

    }


    public static String additionTwoNumber(String num1, String num2) {

        // 检查输入
        if (!checkIsNumber(num1) || !checkIsNumber(num2)) {
            System.out.println("input error");
            return null;
        }

        // 反转两个字符串,使个位数在最前方便计算
        StringBuffer s1 = new StringBuffer(num1).reverse();
        StringBuffer s2 = new StringBuffer(num2).reverse();

        // 低位字符串补齐
        int lengthDiff = Math.abs(s1.length() - s2.length());
        if (lengthDiff != 0) {
            for (int i = 0; i < lengthDiff; i++) {
                if (s1.length() > s2.length()) {
                    s2.append("0");
                } else {
                    s1.append("0");
                }
            }
        }

        // 位数相加
        final int length = s1.length();
        StringBuffer result = new StringBuffer();
        boolean isOver = false;

        for (int i = 0 ; i < length ; i++) {
            int indexNum1 = Integer.parseInt(s1.charAt(i)+"");
            int indexNum2 = Integer.parseInt(s2.charAt(i)+"");

            int numResult = indexNum1 + indexNum2 + (isOver ? 1 : 0);
            isOver = numResult > 10 ? true : false;
            result.append(String.valueOf(numResult > 10 ? numResult-10 : numResult));
        }

        // 再次反转输入
        return result.reverse().toString();
    }

    public static boolean checkIsNumber(String inputString) {
        return inputString != null && !"".equals(inputString) && inputString.matches("[0-9]+");
    }
}
