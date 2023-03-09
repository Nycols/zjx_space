package com.it0.ArrayList;

public class Student {
    private String name;
    private String stuNumber;
    private int age;
    private String className;



    public Student() {
    }

    public Student(String name, String stuNumber, int age, String className) {
        this.name = name;
        this.stuNumber = stuNumber;
        this.age = age;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(String stuNumber) {
        this.stuNumber = stuNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
