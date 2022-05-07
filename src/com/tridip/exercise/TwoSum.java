package com.tridip.exercise;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,5,6,1,3,8};
		int target = 14;
		int[] k = twoSum(nums,target);
		System.out.println(k[0]+" "+k[1]);

	}

	private static int[] twoSum(int[] nums, int target) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> mp = new HashMap<>();
		
		for(int i=0; i<nums.length; i++) {
			int n= target-nums[i];
			if(!mp.containsKey(n)) {
				mp.put(nums[i],i);
			} else {
				return  new int[]{mp.get(n),i};
			}
		}
		return null;
	}

}
