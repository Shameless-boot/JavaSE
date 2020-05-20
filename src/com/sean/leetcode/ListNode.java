package com.sean.leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                '}';
    }
}

class Solution implements Comparator<ListNode> {

    // 第一版
//    public static ListNode deleteDuplicates(ListNode head) {
//        if(head == null)
//            return head;
//        ListNode list = head;
//        while(list.next != null) {
//            while (list.val == list.next.val) {
//                if (list.next.next == null) {
//                    list.next = null;
//                    break;
//                } else
//                    list.next = list.next.next;
//            }
//            if (list.next != null)
//                list = list.next;
//        }
//        return head;
//    }


    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val)
                current.next = current.next.next;
            else
                current = current.next;
        }
        return head;
    }

    public static boolean isPalindrome(ListNode head) {
        // 找到要翻转尾部的指针
        ListNode midNode = findMidNode(head);

        // 翻转后半部分链表
        ListNode reverse = reverse(midNode);

        while (reverse != null) {
            if (head.val != reverse.val)
                return false;

            head = head.next;
            reverse = reverse.next;
        }

        return true;
    }

    public static ListNode findMidNode(ListNode head) {
        ListNode fast = head, slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public static ListNode reverse(ListNode list) {
        ListNode pre = null, cur = list, rear = null;

        while(cur != null) {
            rear = cur.next;
            cur.next = pre;
            pre = cur;
            cur = rear;
        }

        return pre;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(2);

        System.out.println(isPalindrome(null));
    }

    @Override
    public int compare(ListNode listNode, ListNode t1) {
        return listNode.val - t1.val;
    }
}
