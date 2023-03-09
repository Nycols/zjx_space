package com.it1.d6_static_singleinstense_单例模式;
/*
    懒汉单例:
        1.创建一个私有构造器
        2.定义一个静态成员变 只加载一次,只有一份
        3.定义一个方法,对外返回单例对象
 */
public class SingleInsetense1 {
    //  注意:这里最好私有化private,可以避免在外部直接获取 insetense1 为null
    private static SingleInsetense1 insetense1;      //设置一个类型为SingleInsetense1的对象名insetense1;但没分配内存
    private SingleInsetense1(){}
    public static SingleInsetense1 getInsetense1(){
        if (insetense1==null){
            //第一次来拿对象,此时要创建对象
            insetense1=new SingleInsetense1();
        }
        return insetense1;
    }
}
