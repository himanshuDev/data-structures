package com.ds.linkedList;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReorderListTest {

	@Test
	public void happyPath() {
		ListNode questionHead = ListUtility.generateList(1, 2, 3, 4, 5, 6);
		new ReorderList().reorderList(questionHead);
		ListUtility.printList(questionHead);
		ListNode answerHead = ListUtility.generateList(1, 6, 2, 5, 3, 4);
		if (!ListUtility.compareList(questionHead, answerHead)) {
			fail("List is not unique it should be " + ListUtility.printList(answerHead) + "List found to be "
					+ ListUtility.printList(questionHead));
		}
	}

	@Test
	public void ListWithOddNoOfElements() {
		ListNode questionHead = ListUtility.generateList(1, 2, 3, 4, 5);
		new ReorderList().reorderList(questionHead);
		ListUtility.printList(questionHead);
		ListNode answerHead = ListUtility.generateList(1, 5, 2, 4, 3);
		if (!ListUtility.compareList(questionHead, answerHead)) {
			fail("List is not unique it should be " + ListUtility.printList(answerHead) + "List found to be "
					+ ListUtility.printList(questionHead));
		}
	}

	@SuppressWarnings("unused")
	@Test
	public void NullList() {
		ListNode questionHead = null;
		new ReorderList().reorderList(questionHead);
		if (questionHead != null) {
			fail("this should be null");
		}
	}

	@Test
	public void ListWithSingleNode() {
		ListNode questionHead = ListUtility.generateList(1);
		new ReorderList().reorderList(questionHead);
		ListUtility.printList(questionHead);
		ListNode answerHead = ListUtility.generateList(1);
		if (!ListUtility.compareList(questionHead, answerHead)) {
			fail("List is not unique it should be " + ListUtility.printList(answerHead) + "List found to be "
					+ ListUtility.printList(questionHead));
		}
	}

	@Test
	public void ListWithDoubleNode() {
		ListNode questionHead = ListUtility.generateList(1, 2);
		new ReorderList().reorderList(questionHead);
		ListUtility.printList(questionHead);
		ListNode answerHead = ListUtility.generateList(1, 2);
		if (!ListUtility.compareList(questionHead, answerHead)) {
			fail("List is not unique it should be " + ListUtility.printList(answerHead) + "List found to be "
					+ ListUtility.printList(questionHead));
		}
	}

	@Test
	public void ListWithThreeNodes() {
		ListNode questionHead = ListUtility.generateList(1, 2, 3);
		new ReorderList().reorderList(questionHead);
		ListUtility.printList(questionHead);
		ListNode answerHead = ListUtility.generateList(1, 3, 2);
		if (!ListUtility.compareList(questionHead, answerHead)) {
			fail("List is not unique it should be " + ListUtility.printList(answerHead) + "List found to be "
					+ ListUtility.printList(questionHead));
		}
	}

	@Test
	public void ListWithFourNodes() {
		ListNode questionHead = ListUtility.generateList(1, 2, 3, 4);
		new ReorderList().reorderList(questionHead);
		ListUtility.printList(questionHead);
		ListNode answerHead = ListUtility.generateList(1, 4, 2, 3);
		if (!ListUtility.compareList(questionHead, answerHead)) {
			fail("List is not unique it should be " + ListUtility.printList(answerHead) + "List found to be "
					+ ListUtility.printList(questionHead));
		}
	}

}
