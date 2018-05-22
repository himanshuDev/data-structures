package com.ds.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxAreaOfIslandTest {

	@Test
	public void happyPath() {
		int[][] grid = { { 0, 1, 0 }, { 1, 1, 1 }, { 0, 1, 0 } };
		MaxAreaOfIsland maxAreaOfIsland = new MaxAreaOfIsland();
		int area = maxAreaOfIsland.maxAreaOfIsland(grid);
		if (area != 5) {
			System.out.println("expected 5 found " + area);
			fail("expected 5 found " + area);
		}
	}

	@Test
	public void bigArea() {
		int[][] grid = { { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
				{ 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0 },
				{ 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 } };
		MaxAreaOfIsland maxAreaOfIsland = new MaxAreaOfIsland();
		int area = maxAreaOfIsland.maxAreaOfIsland(grid);
		if (area != 6) {
			System.out.println("expected 6 found " + area);
			fail("expected 6 found " + area);
		}
	}

	@Test
	public void singleElement() {
		int[][] grid = { { 1 } };
		MaxAreaOfIsland maxAreaOfIsland = new MaxAreaOfIsland();
		int area = maxAreaOfIsland.maxAreaOfIsland(grid);
		if (area != 1) {
			System.out.println("expected 1 found " + area);
			fail("expected 1 found " + area);
		}
	}

	@Test
	public void singleRow() {
		int[][] grid = { { 0, 1 } };
		MaxAreaOfIsland maxAreaOfIsland = new MaxAreaOfIsland();
		int area = maxAreaOfIsland.maxAreaOfIsland(grid);
		if (area != 1) {
			System.out.println("expected 1 found " + area);
			fail("expected 1 found " + area);
		}
	}

}
