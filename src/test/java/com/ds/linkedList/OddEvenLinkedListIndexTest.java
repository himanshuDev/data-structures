package com.ds.linkedList;

import static org.junit.Assert.*;

import org.junit.Test;

public class OddEvenLinkedListIndexTest {

	@Test
	public void happyPath() {
		ListNode inputNode = ListUtility.generateList(1, 2, 3, 4, 5, 6, 7);
		ListNode node = new OddEvenLinkedListIndex().oddEvenList(inputNode);
		ListNode ansNode = ListUtility.generateList(1, 3, 5, 7, 2, 4, 6);
		if (!ListUtility.compareList(ansNode, node)) {
			fail("List is not unique it should be " + ListUtility.printList(ansNode) + "List found to be "
					+ ListUtility.printList(node));
		}
	}

	@Test
	public void nullList() {
		ListNode inputNode = null;
		ListNode node = new OddEvenLinkedListIndex().oddEvenList(inputNode);
		if (node != null) {
			fail("null output expected");
		}
	}

	@Test
	public void singleNodeTest() {
		ListNode inputNode = new ListNode(1);
		ListNode node = new OddEvenLinkedListIndex().oddEvenList(inputNode);
		ListNode ansNode = new ListNode(1);
		if (!ListUtility.compareList(node, ansNode)) {
			fail("null output expected");
		}
	}

	@Test
	public void listEndingWithOddNo() {
		ListNode inputNode = ListUtility.generateList(1, 2, 3, 4, 5, 6, 7);
		ListNode node = new OddEvenLinkedListIndex().oddEvenList(inputNode);
		ListNode ansNode = ListUtility.generateList(1, 3, 5, 7, 2, 4, 6);
		if (!ListUtility.compareList(ansNode, node)) {
			fail("List is not unique it should be " + ListUtility.printList(ansNode) + "List found to be "
					+ ListUtility.printList(node));
		}
	}

	@Test
	public void listEndingWithEvenNo() {
		ListNode inputNode = ListUtility.generateList(1, 2, 3, 4, 5, 6);
		ListNode node = new OddEvenLinkedListIndex().oddEvenList(inputNode);
		ListNode ansNode = ListUtility.generateList(1, 3, 5, 2, 4, 6);
		if (!ListUtility.compareList(ansNode, node)) {
			fail("List is not unique it should be " + ListUtility.printList(ansNode) + "List found to be "
					+ ListUtility.printList(node));
		}
	}

	@Test
	public void onlyTwoElements() {
		ListNode inputNode = ListUtility.generateList(1, 2);
		ListNode node = new OddEvenLinkedListIndex().oddEvenList(inputNode);
		ListNode ansNode = ListUtility.generateList(1, 2);
		if (!ListUtility.compareList(ansNode, node)) {
			fail("List is not unique it should be " + ListUtility.printList(ansNode) + "List found to be "
					+ ListUtility.printList(node));
		}
	}

	@Test
	public void onlyThreeElements() {
		ListNode inputNode = ListUtility.generateList(1, 2, 3);
		ListNode node = new OddEvenLinkedListIndex().oddEvenList(inputNode);
		ListNode ansNode = ListUtility.generateList(1, 3, 2);
		if (!ListUtility.compareList(ansNode, node)) {
			fail("List is not unique it should be " + ListUtility.printList(ansNode) + "List found to be "
					+ ListUtility.printList(node));
		}
	}

	@Test
	public void onlyFourElements() {
		ListNode inputNode = ListUtility.generateList(1, 2, 3, 4);
		ListNode node = new OddEvenLinkedListIndex().oddEvenList(inputNode);
		ListNode ansNode = ListUtility.generateList(1, 3, 2, 4);
		if (!ListUtility.compareList(ansNode, node)) {
			fail("List is not unique it should be " + ListUtility.printList(ansNode) + "List found to be "
					+ ListUtility.printList(node));
		}
	}

	@Test
	public void beginsWithZero() {
		ListNode inputNode = ListUtility.generateList(0);
		ListNode node = new OddEvenLinkedListIndex().oddEvenList(inputNode);
		ListNode ansNode = ListUtility.generateList(0);
		if (!ListUtility.compareList(ansNode, node)) {
			fail("List is not unique it should be " + ListUtility.printList(ansNode) + "List found to be "
					+ ListUtility.printList(node));
		}
	}

	@Test
	public void beginsWithEven() {
		ListNode inputNode = ListUtility.generateList(2, 1, 4, 3, 6, 5, 7, 8);
		ListNode node = new OddEvenLinkedListIndex().oddEvenList(inputNode);
		ListNode ansNode = ListUtility.generateList(2, 4, 6, 7, 1, 3, 5, 8);
		if (!ListUtility.compareList(ansNode, node)) {
			fail("List is not unique it should be " + ListUtility.printList(ansNode) + "List found to be "
					+ ListUtility.printList(node));
		}
	}

	@Test
	public void onlyOdd() {
		ListNode inputNode = ListUtility.generateList(1, 3, 5, 7, 9);
		ListNode node = new OddEvenLinkedListIndex().oddEvenList(inputNode);
		ListNode ansNode = ListUtility.generateList(1, 5, 9, 3, 7);
		if (!ListUtility.compareList(ansNode, node)) {
			fail("List is not unique it should be " + ListUtility.printList(ansNode) + "List found to be "
					+ ListUtility.printList(node));
		}
	}

}
