package com.it1.d1_static;

public class Student {
    private int name;


    /*
         静态成员方法: 用static修饰的方法,属于类,可以被共享访问,用类名或者对象名可以访问;
     */
    public static int getMax(int age1, int age2) {
        return age1 > age2 ? age1 : age2;
    }


    /*
        实例成员方法: 没有用static修饰的方法
     */
    public void study(){
        System.out.println(name);
    }



    public static void main(String[] args) {
        //1.类名.静态成员方法
        System.out.println(Student.getMax(1,2));
        // 注意:同一个类中,访问静态方法类名可以不用
        System.out.println(getMax(6,5));

    }
}
