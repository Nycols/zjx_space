package com.it1.d1_static;

public class User {
//  在线人数
    //注意:static修饰的成员,静态成员变量,只在内存中有一份
    //静态成员变量
    public static int onlineNumber =161;

    //实例成员变量
    private String name;
    private int age;


    public static void main(String[] args) {
        //目标:理解tsatic修饰变量的作用以及访问特点
        //1.类名.静态成员变量.
        System.out.println(User.onlineNumber);   //类名访问静态成员变量

        User u=new User();                   //新建对象访问            #不推荐
        u.onlineNumber++;                    // 新来一个人
        System.out.println(u.onlineNumber);
        System.out.println(onlineNumber);         //注意:如果在同一个类中静态成员变量可以直接访问


        //2.对象名.实例成员变量.
        u.name="张三";
        u.age=18;
    }
}
