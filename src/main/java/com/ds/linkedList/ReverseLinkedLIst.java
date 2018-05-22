package com.ds.linkedList;

public class ReverseLinkedLIst {
	public ListNode reverse(ListNode node) {
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
}
