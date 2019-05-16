package com.leetcode.problem189;

public class RotateArray {
	public static void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0) return;
        
        for (int j = 0; j <= k ; j++) {
            int temp = nums[0];
            for (int i = 1; i < nums.length; i++) {
                nums[i-1] = nums[i];
            }
            nums[nums.length-1] = temp;
        }
    }
}
