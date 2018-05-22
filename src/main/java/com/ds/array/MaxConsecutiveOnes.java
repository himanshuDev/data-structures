package com.ds.array;

public class MaxConsecutiveOnes {
	public int findMaxConsecutiveOnes(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int maxOccurenceOfOne = 0;
		int oneCount = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				oneCount++;
			} else {
				maxOccurenceOfOne = maxOccurenceOfOne < oneCount ? oneCount : maxOccurenceOfOne;
				oneCount = 0;
			}
		}
		maxOccurenceOfOne = maxOccurenceOfOne < oneCount ? oneCount : maxOccurenceOfOne;
		return maxOccurenceOfOne;
	}
}
