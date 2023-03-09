package com.it1.d3_static_test_工具类测试;

public class ArrayUtils {
    private ArrayUtils(){

    }

    //重写一个toString的方法,使输出的数组为实际内容,不是地址
    public static String toString(int[] arr){
        //1. 校验
        if (arr==null){
            return null;
        }

        //2. 拼接内容并返回
        String result="[";
        for (int i = 0; i < arr.length; i++) {
            result+=(i== arr.length-1?arr[i]:arr[i]+",");
        }
        result+="]";
        return result;
    }



    //实现两数字相加的和是否于target相等 并返回索引
    public static int[] getnum(int[] num,int tar){
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if (num[i]+num[j]==tar){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
}
