package com.sean.leetcode;

/**
 * @author: Shaun
 * @create: 2020-05-06 22:42
 * @description: TODO
 */
public class Solution21 {
    static public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newList = new ListNode(-1);
        ListNode head = newList;
        while(l1 != null || l2 != null) {
            int left = l1 != null ? l1.val : Integer.MAX_VALUE;
            int right = l2 != null ? l2.val : Integer.MAX_VALUE;
            if (left <= right) {
                newList.next = l1;
                l1 = l1.next;
            }else {
                newList.next = l2;
                l2 = l2.next;
            }
            newList = newList.next;
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(4);
        // head.next.next.next = new ListNode(2);

        ListNode tail = new ListNode(1);
        tail.next = new ListNode(3);
        tail.next.next = new ListNode(4);

        System.out.println(mergeTwoLists(head, tail));
    }
}
