package com.sean.dataStructure.lnearList;

import java.util.Arrays;

public class SeqList<T> {
    private Object[] elements; // 用于存储顺序表中的元素
    private int length; // 存储顺序表元素的个数

    public SeqList(int length) {
        elements = new Object[length];
        this.length = 0;
    }

    public SeqList() {
        this(64);
    }

    public SeqList(Object[] values) {
        // 初始化链表
        this(values.length);

        // 逐个将元素赋值给链表
        for (int i = 0; i < values.length; i++)
            elements[i] = values[i];

        this.length = elements.length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int size() {
        return length;
    }

    public T get(int index) {
        // 判断边界
        if (index >= 0 && index < length)
            return (T) elements[index];
        return null;
    }

    /**
     *
     * @param index 0 <= index > length
     * @param x
     */
    public void set(int index, T x) {
        if (x == null) // 如果输入的元素是null，抛出空指针异常
            throw new NullPointerException("x == null");

        // 判断位置索引
        if (index >= 0 && index < length)
            elements[index] = x;
        else
            throw new IndexOutOfBoundsException(index + "");
    }


    public int insert(int index, T x) {
        if (x == null) // 如果需要插入的元素是null，抛出空指针异常
            throw new NullPointerException("x == null");

        // index 容错
        if (index < 0)
            index = 0;
        if (index > length)
            index = length;


        if (elements.length == length) { // 若数组满，则申请一个两倍大的数组
            Object[] source = elements;
            elements = new Object[source.length * 2];
            System.arraycopy(source, 0, elements, 0, source.length);
        }

        for (int i = length; i > index; i--) {
            elements[i] = elements[i - 1];
        }

        elements[index] = x;
        length++;
        return index;
    }

    public int insert(T x) { // 默认在最后一个位置插入
        return insert(length, x);
    }

    public String toString() {
        String str = this.getClass().getName() + "("; // 获得类名
        return str + Arrays.toString(elements) + ")";
    }

    public T remove(int index) {
        if (length >  0 && index >= 0 && index < length) {
            T oldElement = (T) elements[index];
            for (int i = index; i < length - 1; i++)
                elements[i] = elements[i + 1];
            elements[length - 1] = null;
            length--;
            return oldElement;
        }
        return null;
    }

    public int search(T key) {
        if (key == null)
            throw new NullPointerException();

        for (int i = 0; i < length; i++)
            if (elements[i].equals(key))
                return i;

        return -1;
    }

    public boolean contain(T key) {
        return search(key) != -1;
    }

    public static void main(String[] args) {
        String[] values = {"A","B","C","D","E"};
        SeqList<String> list = new SeqList<>(values);
        list.insert(2, "g");
        System.out.println(list);
    }
}
