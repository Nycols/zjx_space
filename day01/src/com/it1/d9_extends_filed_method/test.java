package com.it1.d9_extends_filed_method;

public class test {
    public static void main(String[] args) {
        //理解继承后成员访问特点
       Dog d=new Dog();
       d.run();  //先找子类的run
        d.showName();  //找到的局部名
    }
}
class Animal{
    public String name="动物名";
    public void run(){
        System.out.println("动物会跑");
    }
}
class Dog extends Animal{
    public String name="狗名";
    public void lookdoor(){
        System.out.println("狗看门");
    }

    public void showName() {
        String name="局部名";
        System.out.println(name);           //访问的是局部名
        System.out.println(this.name);      //访问当前子类的name
        System.out.println(super.name);     //访问父类的name

        run();        //访问的是 子类 的run
        super.run();  //访问的是 父类 的run
    }

    public void run() {
        System.out.println("跑的贼快");
    }
}

