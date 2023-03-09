package com.it0.StringExec;

import java.util.Scanner;

// 模拟用户登录
public class Stringexp2 {
    public static void main(String[] args) {
        //1.定义一个正确的密码和用户名
        String okLoginName = "admin";   //存储在字符串资源池内
        String okLoginPass = "123456";
        //2.定义一个3次的循环
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入用户名:");
            String LoginName = sc.next();                   //存在堆内存内
            System.out.println("请输入密码:");
            String LoginPass = sc.next();
            //3.判断输入是否正确
            if (okLoginName.equals(LoginName)) {       //  xxx.equals(yyy)这个方法是用来比较两个字符串内容是否相等
                if (okLoginPass.equals(LoginPass)) {
                    System.out.println("输入成功");
                    break;
                }else {
                    System.out.println("密码输入错误,还剩余次数"+(3-i)+"次登录机会");
                }
            }else {
                System.out.println("用户名输入错误,还剩余次数"+(3-i)+"次登录机会");
            }

        }
    }
}
