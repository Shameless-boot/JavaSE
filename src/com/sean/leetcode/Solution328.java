package com.sean.leetcode;

public class Solution328 {

    static public ListNode oddEvenList(ListNode head) {
        if (head == null)
            return null;

        ListNode odd = head, even = head.next;
        ListNode temp = even;
//        int cnt = 0;
//        if (size(head) % 2 == 0)
//            cnt = (int) Math.floor(size(head) / 2) - 1;
//        else
//            cnt = (int) Math.floor(size(head) / 2);
//
//        ListNode q = even;
//        while (cnt-- > 0) {
//            odd.next = odd.next.next;
//            even.next = even.next.next;
//            odd = odd.next;
//            even = even.next;
//        }
//        odd.next = q;

        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }

        odd.next = temp;

        return head;
    }

    static public ListNode findEndNode(ListNode head) {
        ListNode cur = head;
        while(cur.next != null)
            cur = cur.next;

        return cur;
    }

    static public int size(ListNode head) {
        ListNode pHead = head;
        int cnt = 0;
        while(pHead != null) {
            pHead = pHead.next;
            cnt++;
        }

        return cnt;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
        System.out.println(oddEvenList(head));
    }
}
