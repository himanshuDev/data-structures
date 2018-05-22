package com.ds.array;

import static org.junit.Assert.*;
import org.junit.Test;

public class MatrixReshapeTest {
	@Test
	public void happyPath() {
		int[][] matrix = { { 1, 2 }, { 3, 4 } };
		int[][] outPutMatrix = { { 1, 2, 3, 4 } };
		int r = 1, c = 4;
		MatrixReshape matrixReshape = new MatrixReshape();
		int[][] reShapedMatrix = matrixReshape.matrixReshape(matrix, r, c);
		if (!ArrayUtil.isEqual(outPutMatrix, reShapedMatrix)) {
			System.out.println("Expected ");
			ArrayUtil.print(outPutMatrix);
			System.out.println("found");
			ArrayUtil.print(reShapedMatrix);
			fail("Test failed");
		}
	}
}
