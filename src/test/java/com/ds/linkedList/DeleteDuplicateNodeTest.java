package com.ds.linkedList;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ds.linkedList.ListNode;
import com.ds.linkedList.ListUtility;
import com.ds.linkedList.RemoveDuplicate;

public class DeleteDuplicateNodeTest {

	@Test
	public void happyPath() {
		ListNode inputNode = ListUtility.generateList(1, 1, 2, 2, 3, 4, 4, 6, 6, 7);
		ListNode node = new RemoveDuplicate().deleteDuplicates(inputNode);
		ListNode ansNode = new ListNode(3, new ListNode(7));
		if (!ListUtility.compareList(ansNode, node)) {
			fail("List is not unique it should be " + ListUtility.printList(ansNode) + "List found to be "
					+ ListUtility.printList(node));
		}
	}

	@Test
	@SuppressWarnings("all")
	public void nullTest() {
		ListNode inputNode = ListUtility.generateList(null);
		ListNode node = new RemoveDuplicate().deleteDuplicates(inputNode);
		if (node != null) {
			fail("answer should be null");
		}
	}

	@Test
	public void sigleNodeTest() {
		ListNode inputNode = ListUtility.generateList(1);
		ListNode node = new RemoveDuplicate().deleteDuplicates(inputNode);
		ListNode ansNode = new ListNode(1);
		if (!ListUtility.compareList(node, ansNode)) {
			fail("List is not unique it should be " + ListUtility.printList(ansNode) + "List found to be "
					+ ListUtility.printList(node));
		}
	}

	@Test
	public void totalRepetionTest() {
		ListNode inputNode = ListUtility.generateList(1, 1, 1, 1, 1);
		ListNode node = new RemoveDuplicate().deleteDuplicates(inputNode);
		if (node != null) {
			fail("List should be null instead,List found to be" + ListUtility.printList(node));
		}
	}

	@Test
	public void totalRepetionWithOnly1UniqueNode() {
		ListNode inputNode = ListUtility.generateList(2, 1, 1, 1, 1, 1);
		ListNode node = new RemoveDuplicate().deleteDuplicates(inputNode);
		ListNode ansList = new ListNode(2);
		if (!ListUtility.compareList(node, ansList)) {
			fail("List is not unique it should be " + ListUtility.printList(ansList) + "List found to be "
					+ ListUtility.printList(node));
		}
	}
 
	@Test
	public void allDistinctTest() {
		ListNode inputNode = ListUtility.generateList(1, 2, 3, 4, 5, 6);
		ListNode node = new RemoveDuplicate().deleteDuplicates(inputNode);
		ListNode ansList = ListUtility.generateList(1, 2, 3, 4, 5, 6);
		if (!ListUtility.compareList(node, ansList)) {
			fail("List is not unique it should be " + ListUtility.printList(ansList) + "List found to be "
					+ ListUtility.printList(node));
		}
	}

}
