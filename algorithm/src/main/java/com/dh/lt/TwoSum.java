package com.dh.lt;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length < 2) {
            return new int[]{};
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public int[] twoSumV2(int[] nums, int target) {
        if (nums.length < 2) {
            return new int[]{};
        }
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

        }
        return new int[]{};

    }

    @Test
    public void testTwoSum() {
        int nums[] = {3,2,3}, target = 6;
        int array[] = twoSum(nums,target);
        for (int i : array) {
            System.out.println(i);
        }
    }
}
