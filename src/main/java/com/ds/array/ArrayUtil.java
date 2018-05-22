package com.ds.array;

public class ArrayUtil {

	public static boolean isEqual(int[] arr1, int[] arr2) {
		if (arr1.length != arr2.length) {
			return false;
		}
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

	public static boolean isEqual(int[][] matrixA, int[][] matrixB) {
		for (int i = 0; i < matrixA.length; i++) {
			for (int j = 0; j < matrixA[i].length; j++) {
				if (matrixA[i][j] != matrixB[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void print(int[] arr) {
		if (arr == null) {
			System.out.println("NULL");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void print(int[][] matrix) {
		System.out.println();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
}
