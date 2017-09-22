import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/13.
 */
public class zhaos01 extends Thread{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int minMul = multiple(a, b);

        if (minMul > c) {
            System.out.print(0);
        }else {
            System.out.println((c-minMul)/minMul + 1);
        }



    }
    public static int multiple(int x,int y){
        int z;
        for(z=x;;z++){
            if(z%x==0&&z%y==0){
                break;
            }
        }
        return z;
    }
}