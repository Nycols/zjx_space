package com.it1.d12_this;

public class test {
    public static void main(String[] args) {
        //目标:理解this(***)的偶用,本类构造器中访问本类的兄弟构造器
        Student s1=new Student("小米","川大");
        System.out.println(s1.getName());
        System.out.println(s1.getSchoolName());

        Student s2=new Student("张三");  //默认
        System.out.println(s2.getName());
        System.out.println(s2.getSchoolName());
    }
}
