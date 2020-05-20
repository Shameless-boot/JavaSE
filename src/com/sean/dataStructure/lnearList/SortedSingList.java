package com.sean.dataStructure.lnearList;

public class SortedSingList<T extends Comparable<T>> extends SingleList<T> {
    public SortedSingList() {
        super();
    }

    public SortedSingList(T[] values) {
        super();
        for (T value : values)
            insert(value);
    }

    public SortedSingList(SingleList<T> list) {
        super();
        Node<T> pHead = list.head.next;
        while (pHead != null) {
            insert(pHead.data);
            pHead = pHead.next;
        }
    }

    @Override
    public void set(int index, T newData) {
        throw new UnsupportedOperationException("set(int index, T newData)");
    }

    @Override
    public Node<T> insert(int index, T data) {
        throw new UnsupportedOperationException("insert(int index, T data");
    }

    @Override
    public Node<T> insert(T data) {
        Node<T> pHead = head, current = head.next;

        // 找到大于要插入数值的位置，在前一个元素后插入。
        // 插入元素的next为当前元素。
        while (current != null && data.compareTo(current.data) > 0) {
            pHead = current;
            current = current.next;
        }

        pHead.next = new Node<>(data, current);

        return pHead.next;
    }
}
