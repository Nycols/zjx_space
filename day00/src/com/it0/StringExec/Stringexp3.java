package com.it0.StringExec;

import java.util.Scanner;

public class Stringexp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的手机号:");
        String num = sc.next();
        String before=num.substring(0,3);
        String after=num.substring(7);
        System.out.println(before+"xxx"+after);

    }
}
