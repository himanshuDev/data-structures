package com.ds.linkedList;

import static org.junit.Assert.*;

import org.junit.Test;

public class Partition {

	@Test
	public void happyPath() {
		ListNode inputList = ListUtility.generateList(1, 4, 3, 2, 5, 2);
		ListNode outputList = new PartitionLinedList().partition(inputList, 3);
		ListNode ansList = ListUtility.generateList(1, 2, 2, 4, 3, 5);
		if (!ListUtility.compareList(outputList, ansList)) {
			fail("alog in apporpriate. Expected " + ListUtility.printList(ansList) + "\n found "
					+ ListUtility.printList(outputList));
		}
	}

	@Test
	public void nullList() {
		ListNode inputList = null;
		ListNode outputList = new PartitionLinedList().partition(inputList, 3);
		if (outputList != null) {
			fail("Output should be null");
		}
	}

	@Test
	public void singleElementList() {
		ListNode inputList = ListUtility.generateList(100);
		ListNode outputList = new PartitionLinedList().partition(inputList, 3);
		ListNode ansList = ListUtility.generateList(100);
		if (!ListUtility.compareList(outputList, ansList)) {
			fail("alog in apporpriate. Expected " + ListUtility.printList(ansList) + "\n found "
					+ ListUtility.printList(outputList));
		}
	}

	@Test
	public void firstElementIsMax() {
		ListNode inputList = ListUtility.generateList(5, 4, 3, 2, 3, 1);
		ListNode outputList = new PartitionLinedList().partition(inputList, 2);
		ListNode ansList = ListUtility.generateList(1, 5, 4, 3, 2, 3);
		if (!ListUtility.compareList(outputList, ansList)) {
			fail("alog in apporpriate. Expected " + ListUtility.printList(ansList) + "\n found "
					+ ListUtility.printList(outputList));
		}
	}

	@Test
	public void LastElementIsMax() {
		ListNode inputList = ListUtility.generateList(1, 2, 3, 4, 5, 6);
		ListNode outputList = new PartitionLinedList().partition(inputList, 6);
		ListNode ansList = ListUtility.generateList(1, 2, 3, 4, 5, 6);
		if (!ListUtility.compareList(outputList, ansList)) {
			fail("alog in apporpriate. Expected " + ListUtility.printList(ansList) + "\n found "
					+ ListUtility.printList(outputList));
		}
	}

	@Test
	public void allGreaterThanXinList() {
		ListNode inputList = ListUtility.generateList(1, 2, 3, 4, 5, 6);
		ListNode outputList = new PartitionLinedList().partition(inputList, -6);
		ListNode ansList = ListUtility.generateList(1, 2, 3, 4, 5, 6);
		if (!ListUtility.compareList(outputList, ansList)) {
			fail("alog in apporpriate. Expected " + ListUtility.printList(ansList) + "\n found "
					+ ListUtility.printList(outputList));
		}
	}

	@Test
	public void twoElements() {
		ListNode inputList = ListUtility.generateList(2, 1);
		ListNode outputList = new PartitionLinedList().partition(inputList, 2);
		ListNode ansList = ListUtility.generateList(1, 2);
		if (!ListUtility.compareList(outputList, ansList)) {
			fail("alog in apporpriate. Expected " + ListUtility.printList(ansList) + "\n found "
					+ ListUtility.printList(outputList));
		}
	}

}
