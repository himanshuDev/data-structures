package com.ds.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoveZeroesTest {

	@Test
	public void happyPath() {
		MoveZeroes moveZeroes = new MoveZeroes();
		int[] arr = { 0, 1, 0, 3, 12 };
		int[] ansArr = { 1, 3, 12, 0, 0 };
		moveZeroes.moveZeroes(arr);
		if (!ArrayUtil.isEqual(ansArr, arr)) {
			System.out.println("Expected : ");
			ArrayUtil.print(ansArr);
			System.out.println("\nfound : ");
			ArrayUtil.print(arr);
			fail("Not yet implemented");
		}

	}

}
