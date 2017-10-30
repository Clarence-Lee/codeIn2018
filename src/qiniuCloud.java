/**
 * Created by Administrator on 2017/10/28.
 */
public class qiniuCloud {
    public static void main(String[] args){

    }

    public class Solution {
        public String minNum(int[] nums) {
            int[] hash = new int[10];
            for (int i = 0; i < nums.length; i++){
                //拆解每个元素中的数字
                int num = nums[i];
                while (num > 0){
                    int lastNum = num % 10;     //计算每一位上数字
                    hash[lastNum]++;
                    num = num / 10;
                }
            }

            StringBuilder result = null;

            for(int i= 9; i >= 0; i--){
                //不需要考虑hash[10],因为此处为 0 的个数
                while (hash[i] > 0){
                    result.append(String.valueOf(i));
                }
            }
            return result.toString();
        }
    }
}
