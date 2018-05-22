package com.ds.array;

public class MoveZeroes {
	public void moveZeroes(int[] nums) {
		if (nums.length == 0 || nums.length == 1) {
			return;
		}
		int zeroBeg = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				if (zeroBeg == -1) {
					zeroBeg = i;
				}
			} else {
				if (zeroBeg != -1) {
					nums[zeroBeg] = nums[i];
					nums[i] = 0;
					zeroBeg++;
				}
			}
		}
	}
}
