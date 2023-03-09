package com.it1.d4_static_code_静态代码块;

public class StaticDemo1 {
    public StaticDemo1(){
        System.out.println("无参构造器执行");
    }

    /*
        实例代码块,无static修饰,属于对象,每次构造对象时都会触发一次
     */
    {
        System.out.println("=====实例代码块执行======");
    }

    public static void main(String[] args) {
        StaticDemo1 staticDemo1=new StaticDemo1();
        StaticDemo1 staticDemo2=new StaticDemo1();

    }
}
