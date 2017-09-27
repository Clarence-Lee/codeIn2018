import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/27.
 * 第一个字符串长度相等，其中第一个固定，第二个可以旋转
 * 左旋转，第一个字符删除并添加到字符串的末尾；
 * 右旋转，最后一个字符删除并添加到字符串的开头；
 * 求，最长公共前缀，所需要的最小旋转数
 */

public class baidu02 {
    public static void main(String[] args) {
        String str1 = "afghixyz";
        String str2 = "bcdeabcd";
        System.out.print(numOfRotations(str1, str2));
    }


    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    private static int numOfRotations(String stringOne, String stringTwo) {
        // WRITE YOUR CODE HERE
        if (stringOne == null || stringOne.length() == 0) {
            return 0;
        }
        String str2 = stringTwo + stringTwo;
        int len = stringOne.length();
        int max = 0;
        int index = 0;
        for (int i = 0; i <= len; i++) {
            int tmp = getLCSLength(stringOne, str2.substring(i, i + len));
            if (tmp > max) {
                max = tmp;
                index = i;
            }
        }
        return len - index;


    }

    private static int getLCSLength(String s, String t) {
        int p = s.length();
        int q = t.length();

        int count = 0;
        for (int i = 0; i < p; i++) {
            if (s.charAt(i) == t.charAt(i)) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}