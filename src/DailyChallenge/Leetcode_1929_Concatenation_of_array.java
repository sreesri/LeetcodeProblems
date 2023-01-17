package DailyChallenge;

import java.util.Arrays;

class ArrayConcatenation {

    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        for(int i = 0;i <nums.length;i++){
            ans[i]=nums[i];
            ans[nums.length+i]= nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
}
