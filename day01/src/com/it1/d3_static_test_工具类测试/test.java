package com.it1.d3_static_test_工具类测试;

public class test {
    public static void main(String[] args) {
        int[] arr=null;
        int[] arr1={};
        int[] arr2={12,23,44,99};

        int[] a={2,7,11,15};

        System.out.println(ArrayUtils.toString(arr1));
        System.out.println(ArrayUtils.toString(ArrayUtils.getnum(a,9)));
    }
}
