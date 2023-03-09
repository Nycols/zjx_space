package com.it1.d11_extends_constructor_无参构造器;

public class Dog extends Animal {
    public Dog(){
        super();  //写不写都有,它是默认找父类的无参构造器执行
        System.out.println("子类的无参构造器");
    }
    public Dog(String name){
        System.out.println("子类的有参构造器 name");
    }
}
