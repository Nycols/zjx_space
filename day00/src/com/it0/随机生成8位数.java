package com.it0;

import java.util.Random;

public class 随机生成8位数 {
    public static void main(String[] args) {
        Random r=new Random();
        for (int i = 0; i <8 ; i++) {
            int a=r.nextInt(8);
            System.out.print(a);
        }

    }
}
