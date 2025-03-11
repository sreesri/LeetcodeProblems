package TwoPointers;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {

        // Replace this placeholder return statement with your code
        Arrays.sort(nums);
        Integer previous = null;
        List<List<Integer>> result=new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                return result;
            }
            if( previous != null && nums[i]== previous){
                continue;
            }
            previous = nums[i];
            int l = i+1;
            int h = nums.length-1;
            while(l < h){
                if(nums[l] + nums[h] + nums[i] == 0){
                    result.add(Arrays.asList(nums[l] , nums[h] , nums[i]));
                    l++;
                    h--;
                    while (l < h && nums[l] == nums[l - 1]) {
                        l++;
                    }
                    while (l < h && nums[h] == nums[h + 1]) {
                        h--;
                    }
                }
                else if(nums[l] + nums[h] + nums[i] < 0){
                    l++;
                }
                else if(nums[l] + nums[h] + nums[i] > 0){
                    h--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{0,0,0,0}));
    }
}

