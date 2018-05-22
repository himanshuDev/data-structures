package com.ds.linkedList;

public class OddEvenLinkedListIndex {
	public ListNode oddEvenList(ListNode head) {
		if (head == null) {
			return head;
		}
		ListNode oddHead = null, evenHead = null, oddBkp = null, evenBkp = null, temp = head;
		int index = 0;
		while (temp != null) {
			if (index % 2 == 0) {
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
			index++;
		}

		if (evenBkp != null) {
			evenBkp.next = oddHead;
		}

		if (oddBkp != null) {
			oddBkp.next = null;
		}

		return evenHead;
	}
}
