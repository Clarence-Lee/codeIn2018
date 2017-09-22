import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/26.
 */
public class didi02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        while (in.hasNextInt()) {
            list.add(in.nextInt());
        }

        int N = list.size();
        int K = list.get(N-1);
        //Integer[] nums = (Integer[]) list.toArray();
        Integer[] nums = (Integer[])list.toArray(new Integer[0]);
        int[] num = new int[N-1];
        for (int i = 0; i < nums.length - 1; i++) {
            num[i] = (int) nums[i];
        }


        int result = findKthLargest(num, K);
        System.out.println(result);
    }

    private static int findKthLargest(int[] nums, int k) {
        k--;
        int lo = 0;
        int hi = nums.length - 1;
        int index = 0;
        while(lo < hi){
            index = partition(nums, lo, hi);
            if(k < index) hi = index - 1;
            else if(k > index) lo = index + 1;
            else return nums[index];
        }
        return nums[lo];
    }

    // Return the index of pivot after sort
    // Numbers on its left are greater, numbers on its right are smaller
    private static int partition(int[] a, int lo, int hi){
        int i = lo;
        int j = hi;
        int pivot = a[lo];
        while(i < j){
            while(i < j && a[j] <= pivot) j--;
            a[i] = a[j];
            while(i < j && a[i] >= pivot) i++;
            a[j] = a[i];
        }
        a[i] = pivot;
        return i;
    }
}
