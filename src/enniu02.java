import java.util.Scanner;

public class enniu02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r =0;
        String s = "u51";
        //StringBuffer sub = new StringBuffer();

        while(sc.hasNextLine()) {
            String sub = sc.nextLine();

            for(int i=0;i<sub.length();i++) {
                if(sub.indexOf(s, i)!=-1){
                    i=sub.indexOf(s, i);
                    r++;
                }
            }

        }


        System.out.println(r);
    }
}