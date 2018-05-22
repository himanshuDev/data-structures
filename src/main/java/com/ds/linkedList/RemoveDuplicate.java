package com.ds.linkedList;

public class RemoveDuplicate {

	public ListNode deleteDuplicates(ListNode head) {
		if (head == null) {
			return head;
		}
		ListNode nHead = this.checkUnique(head);
		ListNode start = nHead;
		ListNode pHead = null;
		while (nHead != null && nHead.next != null) {
			pHead = checkUnique(nHead.next);
			nHead.next = pHead;
			nHead = nHead.next;
		}
		return start;
	}

	private ListNode checkUnique(ListNode head) {
		ListNode nHead = null;
		while (true) {
			if (nHead != null && nHead.val == head.val) {
				break;
			}
			if (nHead != null) {
				head = nHead;
			}
			nHead = getValidHead(head);
			if (nHead == null) {
				return nHead;
			}
		}
		return nHead;
	}

	private ListNode getValidHead(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		if (head.val != head.next.val) {
			return head;
		}
		while (head.val == head.next.val) {
			head = head.next;
			if (head.next == null) {
				return null;
			}
		}
		return head.next;
	}

}
