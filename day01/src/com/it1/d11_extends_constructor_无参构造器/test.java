package com.it1.d11_extends_constructor_无参构造器;

public class test {
    public static void main(String[] args) {
        //认识继承后子类构造器的特点
        //特点:子类的全部构造器默认会先访问父类的无参构造器
        Dog dog=new Dog();
        System.out.println(dog);
        Dog dog1=new Dog("金毛");
        System.out.println(dog1);

    }
}
