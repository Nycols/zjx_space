package com.it1.d10_extends_override_方法重写;

public class test {
    public static void main(String[] args) {
        //了解方法重写
        Newphone Pe = new Newphone();
        Pe.call();
        Pe.sentMsg();
    }
}

class Newphone extends Phone {
    @Override //  1.重写校验注释,加上它之后,这个方法必须是正确重写的,这样更加安全  2.提高代码可读性,代码优雅
    //注意:重写方法的名称和形参列表必须与被重写的名称一致
    public void call() {
        super.call(); //先用父类方法
        System.out.println("开始视频通话");
    }

    @Override
    public void sentMsg() {
        super.sentMsg();  //使用父类方法
        System.out.println("发送有趣图片");
    }
}

class Phone {
    public void call() {
        System.out.println("打电话");
    }

    public void sentMsg() {
        System.out.println("发短信");
    }
}
