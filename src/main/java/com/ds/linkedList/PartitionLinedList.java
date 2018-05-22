package com.ds.linkedList;

/**
 * 
 * Practice Data Structure problems.
 *
 */
public class PartitionLinedList {
	public ListNode partition(ListNode head, int x) {
		if (head == null) {
			return head;
		}

		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode anchorBack = this.findAnchorNode(dummy, x);
		ListNode anchor = anchorBack.next;

		// Single element linked list
		if (anchor == null) {
			return head;
		}
		ListNode movBack = anchor;
		ListNode mov = anchor.next;
		while (mov != null) {
			if (mov.val >= x) {
				movBack = mov;
				mov = mov.next;
			} else {
				anchorBack.next = mov;
				movBack.next = mov.next;
				mov.next = anchor;
				mov = movBack.next;
				anchorBack = anchorBack.next;
			}
		}
		return dummy.next;
	}

	private ListNode findAnchorNode(ListNode node, int x) {
		ListNode temp = node.next, back = node;
		while (temp != null && temp.val < x) {
			back = temp;
			temp = temp.next;
		}
		return back;
	}
}
