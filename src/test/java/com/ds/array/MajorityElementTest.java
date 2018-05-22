package com.ds.array;

import static org.junit.Assert.fail;

import org.junit.Test;

public class MajorityElementTest {

	@Test
	public void happyPath() {
		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
		MajorityElement majorityElement = new MajorityElement();
		int element = majorityElement.majorityElement(nums);
		if (element != 2) {
			System.out.println("Expected 2 found " + element);
			fail("Not yet implemented");
		}
	}

	@Test
	public void bigMajority() {
		int[] nums = { 2, 2, 1, 1, 1, 1, 1, 1 };
		MajorityElement majorityElement = new MajorityElement();
		int element = majorityElement.majorityElement(nums);
		if (element != 1) {
			System.out.println("Expected 1 found " + element);
			fail("Not yet implemented");
		}
	}

}
