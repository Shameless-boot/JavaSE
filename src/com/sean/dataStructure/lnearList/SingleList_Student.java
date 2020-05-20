package com.sean.dataStructure.lnearList;

import java.util.Arrays;

public class SingleList_Student {

    public static int[] groupCount(SingleList<Student> students, int grade[]) {
        int[] result = new int[grade.length];
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            int score = student.getScore();
            for (int j = 0; j < grade.length - 1; j++)
                if (score >= grade[j] && score < grade[j + 1]) {
                    result[j]++;
                    break;
                }
        }
        return result;
    }

    public static void printCount(SingleList<Student> students, String[] titles, int result[]) {
        System.out.println("学生集合：" + students + "\n共" + students.size() + "人，成绩统计：");
        for (int i = 0; i < titles.length; i++)
            System.out.print(titles[i] + result[i] + "人，");

        System.out.println();
    }

    public static void main(String[] args) {
        Student[] group = {new Student("王小红",85), new Student("张明",75),
                            new Student("李强",90), new Student("崔小兵",80),
                            new Student("陈新诺",60), new Student("吴宁",65)};

        SingleList<Student> list = new SingleList<>(group);
        list.insert(new Student("崔小兵", 70));
        int[] grade = {0, 60, 70, 80, 90, 100};
        String[] titles = {"不及格","及格","中等","良好","优秀"};
        int[] result = groupCount(list,grade);
        printCount(list,titles,result);
        String name = "崔小兵";
        Student key = new Student(name, 70);
        System.out.println(name + "的成绩是：" + list.search(key));
    }
}
