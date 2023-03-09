package com.it0.javabean;

public class test {
    public static void main(String[] args) {
        //1.无参数构造器创建对象封装一个用户信息
        User u1 = new User();
        u1.setName("小强");
        u1.setHeight(180.2);
        u1.setSalary(1000.0);
        System.out.println(u1.getName());
        System.out.println(u1.getHeight());
        System.out.println(u1.getSalary());

        //2.有参数构造器创建对象封装一个用户信息
        User u2 = new User("小明", 182.0, 1500);
        System.out.println(u2.getName());
        System.out.println(u2.getHeight());
        System.out.println(u2.getSalary());
    }
}
