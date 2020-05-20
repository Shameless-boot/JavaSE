package com.sean.dataStructure.lnearList;

import java.util.ArrayList;
import java.util.LinkedList;

public class SingleList<T> {
    public Node<T> head;

    public SingleList() {
        head = new Node<>();
    }

    public SingleList(T[] values) {
        // 初始化head指针
        this();
        // 尾结点
        Node<T> rear = head;
        for (T value : values) { // 尾插入
            rear.next = new Node<>(value, null);
            rear = rear.next;
        }
    }

    public SingleList(SingleList<T> list) {
        this();

        Node<T> pHead = list.head.next;
        Node<T> rear = head;

        while (pHead != null) {
            rear.next = new Node<>(pHead.data, null);
            rear = rear.next;
            pHead = pHead.next;
        }
    }

    /**
     *
     * @param index 元素索引  0 <= index
     * @return 索引为index的元素
     */
    public T get(int index) {
        Node<T> pHead = this.head.next;
        for (int i = 0; i < index && pHead != null; i++)
            pHead = pHead.next;

        return (pHead != null && index >= 0) ? pHead.data : null;
    }

    public void set(int index, T newData) {
        Node<T> pHead = this.head.next;
        for (int i = 0; i < index && pHead != null; i++)
            pHead = pHead.next;

        if (index >= 0 && pHead != null)
            pHead.data = newData;
    }

    public int size() {
        Node<T> pHead = this.head.next;
        int cnt = 0;
        while (pHead != null) {
            cnt++;
            pHead = pHead.next;
        }

        return cnt;
    }

    /**
     * @param index 在索引为index后插入一个新节点
     * @param data 插入的数据
     * @return 将插入的节点返回
     */
    public Node<T> insert(int index, T data) {
        if (data == null)
            throw new NullPointerException("data == null");

        // 可能存在一个结点都没有，只有头结点。
        Node<T> pHead = this.head;
        // 对index进行容错，如果index < 0, 则插入在头结点之后，如果 > 链表长度, 插入在尾部
        for (int i = 0; i < index && pHead.next != null; i++)
            pHead = pHead.next;

        pHead.next = new Node<>(data, pHead.next);
        return pHead.next;
    }

    /**
     * 插入到链表尾部，index容错。
     * @param data 插入的数据
     * @return 将插入的节点返回
     */
    public Node<T> insert(T data) {
        return insert(Integer.MAX_VALUE, data);
    }

    /**
     *
     * @param index 删除元素的下标， 0<= i < n 。
     * @return 返回删除元素，若index越界返回null。
     */
    public T remove(int index) {

        Node<T> pHead = head;
        for (int i = 0; i < index && pHead.next != null; i++)
            pHead = pHead.next;

        if (index >= 0 && pHead != null) {
            T t = pHead.next.data;
            pHead.next = pHead.next.next;
            return t;
        }

        return null;
    }

    public void clear() {
        head.next = null;
    }

    public Node<T> search(T key) {
        Node<T> pHead = this.head.next;
        while (pHead != null && !pHead.data.equals(key))
            pHead = pHead.next;

        return pHead;
    }

    public boolean contains(T key) {
        return search(key) != null;
    }

    public Node<T> insertDifferent(T data) {
        return !contains(data) ? insert(data) : null;
    }

    @Override
    public String toString() {
        String str = this.getClass().getSimpleName() + "(";
        for (Node<T> pHead = this.head.next; pHead != null; pHead = pHead.next) {
            str += pHead.data.toString();
            if (pHead.next != null)
                str += ",";
        }
        return str + ")";
    }

    public void addAll(SingleList<T> list) {
        Node<T> pHead = this.head;

        while (pHead.next != null)
            pHead = pHead.next;

        pHead.next = list.head.next;
    }

    public static void main(String[] args) {
        SingleList<String> list = new SingleList<>(new String[]{"A","B","C","D","E",});
        SingleList<String> list1 = new SingleList<>(list);
        list.set(3,"GG");
        list1.set(2,"RR");
        System.out.println(list);
        System.out.println(list1);

        list.addAll(list1);
        System.out.println(list);

        int i = 0;
    }
}
