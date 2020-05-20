package com.sean.dataStructure.lnearList;

public class Student implements Comparable<Student>{

    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return this.score - student.score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
