package com.ds.array;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.ds.arrayList.ArrayListUtil;

public class DisappearedNumbersTest {

	@Test
	public void happyPath() {
		DisappearedNumbers disappearedNumbers = new DisappearedNumbers();
		int[] inputArr = { 4, 3, 2, 7, 8, 2, 3, 1 };
		List<Integer> answerList = new ArrayList<>();
		answerList.add(5);
		answerList.add(6);
		List<Integer> outputList = disappearedNumbers.findDisappearedNumbers(inputArr);
		if (!ArrayListUtil.isEqual(answerList, outputList)) {
			System.out.println("Expceted :" + answerList + " \nFound :" + outputList);
			fail("failed");
		}
	}

}
