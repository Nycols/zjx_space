package com.it0;

import java.util.Random;
import java.util.Scanner;
//    随机排名
public class 随机交换 {

    public static void main(String[] args) {
//      1.创建一个数组对象(不带值),手动输入工号,循环依次将输入的工号传到数组内
        System.out.println("请输入5个工号:");
        int[] arr=new int[5];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i <arr.length ; i++) {
            int code=scan.nextInt();
            arr[i]=code;
        }
//      2.遍历数组中的每一个元素,然后随机出一个索引出来,让元素与随机索的位置进行交换
//       随机一个数  将原数组的下表与之交换
        Random r=new Random();
        for (int i = 0; i <arr.length ; i++) {
            int index=r.nextInt(arr.length);
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;

        }

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);

        }

    }
}
