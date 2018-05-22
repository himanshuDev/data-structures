package com.ds.linkedList;

import java.util.Stack;

public class AddTwoNumbers {

	private class Container {
		int carry;
		ListNode node;
	}

	private int len(ListNode node) {
		int ctr = 0;
		while (node != null) {
			node = node.next;
			ctr++;
		}
		return ctr;
	}

	private ListNode fedZeros(ListNode node, int count) {
		ListNode zeroHead = null;
		for (int i = 0; i < count; i++) {
			zeroHead = new ListNode(0);
			zeroHead.next = node;
			node = zeroHead;
		}
		return node;
	}

	private Container recursiveSum(ListNode lst1, ListNode lst2) {
		int tSum = lst1.val + lst2.val;
		ListNode sumNode = new ListNode(0);
		if (lst1.next != null) {
			Container rSum = recursiveSum(lst1.next, lst2.next);
			tSum = tSum + rSum.carry;
			sumNode.next = rSum.node;
		}
		int sum = tSum % 10;
		int carry = tSum / 10;
		sumNode.val = sum;
		Container cnt = new Container();
		cnt.carry = carry;
		cnt.node = sumNode;
		return cnt;
	}

	public ListNode addTwoNumbers(ListNode lst1, ListNode lst2) {
		int l1 = len(lst1);
		int l2 = len(lst2);
		if (l1 > l2) {
			lst2 = fedZeros(lst2, l1 - l2);
		} else if (l1 < l2) {
			lst1 = fedZeros(lst1, l2 - l1);
		}
		Container sumHead = recursiveSum(lst1, lst2);
		ListNode ansNode = sumHead.node;
		if (sumHead.carry > 0) {
			ansNode = new ListNode(sumHead.carry);
			ansNode.next = sumHead.node;
		}
		return ansNode;
	}

	public ListNode addTwoNumbersWithExtraSpace(ListNode l1, ListNode l2) {
		ListNode curr = null, sumNode = null, tL1 = l1, tL2 = l2;
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();

		while (tL1 != null) {
			s1.push(tL1.val);
			tL1 = tL1.next;
		}

		while (tL2 != null) {
			s2.push(tL2.val);
			tL2 = tL2.next;
		}

		int greaterSize = s1.size() > s2.size() ? s1.size() : s2.size();
		int s1v1 = 0, s2v2 = 0, carry = 0, tSum = 0, sum = 0, s1InitSize = s1.size(), s2InitSize = s2.size();
		for (int i = 0; (i < greaterSize || carry > 0); i++) {
			s1v1 = i < s1InitSize ? s1.pop() : 0;
			s2v2 = i < s2InitSize ? s2.pop() : 0;
			tSum = s1v1 + s2v2 + carry;
			sum = tSum % 10;
			carry = tSum / 10;
			sumNode = new ListNode(sum);
			if (curr != null) {
				sumNode.next = curr;
			}
			curr = sumNode;
		}
		return curr;
	}
}
