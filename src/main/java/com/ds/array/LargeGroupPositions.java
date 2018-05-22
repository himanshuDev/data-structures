package com.ds.array;

import java.util.ArrayList;
import java.util.List;

public class LargeGroupPositions {
	public List<List<Integer>> largeGroupPositions(String S) {
		List<List<Integer>> groupPositionsList = new ArrayList<>();
		if (S == null || S.length() == 0 || S.length() < 3) {
			return groupPositionsList;
		}
		char repetingChar = S.charAt(0);
		int repetingCharStartPointer = 0;
		int repetingCharCount = 1;
		for (int i = 1; i < S.length(); i++) {
			char ch = S.charAt(i);
			if (ch == repetingChar && i != S.length() - 1) {
				repetingCharCount++;
			} else {

				if (i == (S.length() - 1) && ch == repetingChar) {
					repetingCharCount++;
					i = i + 1;
				}

				if (repetingCharCount > 2) {
					List<Integer> repeatingList = new ArrayList<>();
					repeatingList.add(repetingCharStartPointer);
					repeatingList.add(i - 1);
					groupPositionsList.add(repeatingList);
					repetingCharCount = 0;
				}
				repetingChar = ch;
				repetingCharStartPointer = i;
				repetingCharCount = 1;
			}
		}
		return groupPositionsList;
	}
}
