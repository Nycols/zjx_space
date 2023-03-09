package com.it1.d6_static_singleinstense_单例模式;

public class test {
    public static void main(String[] args) {
        //目标:理解饿汉单例设计步骤

        //将对象insetense赋给s1
        SingleInsetense s1=SingleInsetense.insetense;
        SingleInsetense s2=SingleInsetense.insetense;
        System.out.println(s1==s2);
    }
}
