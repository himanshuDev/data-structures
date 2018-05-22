package com.ds.array;

import org.junit.Test;
import static org.junit.Assert.fail;

public class ToeplitzMatrixTest {
	@Test
	public void happyPath() {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 1, 2, 3 }, { 6, 5, 1, 2 } };
		if (!ToeplitzMatrix.isToeplitzMatrix(matrix)) {
			fail("Expected true for this matrix");
		}
	}

	@Test
	public void arrayWithSingleLength() {
		int[][] matrix = { { 1 }, { 2 } };
		if (!ToeplitzMatrix.isToeplitzMatrix(matrix)) {
			fail("Expected true for this matrix");
		}
	}
}
