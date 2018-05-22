package com.ds.linkedList;

public class ReorderList {
	private ListNode reverse(ListNode node) {
		if (node == null) {
			return node;
		}
		ListNode prev = node, curr = node.next, next = null;
		if (curr == null) {
			return prev;
		} else {
			next = curr.next;
		}
		while (curr != null) {
			curr.next = prev;
			if (prev == node) {
				prev.next = null;
			}
			prev = curr;
			curr = next;
			if (curr != null) {
				next = curr.next;
			}
		}
		return prev;
	}

	public void reorderList(ListNode head) {
		if (head == null || head.next == null || head.next.next == null) {
			return;
		}
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		while (fastPtr.next != null && fastPtr.next.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		ListNode newHead = slowPtr.next;
		slowPtr.next = null;
		ListNode h2 = reverse(newHead);
		ListNode h1 = head;
		ListNode h1Nxt = null;
		ListNode h2Nxt = null;

		while (h1 != null && h2 != null) {
			h1Nxt = h1.next;
			h2Nxt = h2.next;
			h1.next = h2;
			h2.next = h1Nxt;
			h1 = h1Nxt;
			h2 = h2Nxt;
		}
	}

	public void reorderListWithRecursion(ListNode head) {
		if (head != null) {
			if (head.next == null || head.next.next == null) {
				return;
			}
			reorderListRecur(head, head);
		}
	}

	private ListNode reorderListRecur(ListNode start, ListNode node) {
		if (node.next == null) {
			ListNode returnNode = start.next;
			start.next = node;
			node.next = returnNode;
			return returnNode;
		} else {
			ListNode tHead = reorderListRecur(start, node.next);
			if (tHead == null) {
				return null;
			} else if (tHead == node) { // Odd List
				node.next = null;
				return null;
			} else if (tHead.next == node) { // Even List
				node.next = null;
				return null;
			} else {
				ListNode returnNode = tHead.next;
				tHead.next = node;
				node.next = returnNode;
				return returnNode;
			}
		}
	}
}
