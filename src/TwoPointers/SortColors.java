package TwoPointers;


/*Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.*/


import java.util.Arrays;

public class SortColors {

    public static int[] sortColors(int[] nums) {
        int s=0,c=0,e=nums.length -1;
        while(c<=e){
            if(nums[c]==0){
                swap(nums,s,c);
                s++;
                c++;
            } else if(nums[c]==1){
                c++;
            } else if(nums[c]==2){
                swap(nums,e,c);
                e--;
            }
        }
        return nums;
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args) {
        int[][] inputs = {
                {0, 1, 0},
                {1, 1, 0, 2},
                {2, 1, 1, 0, 0},
                {2, 2, 2, 0, 1, 0},
                {2, 1, 1, 0, 1, 0, 2}
        };

        for (int i = 0; i < inputs.length; i++) {
            System.out.println((i + 1) + ".\tcolors: " + Arrays.toString(inputs[i]));

            int[] sortedColors = sortColors(inputs[i].clone());
            System.out.println("\n\tThe sorted array is: " + Arrays.toString(sortedColors));

        }
    }
}
