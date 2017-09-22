/**
 * Created by Administrator on 2017/9/9.
 */
public class Test {
    public static void main(String[] args) {
        Object obj = new Object() {
            public boolean equals(Object obj) {
                return true;
            }
        };
        System.out.print(obj.equals("hell"));
    }
}
