package com.it1.d4_static_code_静态代码块;

public class StaticDemo {
    public static String schoolName;


    /*
    静态代码块,有static修饰,属于类,与类一起优先加载一次,自动触发一次
    作用:可以用于初始化静态资源
     */
    static {
        System.out.println("------静态方法执行了--------");
        schoolName="小米";           //直接优先加载
    }


    public static void main(String[] args) {
        //了解静态代码块
        System.out.println("--------main方法执行-----");
    }
}
