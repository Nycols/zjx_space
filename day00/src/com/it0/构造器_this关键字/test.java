package com.it0.构造器_this关键字;

public class test {
    public static void main(String[] args) {

        //        调用构造器得到的对象
        Car c = new Car();
        c.name = "宝马";
        c.price = 38.7;
        System.out.println(c.name);
        System.out.println(c.price);

        //        调用有参数构造器
        Car c2 = new Car("奔驰", 38.8);
        System.out.println(c2.name);
        System.out.println(c2.price);
    }
}
