package com.ds.linkedList;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTwoNumbersTest {

	@Test
	public void happyPath() {
		ListNode listL1 = ListUtility.generateList(7, 2, 4, 3);
		ListNode listL2 = ListUtility.generateList(5, 6, 4);
		ListNode sumList = new AddTwoNumbers().addTwoNumbers(listL1, listL2);
		ListNode ansNode = ListUtility.generateList(7, 8, 0, 7);
		if (!ListUtility.compareList(sumList, ansNode)) {
			fail("List is not unique it should be " + ListUtility.printList(ansNode) + "List found to be "
					+ ListUtility.printList(sumList));
		}
	}

	@Test
	public void onlyOneElement() {
		ListNode listL1 = ListUtility.generateList(2);
		ListNode listL2 = ListUtility.generateList(9);
		ListNode sumList = new AddTwoNumbers().addTwoNumbers(listL1, listL2);
		ListNode ansNode = ListUtility.generateList(1, 1);
		if (!ListUtility.compareList(sumList, ansNode)) {
			fail("List is not unique it should be " + ListUtility.printList(ansNode) + "List found to be "
					+ ListUtility.printList(sumList));
		}
	}

	@Test
	public void bigList() {
		ListNode listL1 = ListUtility.generateList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		ListNode listL2 = ListUtility.generateList(9, 8, 7, 6, 5, 4, 3, 2, 1);
		ListNode sumList = new AddTwoNumbers().addTwoNumbers(listL1, listL2);
		ListNode ansNode = ListUtility.generateList(1, 1, 1, 1, 1, 1, 1, 1, 1, 0);
		if (!ListUtility.compareList(sumList, ansNode)) {
			fail("List is not unique it should be " + ListUtility.printList(ansNode) + "List found to be "
					+ ListUtility.printList(sumList));
		}
	}

	@Test
	public void twoListWithVariableLengths() {
		ListNode listL1 = ListUtility.generateList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		ListNode listL2 = ListUtility.generateList(1);
		ListNode sumList = new AddTwoNumbers().addTwoNumbers(listL1, listL2);
		ListNode ansNode = ListUtility.generateList(1, 2, 3, 4, 5, 6, 7, 9, 0);
		if (!ListUtility.compareList(sumList, ansNode)) {
			fail("List is not unique it should be " + ListUtility.printList(ansNode) + "List found to be "
					+ ListUtility.printList(sumList));
		}
	}

}
