package com.it1.d6_static_singleinstense_单例模式;
/*
    使用饿汉单例实现单例类
        -1.构造器私有(外部就不能构造对象)
        -2.饿汉单例在获取对象时,提前准备好对象了
                创建一个对象
 */
public class SingleInsetense {
    public static SingleInsetense insetense=new SingleInsetense();
    private SingleInsetense(){}

}
