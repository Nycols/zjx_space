package com.it0.Demo1_面向对象;

import java.util.Scanner;

public class ShopCarTest {
    public static void main(String[] args) {
        Goods[] shopCar = new Goods[100];     //创建一个Goods类数组对象;
        while (true) {
            System.out.println("请输入操作:");
            System.out.println("添加商品:add");
            System.out.println("查询商品:query");
            System.out.println("更新购买数量:update");
            System.out.println("结算商品:pay");
            Scanner sc = new Scanner(System.in);
            System.out.println("输入你的命令:");
            String command = sc.next();
            switch (command) {
                case "add":
                    addGoods(shopCar, sc);
                    break;
                case "query":
                    queryGoods(shopCar);
                    break;
                case "update":
                    updateGoods(shopCar, sc);
                    break;
                case "pay":
                    payGoods(shopCar);
                    break;
                default:
                    System.out.println("没有改功能");
            }

        }
    }

    public static void payGoods(Goods[] shopCar) {
        queryGoods(shopCar);
        double money=0;
        for (int i = 0; i < shopCar.length; i++) {
            Goods g=shopCar[i];
            if (g!=null){
                money+=(g.price*g.buyNumber);
            }else {
                break;
            }
        }
        System.out.println("订单总金额:"+money);
    }

    public static Goods getGetGoodsById(Goods[] shopCar, int id) {
        //shopcar=[g1,g2,g3,null,null...]
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (g != null) {
                if (g.id == id) {
                    return g;
                }
            } else {
                return null;
            }
        }
        return null; //shopcar满了都没有目标id返回null
    }


    public static void updateGoods(Goods[] shopCar, Scanner sc) {
        while (true) {
            System.out.println("请你输入修改id:");
            int id=sc.nextInt();
            Goods g=getGetGoodsById(shopCar,id);
            if(g==null){
                System.out.println("没有购买该商品");
            }else {
                System.out.println("请输入"+g.name+"该商品数量:");
                int buyNumber=sc.nextInt();
                g.buyNumber=buyNumber;
                System.out.println("修改完成");
                queryGoods(shopCar);
                break;
            }
        }
    }

    public static void queryGoods(Goods[] shopCar) {
        System.out.println("=============查询信息如下===============");
        System.out.println("编号\t\t名称\t\t价格\t\t购买数量\t\t");
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (g != null) {
                System.out.println(g.id + "\t\t" + g.name + "\t\t" + g.price + "\t\t" + g.buyNumber);
            } else {
                break;
            }
        }
    }

    public static void addGoods(Goods[] shopCar, Scanner sc) {
//        1.录入用户输入商品信息
        System.out.println("请输入购买商品编号(不重复):");
        int id = sc.nextInt();
        System.out.println("输入购买商品名称:");
        String name = sc.next();
        System.out.println("请输入商品数量:");
        int buyNumber = sc.nextInt();
        System.out.println("请输入商品价格:");
        Double price = sc.nextDouble();
//        2.把购买商品信息封装成一个商品对象
        Goods g = new Goods();
        g.id = id;
        g.name = name;
        g.buyNumber = buyNumber;
        g.price = price;
//        3.将这个商品对象添加到购物车数组中去
        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] == null) {
                //说明此处没有元素存入,把我们的商品对象添加到此处
                shopCar[i] = g;
                break;  //结束了不用继续找位置了
            }
        }
        System.out.println("添加购物车完成");
    }
}
