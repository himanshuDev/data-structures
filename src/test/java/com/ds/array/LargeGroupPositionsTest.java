package com.ds.array;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.ds.arrayList.ArrayListUtil;

public class LargeGroupPositionsTest {

	@Test
	public void happyPath() {
		String S = "abbxxxxzyy";
		LargeGroupPositions largeGroupPositions = new LargeGroupPositions();
		List<List<Integer>> resultList = largeGroupPositions.largeGroupPositions(S);
		List<List<Integer>> ansList = new ArrayList<>();
		List<Integer> indexBoundary = new ArrayList<>();
		indexBoundary.add(3);
		indexBoundary.add(6);
		ansList.add(indexBoundary);
		if (!ArrayListUtil.isEqual(indexBoundary, resultList.get(0))) {
			System.out.println("Expected : " + ansList + ", Found :" + resultList);
			fail("Not yet implemented");
		}

	}

	@Test
	public void noRepeatingGroup() {
		String S = "abc";
		LargeGroupPositions largeGroupPositions = new LargeGroupPositions();
		List<List<Integer>> resultList = largeGroupPositions.largeGroupPositions(S);
		List<List<Integer>> ansList = new ArrayList<>();
		if (!ArrayListUtil.isEqual(ansList, resultList)) {
			System.out.println("Expected : " + ansList + ", Found :" + resultList);
			fail("Not yet implemented");
		}

	}

	@Test
	public void oneRepeatingGroup() {
		String S = "aaa";
		LargeGroupPositions largeGroupPositions = new LargeGroupPositions();
		List<List<Integer>> resultList = largeGroupPositions.largeGroupPositions(S);
		List<List<Integer>> ansList = new ArrayList<>();
		List<Integer> indexBoundary = new ArrayList<>();
		indexBoundary.add(0);
		indexBoundary.add(2);
		ansList.add(indexBoundary);
		if (!ArrayListUtil.isEqual(resultList.get(0), indexBoundary)) {
			System.out.println("Expected : " + ansList + ", Found :" + resultList);
			fail("Test Case failed");
		}

	}

}
