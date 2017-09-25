import java.util.*;

/**
 * Created by Administrator on 2017/9/25.
 * 对于 整数X，是否更改顺序有它自身的x倍出现
 */
public class wangyi092502 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i< num; i++){
            System.out.println(sul(sc.nextInt()));
        }
    }

    private static String sul(int integ){
        String str = String.valueOf(integ);
        Set<Character> byteSet = new HashSet<Character>();
        for (int i=0; i < str.length(); i++) {
            byteSet.add(str.charAt(i));
        }
        List<Integer> list = new ArrayList<Integer>();

        int q = 2;
        while (true){
            int tmp = integ * q++;
            if(String.valueOf(tmp).length() != str.length()){
                break;
            }else {
                list.add(tmp);
            }
        }

        int i=0;
        while(i < list.size()){
            Integer integer = list.get(i);
            String strInteg = String.valueOf(integer);
            //Set<Character> byteIneg = new HashSet<Character>();
            int count = 0;
            for (int j=0; j< strInteg.length(); j++){
                if (byteSet.contains(strInteg.charAt(j))) {
                    count++;
                }
            }
            if (count == strInteg.length()){
                return "Possible";
            }
            i++;
        }
        return "Impossible";
    }
}
