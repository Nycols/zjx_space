package com.it0.ArrayList;

import java.util.ArrayList;

public class demo1 {
    public static void main(String[] args) {
        //1.创建list集合
        ArrayList<String> list=new ArrayList();
        //ArrayList<String> list=new ArrayList<String>()  =后面的<String>可以不写

        //2.添加数据
        list.add("java");
        list.add("大哥");
        list.add("小弟");

        //3.获取数据
        String n=list.get(0);  //获取下表为0的元素

        //4.获取集合的大小
        int a=list.size();

        //5.完成遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //6.删除具体索引,并返回删除的元素
        System.out.println(list);
        String e=list.remove(1);
        System.out.println(e);   //这个是删除的那个元素e
        System.out.println(list);

        System.out.println(list.remove("java"));   //返回的是true

        //7.修改某个索引元素的值
        String w=list.set(0,"华为");

    }
}
