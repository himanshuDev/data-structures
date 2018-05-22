package com.ds.arrayList;

import java.util.List;

public class ArrayListUtil {
	public static <T> boolean isEqual(List<T> list1, List<T> list2) {
		if (list1 == list2) {
			return true;
		}
		if (list1 == null || list2 == null) {
			return false;
		}
		if (list1.size() != list2.size()) {
			return false;
		}
		for (int i = 0; i < list1.size(); i++) {
			if (list1.get(i) != list2.get(i)) {
				return false;
			}
		}
		return true;
	}
}
