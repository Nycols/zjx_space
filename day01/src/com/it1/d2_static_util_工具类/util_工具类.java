package com.it1.d2_static_util_工具类;

import java.util.Random;

public class util_工具类 {

    //因为工具类不用创建对象,所以将其私有化,这样外部就不能创建工具类的对象了
    private util_工具类(){

    }


    //静态方法
    public static String creatVerifyCode(int n){
        //1.定义一个变量记住验证码
        String code = "";
        //2.定义一个变量记住全部验证码字符
        String data = "QWERTYUIOPLKJHGFDSAZXCVBNMzxcvbnmlkjhgfdsaqwertyuiop0123456789";
        //3.使用循环生成几个随机索引,来索引data里的值
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int index = r.nextInt(data.length());
            code += data.charAt(index);
        }
        return code;
    }




}
