package com.ds.linkedList;

public class ListUtility {

	public static ListNode generateList(Integer... integers) {
		if (integers == null) {
			return null;
		}
		if (integers.length == 1) {
			return new ListNode(integers[0]);
		}
		ListNode head = new ListNode(integers[0]);
		ListNode temp = head;
		for (int index = 1; index < integers.length; index++) {
			temp.next = new ListNode(integers[index]);
			temp = temp.next;
		}
		return head;
	}

	public static String printList(ListNode node) {
		if (node == null) {
			System.out.println("Null List");
		}
		System.out.println();
		while (node != null) {
			System.out.print(node.val);
			node = node.next;
			if (node != null) {
				System.out.print(" --> ");
			}
		}
		System.out.println();
		return "";
	}

	public static boolean compareList(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null) {
			return true;
		}
		if (l1 == null || l2 == null) {
			return false;
		}
		while (l1 != null && l2 != null) {
			if (l1.val == l2.val) {
				l1 = l1.next;
				l2 = l2.next;
			} else {
				return false;
			}
		}
		if (l1 == null && l2 == null) {
			return true;
		}
		return false;
	}

	public static void main(String... strings) {
		ListNode list = ListUtility.generateList(1, 1, 2, 2, 3, 4, 4, 6, 6, 7);
		ListUtility.printList(list);
	}
}
