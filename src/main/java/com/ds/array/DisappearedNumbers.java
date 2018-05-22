package com.ds.array;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbers {
	public List<Integer> findDisappearedNumbers1(int[] nums) {
		List<Integer> result = new ArrayList<>();
		if (nums == null || nums.length == 0) {
			return result;
		}
		boolean[] arr = new boolean[nums.length];
		for (int i = 0; i < nums.length; i++) {
			arr[nums[i] - 1] = true;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != true) {
				result.add(i + 1);
			}
		}
		return result;
	}

	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> result = new ArrayList<>();
		if (nums == null || nums.length == 0) {
			return result;
		}
		for (int i = 0; i < nums.length; i++) {
			int val = Math.abs(nums[i]) - 1;
			if (nums[val] > 0) {
				nums[val] = -nums[val];
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				result.add(i + 1);
			}
		}
		return result;
	}
}
