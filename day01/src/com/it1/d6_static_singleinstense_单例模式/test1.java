package com.it1.d6_static_singleinstense_单例模式;

public class test1 {
    public static void main(String[] args) {
        //理解懒汉单例的设计
        SingleInsetense1 s1 = SingleInsetense1.getInsetense1();
        SingleInsetense1 s2 = SingleInsetense1.getInsetense1();
        System.out.println(s1);
        System.out.println(s2);
    }
}
