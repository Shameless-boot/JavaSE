package com.sean.dataStructure.lnearList;

public interface List<T> {
    // 判断线性表是否为空
    boolean isEmpty();

    // 返回线性表长度
    int size();

    // 返回线性表第i个元素
    T get(int i);

    // 设置线性表第i个元素为data
    void set(int i, T x);

    // 插入x为第i个元素，x != null，返回x序号
    int insert(int i, T x);

    // 在线性表末端插入元素x，返回x序号
    int insert(T x);

    // 删除线性表第i个元素，返回删除的元素
    T remove(int i);

    // 删除线性表中全部元素
    void clear();

    // 查找线性表中首次出现的与key相同的元素，返回元素序号
    int search(T key);

    // 判断是否包含关键字为key的元素
    boolean contains(T key);

    // 在当前线性表中添加list的所有元素。
    void addAll(List<T> list);
}
