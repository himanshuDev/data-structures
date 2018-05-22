package com.ds.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayPartitionTest1 {
	@Test
	public void happyPath() {
		ArrayPartition1 arrayPartition1 = new ArrayPartition1();
		int[] inputArray = { 1, 4, 3, 2 };
		int result = 4;
		int output = arrayPartition1.arrayPairSum(inputArray);
		if (result != output) {
			fail("found output as : " + output + ", Expected output : " + result);
		}
	}
}
