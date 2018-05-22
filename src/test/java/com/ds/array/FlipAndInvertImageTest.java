package com.ds.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class FlipAndInvertImageTest {

	@Test
	public void happyPath() {
		int[][] A = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
		int[][] ans = { { 1, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } };
		FlipAndInvertImage flipAndInvertImage = new FlipAndInvertImage();
		int[][] output = flipAndInvertImage.flipAndInvertImage(A);
		if (!ArrayUtil.isEqual(ans, output)) {
			System.out.println("Expected ");
			ArrayUtil.print(ans);
			System.out.println("Found ");
			ArrayUtil.print(output);
			fail("Not yet implemented");
		}
	}

}
