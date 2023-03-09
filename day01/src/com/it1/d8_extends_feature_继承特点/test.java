package com.it1.d8_extends_feature_继承特点;

public class test {
    public static void main(String[] args) {
        //目标:理解继承的特点
        //1.子类不能继承父类的构造器
        //2.子类不能继承父类的私有成员
        Tiger t=new Tiger();
        //t.eat;
        System.out.println(Animal.location);
    }

}
class Animal{
    private void eat(){
        System.out.println("吃东西");
    }

    public static String location="占陇动物园";
}
class Tiger extends Animal{

}
