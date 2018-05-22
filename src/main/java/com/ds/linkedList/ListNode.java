package com.ds.linkedList;

public class ListNode {
	public int val;
	public ListNode next;

	public ListNode(int x) {
		val = x;
	}

	public ListNode(int x, ListNode next) {
		this(x);
		this.next = next;
	}
}
