package com.it0.ArrayList;

import java.util.ArrayList;

public class demo2 {
    public static void main(String[] args) {
        ArrayList<Double> score = new ArrayList<>();
        score.add(98.0);
        score.add(77.0);
        score.add(66.0);
        score.add(89.0);
        score.add(50.0);
        score.add(100.0);
        System.out.println(score);
        //正向遍历数组
        for (int i = 0; i < score.size(); i++) {
            if (score.get(i) < 80.0) {
                score.remove(i);            //Arraylist的大小是改变的,删除一个后,后面的数据会向上顶替
                i--;                        //要退一步,确保下次能回到这个位置,如此不会跳过数据
            }
        }
        System.out.println(score);

        //逆向遍历数组 (不用设置i--)
        for (int i = score.size(); i >= 0; i--) {
            if (score.get(i) < 80.0) {
                score.remove(i);
            }
        }
    }
}