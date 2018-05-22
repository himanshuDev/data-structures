package com.ds.linkedList;

public class OddEvenList {
	public ListNode oddEvenList(ListNode head) {
		if (head == null) {
			return head;
		}
		ListNode oddHead = null, evenHead = null, oddBkp = null, evenBkp = null, temp = head;
		while (temp != null) {
			if (temp.val % 2 == 0) {
				if (evenHead == null) {
					evenHead = temp;
					evenBkp = temp;
				} else {
					evenBkp.next = temp;
					evenBkp = evenBkp.next;
				}
			} else {
				if (oddHead == null) {
					oddHead = temp;
					oddBkp = temp;
				} else {
					oddBkp.next = temp;
					oddBkp = oddBkp.next;
				}
			}
			temp = temp.next;
		}

		if (head.val % 2 == 0) {
			evenBkp.next = oddHead;
			head = evenHead;
			if (oddBkp != null) {
				oddBkp.next = null;
			}
		} else {
			oddBkp.next = evenHead;
			head = oddHead;
			if (evenBkp != null) {
				evenBkp.next = null;
			}
		}

		return head;
	}
}
