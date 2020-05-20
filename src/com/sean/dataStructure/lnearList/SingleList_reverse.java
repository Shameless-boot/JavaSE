package com.sean.dataStructure.lnearList;

public class SingleList_reverse {
    public static <T> SingleList<T> createReverse(T[] values) {
        return new SingleList<>(values);
    }

    public static<T> void reverse(SingleList<T> list) {
        Node<T> front = null;
        Node<T> current = list.head.next;
        Node<T> rear = null;

        while (current != null) {
            rear = current.next;
            current.next = front;
            front = current;
            current = rear;
        }

        list.head.next = front;
    }

    public static void main(String[] args) {
        String[] values = {"A", "B", "C", "D", "E"};
        SingleList<String> list = createReverse(values);
        System.out.println("Before reverse: " + list);
        reverse(list);
        System.out.println("After reverse: " + list);
    }
}
