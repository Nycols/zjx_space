package com.it0.ATM_system;

public class Account {
    private String accountName;//用户名
    private String passWord; //密码
    private String cardNum; //卡号
    private double money; //余额
    private double quateMoney;// 取现额度

    public Account() {
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getQuateMoney() {
        return quateMoney;
    }

    public void setQuateMoney(double quateMoney) {
        this.quateMoney = quateMoney;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
