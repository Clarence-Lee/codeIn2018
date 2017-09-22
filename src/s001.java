import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class s001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<UnilateralLine> lineList = new ArrayList<UnilateralLine>();
        while (scanner.hasNextLine()) {
            String[] options = scanner.nextLine().split(";");
            if (options.length < 5) {
                break;
            }
            lineList.add(new UnilateralLine(options[0], options[1], options[2], options[3], options[4], options[5]));
        }
        scanner.close();


        // wirte your code here
        //System.out.print((lineList.get(0).getSCen().equals(lineList.get(2).getSCen()) ));
        for (int i = 0 ; i < lineList.size(); i++) {
            boolean isSame = false;
            for (int j = i + 1; j < lineList.size(); j++) {
                if (lineList.get(i).getECen().equals(lineList.get(j).getECen()) &&
                        lineList.get(i).getSCen().equals(lineList.get(j).getSCen()) &&
                        lineList.get(i).getTType().equals(lineList.get(j).getTType())) {
                    isSame = true;
                    break;
                }
            }

            for (int j = i+1; j < lineList.size(); j++) {
                if (isSame && lineList.get(i).getECen().equals(lineList.get(j).getSCen()) &&
                        lineList.get(i).getSCen().equals(lineList.get(j).getECen())){
                    System.out.println("rule1:"+lineList.get(i).getId() + "+" + lineList.get(j).getId());
                } else if (lineList.get(i).getSCen().equals(lineList.get(j).getECen()) &&
                        lineList.get(i).getECen().equals(lineList.get(j).getSCen()) &&
                        lineList.get(i).getTType().equals(lineList.get(j).getTType())){
                    System.out.println("rule1:"+lineList.get(i).getId() + "+" + lineList.get(j).getId());
                }
            }
        }


        List<String> result = calculateUnilateral(lineList);
        for (String str : result) {
            System.out.println(str);
        }
    }
    public static List<String> calculateUnilateral(List<UnilateralLine> lineList) {
        //Iterator<UnilateralLine> it = lineList.iterator();

        List<String> result = new ArrayList<String>();
        // result.add(it.next().getECen());
        return result;
    }
    public static class UnilateralLine {
        private String id;
        private String sCen;//出发分拨
        private String sPro;//出发省
        private String eCen;//到达分拨
        private String ePro;//到达省
        //9.6m/17.5m
        private String tType;//车型
        public UnilateralLine(String id, String sCen, String sPro, String eCen, String ePro,String tType) {
            this.id = id;this.sCen = sCen;this.sPro = sPro;this.eCen = eCen;this.ePro = ePro;this.tType = tType;}
        public String getId() {return id;}
        public void setId(String id) {this.id = id;}
        public String getSCen() {return sCen;}
        public void setSCen(String ePro) {this.ePro = ePro;}
        public String getSPro() {return sPro;}
        public void setSPro(String sPro) {this.sPro = sPro;}
        public String getECen() {return eCen;}
        public void setECen(String eCen) {this.eCen = eCen;}
        public String getEPro() {return ePro;}
        public void setEPro(String ePro) {this.ePro = ePro;}
        public String getTType() {return tType;}
        public void setTType(String tType) {this.tType = tType;}
    }
}