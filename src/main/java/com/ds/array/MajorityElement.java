package com.ds.array;

public class MajorityElement {
	public int majorityElement(int[] nums) {
		int majorityElement = nums[0];
		int majorityCount = 1;
		for (int i = 1; i < nums.length; i++) {
			if (majorityElement == nums[i]) {
				majorityCount++;
			} else {
				majorityCount--;
			}
			if (majorityCount == 0) {
				majorityCount = 1;
				majorityElement = nums[i];
			}
		}
		return majorityElement;
	}
}
