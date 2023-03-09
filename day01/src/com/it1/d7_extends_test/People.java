package com.it1.d7_extends_test;

public class People {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void queryCourse(){
        System.out.println(name+"在查看课表");
    }
}
