package com.sean.dataStructure.lnearList;

public class Josephus {
    // 顺序表
//    public Josephus(int number, int start, int distance) {
//        System.out.println("Josephus(" + number + "," + start + "," + distance + "),");
//        SeqList<String> list = new SeqList<>(number);
//        for (int i = 0; i < number; i++)
//            list.insert((char)('A' + i) + "");
//
//        int i = start;
//        while (list.size() > 1) {
//            i = (i + distance - 1) % list.size();
//            list.remove(i);
//        }
//        System.out.println(list.get(0));
//    }

    public Josephus(int number, int start, int distance) {
        System.out.println("Josephus("+number+","+start+","+distance+")");
        SingleList<Character> list = new SingleList<>();
        for (int i = 0; i < number; i++)
            list.insert((char)('A' + i));

        int num = start;
        while (list.size() > 1) {
            num =  (num + distance - 1) % list.size();
            System.out.println("删除"+ list.remove(num) + "");
            System.out.println(list);
        }

        System.out.println("被赦免的是" + list.get(0));
    }

    public static void main(String[] args) {
        new Josephus(5,0,2);
    }
}
