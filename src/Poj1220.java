
import java.math.BigInteger;
import java.util.Scanner;

public class Poj1220 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);



            int a = cin.nextInt();
            int b = cin.nextInt();
            String aa = cin.next();
            //System.out.println(a+" "+aa);
            //System.out.print(b+" ");

            BigInteger sum = BigInteger.ZERO;
            for(int i=0; i<aa.length();i++){
                sum = sum.multiply(BigInteger.valueOf(a)).add(BigInteger.valueOf(getnum(aa.charAt(i))));
            }


            String bb = "";

            while(!sum.equals(BigInteger.ZERO)){
                bb = retchar(sum.mod(BigInteger.valueOf(b)).intValue()) + bb;
                sum = sum.divide(BigInteger.valueOf(b));
            }
            if(bb.equals("")) bb="0";
            System.out.println(bb);


    }
    static int getnum(char m){
        if(m>='0' && m<='9') return m - '0';
        else if(m>='a' && m<='z') return m-'a'+10;
        else return m-'A'+36;
    }
    static char retchar(int i){
        if(i<=9) return (char) (i + '0');
        else if(i>=10 && i<=35) return (char)(i -10+'a');
        else return (char)(i-36+'A');
    }
}