package com.ds.array;

public class FlipAndInvertImage {
	public int[][] flipAndInvertImage(int[][] A) {
		if (A == null || A.length == 0) {
			return A;
		}
		for (int i = 0; i < A.length; i++) {
			int innerArrayLen = A[i].length;
			int jCount = innerArrayLen % 2 != 0 ? ((innerArrayLen / 2) + 1) : innerArrayLen / 2;

			for (int j = 0; j < jCount; j++) {
				if (j == (innerArrayLen - 1 - j)) {
					A[i][j] = A[i][j] == 0 ? 1 : 0;
				} else {
					if (A[i][j] == A[i][innerArrayLen - 1 - j]) {
						A[i][j] = A[i][j] == 0 ? 1 : 0;
						A[i][innerArrayLen - 1 - j] = A[i][innerArrayLen - 1 - j] == 0 ? 1 : 0;
					}
				}
			}
		}
		return A;
	}
}
