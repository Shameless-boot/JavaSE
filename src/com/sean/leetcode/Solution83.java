package com.sean.leetcode;

/**
 * @author: Shaun
 * @create: 2020-05-06 23:18
 * @description: TODO
 */
public class Solution83 {
    static public ListNode deleteDuplicates(ListNode head) {
        ListNode pHead = head;

        while(head != null && head.next != null) {
            ListNode temp = head.next;
            while(temp != null && (head.val == temp.val))
                temp = temp.next;

            head.next = temp;
            head = head.next;

        }

        return pHead;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        deleteDuplicates(head);
    }
}
