package com.it0.javabean;

public class User {
//   1. 成员变量priva私有
    private double height;
    private String name;
    private double salary;


//  3.参加空构造器(有参数构造器是可选)
    public User(){

    }
    public User(String name,double height,double salary){
        this.height=height;
        this.name=name;
        this.salary=salary;
    }

//  2.提供成套的getter和setter方法
    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
