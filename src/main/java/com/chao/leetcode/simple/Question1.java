package com.chao.leetcode.simple;

/**
 * 两数之和
 */
public class Question1 {
    public static void main(String[] args) {
        int[] nums = {2,3,3,4};
        int target = 7;
        System.out.println(twoSum(nums, target));
    }

    public static int[] twoSum(int[] nums, int target) {

        for(int i = 0; i< nums.length; i++ ){
            for(int j = i+1; j<nums.length; j++){
                int num = nums[i] + nums[j];
                System.out.println(num);
                if(num == target){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
