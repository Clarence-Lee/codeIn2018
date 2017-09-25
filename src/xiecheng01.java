import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/21.
 */
public class xiecheng01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] mArr = new int[m];
        for (int i = 0; i < m; i++){
            mArr[i] = sc.nextInt();
        }

        int n = sc.nextInt();
        int[] nArr = new int[n];
        for (int i = 0; i < n; i++){
            nArr[i] = sc.nextInt();
        }





        System.out.println();
    }

    private double findMedian(int[] A, int[] B) {
        if (A == null || B == null) {
            return 0;
        }
        int indA = 0;
        int indB = 0;
        double median = 0;
        int med = (A.length + B.length + 1) / 2;
        while(indA + indB != med) {
            int B1 = (indB == B.length) ? Integer.MAX_VALUE : B[indB];
            int A1 = (indA == A.length) ? Integer.MAX_VALUE : A[indA];

            if (A1 < B1) {
                median = A[indA];
                indA++;
            }else {
                median = B[indB];
                indB++;
            }
        }
        int len = A.length+B.length;
        if (len % 2 == 1) {
            return median;
        } else {
            int B1 = (indB == B.length) ? Integer.MAX_VALUE : B[indB];
            int A1 = (indA == A.length) ? Integer.MAX_VALUE : A[indA];
            double med2 = (A1<B1) ? A1 : B1;
            return (median + med2) /2;
        }
    }


/*
    private double findMedian(int[] num1, int[] num2) {
        int m = num1.length;
        int n = num2.length;
        int left = (m+n+1)/2;
        int right = (m+n+1)/2;
        return findMed(num1, 0, m - 1, num2, 0, n - 1);
    }
    private double findMed(int[] num1, int start1, int end1, int[] num2, int start2, int end2) {
        if (end1 < start1 && end2 < start2) {
            return 0;
        }else if (end1 == start1 && end2 == start2) {
            return (double) (num1[start1] + num2[start2]) / 2;
        } else if (end1 >= start1 && end2 < start2) {
            return (end1 + start1) % 2 == 0 ? num1[(end1 + start1) / 2]
                    : (double) (num1[(end1 + start1) / 2] + num1[(end1 + start1) / 2 + 1]) / 2;
        } else if (end1 < start1 && end2 >= start2) {
            return (end2 + start2) % 2 == 0 ? num2[(end2 + start2) / 2]
                    : (double) (num2[(end2 + start2) / 2] + num2[(end2 + start2) / 2 + 1]) / 2;
        } else {
            if (num1[start1] >= num2[start2]) {
                if (num1[end1] <= num2[end2]) {
                    return findMed(num1, start1, end1, num2, start2 + 1, end2 - 1);
                } else {
                    return findMed(num1, start1, end1 - 1, num2, start2 + 1, end2);
                }
            } else {
                if (num1[end1] <= num2[end2]) {
                    return findMed(num1, start1 + 1, end1, num2, start2, end2 - 1);
                } else {
                    return findMed(num1, start1 + 1, end1 - 1, num2, start2, end2);
                }
            }
        }
    }
    */
}
