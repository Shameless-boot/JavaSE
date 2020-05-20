package com.sean.leetcode;

import java.util.Stack;

/**
 * @author: Shaun
 * @create: 2020-05-07 19:54
 * @description: TODO
 */
public class Solution445 {
    static public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        while(l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }

        while(l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }

        ListNode head = new ListNode(-1);
        int c = 0;
        while(!s1.isEmpty() || !s2.isEmpty()) {
            int a = !s1.isEmpty() ? s1.pop() : 0;
            int b = !s2.isEmpty() ? s2.pop() : 0;

            ListNode newNode = new ListNode((a + b) % 10 + c);
            c = a + b >= 10 ? 1 : 0;
            newNode.next = head.next;
            head.next = newNode;
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(7);
        head.next = new ListNode(2);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(3);

        ListNode tail = new ListNode(5);
        tail.next = new ListNode(6);
        tail.next.next = new ListNode(4);

        addTwoNumbers(head, tail);
    }
}
