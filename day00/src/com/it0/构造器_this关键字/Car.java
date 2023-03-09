package com.it0.构造器_this关键字;

public class Car {
    String name;
    double price;

    public Car() {
        System.out.println("这个是个无参数构造器"+this);
    }

    public Car(String n, double p) {
        System.out.println("这个是有参数构造器"+this);
        name = n;
        price = p;
    }
}
