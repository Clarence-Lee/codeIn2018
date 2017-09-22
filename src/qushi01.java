/**
 * Created by Administrator on 2017/9/17.
 */
public class qushi01 {
    public static void main(String []args) {
        System.out.println("Hello World!");
        System.out.println(get(2));
    }
    public static int get(int i){
        int res = 0;
        switch(i) {
            case 1:
                res = res + i;
            case 2:
                res = res + i*2;
            case 3:
                res = res + i*3;
            case 4:
                res = res + i*4;
        }
        return res;
    }
}
