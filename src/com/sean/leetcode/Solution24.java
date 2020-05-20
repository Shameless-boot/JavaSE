package com.sean.leetcode;

/**
 * @author: Shaun
 * @create: 2020-05-06 23:03
 * @description: TODO
 */
public class Solution24 {
    static public ListNode swapPairs(ListNode head) {
        ListNode newList = new ListNode(-1), pHead = newList;

        while(head != null && head.next != null) {
            newList.next = new ListNode(head.next.val);
            newList = newList.next;
            newList.next = new ListNode(head.val);;
            newList = newList.next;

            head = head.next.next;
        }

        newList.next = head;

        return pHead.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        // head.next.next.next = new ListNode(4);

        swapPairs(head);
    }
}
