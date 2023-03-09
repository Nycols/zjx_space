package com.it0.ArrayList;

import java.util.ArrayList;

// 定义一个电影类
public class demo3 {
    public static void main(String[] args) {
        //1.定义电影类,创建3个电影对象;
        Movie m1 = new Movie("长津湖", 9.1, "吴京");
        Movie m2 = new Movie("我和我的父辈", 9.2, "吴京");
        Movie m3 = new Movie("扑水少年", 8.6, "王川");
        //2.创建一个movies集合,存储movie对象
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(m1);
        movies.add(m2);
        movies.add(m3);
        System.out.println(movies);
        //3.遍历集合中的每个电影对象,访问他的信息;
        for (int i = 0; i < movies.size(); i++) {
            Movie m = movies.get(i);
            System.out.println("电影名称" + m.getName());
        }

    }
}
