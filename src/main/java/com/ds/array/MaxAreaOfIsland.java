package com.ds.array;

public class MaxAreaOfIsland {
	public int maxAreaOfIsland(int[][] grid) {
		if (grid.length == 0) {
			return 0;
		}
		int maxArea = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 1) {
					maxArea = Math.max(maxArea, this.calculateArea(grid, i, j));
				}
			}
		}
		return maxArea;
	}

	private int calculateArea(int[][] grid, int i, int j) {
		int area = 0;
		if (grid[i][j] == 1) {
			area = 1;
			grid[i][j] = 0;
			if (isNorthPresent(grid, i, j)) {
				area += calculateArea(grid, i - 1, j);
			}
			if (isSouthPresent(grid, i, j)) {
				area += calculateArea(grid, i + 1, j);
			}
			if (isEastPresent(grid, i, j)) {
				area += calculateArea(grid, i, j + 1);
			}
			if (isWestPresent(grid, i, j)) {
				area += calculateArea(grid, i, j - 1);
			}
		}
		return area;
	}

	private boolean isWestPresent(int[][] arr, int i, int j) {
		if (j != 0 && arr[i][j - 1] == 1) {
			return true;
		}
		return false;
	}

	private boolean isSouthPresent(int[][] arr, int i, int j) {
		if (i != arr.length - 1 && arr[i + 1][j] == 1) {
			return true;
		}
		return false;
	}

	private boolean isEastPresent(int[][] arr, int i, int j) {
		if (j != arr[0].length - 1 && arr[i][j + 1] == 1) {
			return true;
		}
		return false;
	}

	private boolean isNorthPresent(int[][] arr, int i, int j) {
		if (i != 0 && arr[i - 1][j] == 1) {
			return true;
		}
		return false;
	}
}
