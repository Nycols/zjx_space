package com.it0.StringExec;

import java.util.Random;

// 利用字符串生成5位验证码
public class Stringexp1 {
    public static void main(String[] args) {
        //1.定义可能出现的字符信息
        String datas="qwertyuioplkjhgfdsazxcvbnm";
        //2.循环5次,每次生成一个随机索引,将对应索引的字符提取出来
        String code="";
        Random r=new Random();
        for (int i = 0; i <5; i++) {
            int s= r.nextInt(datas.length());
            char a=datas.charAt(s);
            code+=a;
        }
        System.out.println(code);

    }
}
