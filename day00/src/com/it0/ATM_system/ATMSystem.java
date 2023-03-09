package com.it0.ATM_system;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        //1.创建集合对象,存入对象信息
        ArrayList<Account> accounts = new ArrayList<>();  //定义一个账户类
        Scanner sc = new Scanner(System.in);
        //2.展示页面
        while (true) {
            System.out.println("=====欢迎进入ATM系统=======");
            System.out.println("1.登录账户");
            System.out.println("2.注册账户");
            System.out.println("请选择你的操作:");
            int commond = sc.nextInt();
            switch (commond) {
                case 1:
                    //用户登录
                    login();
                    break;
                case 2:
                    //用户开户
                    resignter(accounts, sc);  //  (ALT+回车)快捷生成方法
                    break;
                default:
                    System.out.println("输入指令不存在");
            }
        }
    }

    private static void login() {

    }


    /**
     * 用户开户功能实现
     *
     * @param accounts
     * @param sc      扫描器
     * @return
     */
    private static void resignter(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("=======系统开户操作========");
        //1.创建一个Account对象
        Account account = new Account();
        //2.录入账户信息,注入到账户对象中
        System.out.println("请输入用户名:");     //设置账户名
        String name = sc.next();
        account.setAccountName(name);

        while (true) {
            System.out.println("请输入密码:");    //设置账户密码
            String password = sc.next();
            System.out.println("请确定密码:");
            String okpassword = sc.next();
            if (okpassword.equals(password)) {    //判断密码
                System.out.println("注册成功");
                account.setPassWord(password);
                break;
            } else {
                System.out.println("两次密码输入不同,请重新确认");
            }
        }

        System.out.println("请你输入当次限额");  //设置限额
        double quoteMoney = sc.nextDouble();
        account.setQuateMoney(quoteMoney);

        String cardID = getRandomNum(accounts);   //生成8位卡号的方法
        account.setCardNum(cardID);

        //3.将这个Account对象存入到accounts对象集合里去
        accounts.add(account);
        System.out.println("恭喜"+name+"先生/女士,您开户成功!"+"卡号:"+cardID);
    }

    private static String getRandomNum(ArrayList<Account> accounts) {  //生成卡号方法
        Random r = new Random();
        while (true) {
            //1.生成的8位数字
            String cardID = "";
            for (int i = 0; i < 8; i++) {
                cardID += r.nextInt(8);
            }

            //2.判断生成的数字与其他账户中不多重复
            //  根据这个卡号来查询是否重复
            Account ac = getAcountByCardID(cardID, accounts);   //调用判断卡号重复的方法
            if (ac == null) {
                //说明cardID没有重复
                return cardID;
            }
        }

    }





    /**
     * 根据卡号查询出一个账户对象出来
     *
     * @param cardId   卡号
     * @param accounts 对象集合
     * @return 账户对象 | null
     */
    private static Account getAcountByCardID(String cardId, ArrayList<Account> accounts) {
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);   //集合get方法,获取当前对象的索引
            if (acc.getCardNum().equals(cardId)) {
                return acc;   //返回重复的卡号对象
            }
        }
        return null;  //查无此账户
    }
}
