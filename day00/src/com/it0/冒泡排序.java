package com.it0;

public class 冒泡排序 {
    public static void main(String[] args) {
        int[] r={3,1,5,2,9,3};
        for(int i=1; i<=r.length-1;i++){
//            第一个循环是重复的轮数
//            i==1 要循环三次  j是从数组的0 1 2 3位
            for (int j = 0; j <= r.length-i-1; j++) {
                if(r[j]>r[j+1]){
                    int temp=r[j+1];
                    r[j+1]=r[j];
                    r[j]=temp;
                }
            }
        }
        System.out.println("从小到大排序的后果:");
        for (int i = 0; i <r.length ; i++) {
            int a=r[i];
            System.out.print(a);
        }
    }


}

