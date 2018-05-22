package com.ds.array;

import static org.junit.Assert.fail;

import org.junit.Test;

public class MaxConsecutiveOnesTest {

	@Test
	public void happyPath() {
		MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
		int[] inputArr = { 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1 };
		int output = maxConsecutiveOnes.findMaxConsecutiveOnes(inputArr);
		if (output != 5) {
			fail("Expected 5 found " + output);
		}
	}

}
