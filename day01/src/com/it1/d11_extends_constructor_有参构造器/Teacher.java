package com.it1.d11_extends_constructor_有参构造器;

public class Teacher extends People{
    //调用父类的有参数构造器
    public Teacher(int age,String name){
        //调用父类的有参数构造器,初始化继承父类的信息
        //需要手动调
        super(age, name);
    }
}
