package com.it1.d11_extends_constructor_有参构造器;

public class test {
    public static void main(String[] args) {
        //了解继承后子类如何访问父类的有参构造器
        Teacher t=new Teacher(18,"小米");
        System.out.println(t.getAge());
        System.out.println(t.getName());
    }
}
