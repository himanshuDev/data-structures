package com.ds.array;

public class MatrixReshape {
	public int[][] matrixReshape(int[][] nums, int r, int c) {
		if (nums == null || nums.length == 0 || nums[0].length == 0) {
			return nums;
		}
		if (r * c != nums.length * nums[0].length) {
			return nums;
		}
		int numsRowPointer = 0;
		int numsColPointer = 0;
		int[][] resizedMatrix = new int[r][];
		for (int i = 0; i < r; i++) {
			int[] innerArray = new int[c];
			for (int j = 0; j < c; j++) {
				if (numsColPointer == nums[0].length) {
					numsColPointer = 0;
					numsRowPointer += 1;
				}
				innerArray[j] = nums[numsRowPointer][numsColPointer];
				numsColPointer += 1;
			}
			resizedMatrix[i] = innerArray;
		}
		return resizedMatrix;
	}
}
