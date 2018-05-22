package com.ds.linkedList;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseLinkedLIstTest {

	@Test
	public void HappyPath() {
		ListNode questionNode = ListUtility.generateList(1, 2, 3, 4, 5);
		ListNode defAnswer = ListUtility.generateList(5, 4, 3, 2, 1);
		ListNode ansNode = new ReverseLinkedLIst().reverse(questionNode);
		if (!ListUtility.compareList(defAnswer, ansNode)) {
			fail("List is not unique it should be " + ListUtility.printList(defAnswer) + "List found to be "
					+ ListUtility.printList(questionNode));
		}
	}

	@Test
	public void onlyOneNode() {
		ListNode questionNode = ListUtility.generateList(1);
		ListNode defAnswer = ListUtility.generateList(1);
		ListNode ansNode = new ReverseLinkedLIst().reverse(questionNode);
		if (!ListUtility.compareList(defAnswer, ansNode)) {
			fail("List is not unique it should be " + ListUtility.printList(defAnswer) + "List found to be "
					+ ListUtility.printList(questionNode));
		}
	}

	@Test
	public void onlyTwoNode() {
		ListNode questionNode = ListUtility.generateList(1, 2);
		ListNode defAnswer = ListUtility.generateList(2, 1);
		ListNode ansNode = new ReverseLinkedLIst().reverse(questionNode);
		if (!ListUtility.compareList(defAnswer, ansNode)) {
			fail("List is not unique it should be " + ListUtility.printList(defAnswer) + "List found to be "
					+ ListUtility.printList(questionNode));
		}
	}

	@Test
	public void onlyThreeNode() {
		ListNode questionNode = ListUtility.generateList(1, 2, 3);
		ListNode defAnswer = ListUtility.generateList(3, 2, 1);
		ListNode ansNode = new ReverseLinkedLIst().reverse(questionNode);
		if (!ListUtility.compareList(defAnswer, ansNode)) {
			fail("List is not unique it should be " + ListUtility.printList(defAnswer) + "List found to be "
					+ ListUtility.printList(questionNode));
		}
	}

}
