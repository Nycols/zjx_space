package com.it1.d5_static_test_静态代码块测试;

import java.util.ArrayList;

public class test {
    /*
        1.定义一个静态结合,这样这个集合只加载 一个,当前房间只需要一副牌
     */
    public static ArrayList<String> cards=new ArrayList<>();

    /*
        2.在程序真正运行main方法前,把54张牌放进去,后续游戏就可以直接使用
     */
    static {
        //3.正式做牌,放到集合去
        // a.定义一个数组储存 全部点数,类型确定,个数确定了
        String[] size={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        // b.定义一个数组存储全部的花色
        String[] color={"♥","♠","♣","♦"};
        // c.遍历点数
        for (int i = 0; i < size.length; i++) {
            // d.遍历花色
            for (int j = 0; j < color.length; j++) {
                String card=size[i]+color[j];
                cards.add(card);
            }
        }
        // e.单独添加大小王
        cards.add("小ლ");
        cards.add("大ლ");
    }

    public static void main(String[] args) {
        System.out.println("新牌:"+cards);
    }
}
