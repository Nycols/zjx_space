package com.it0.Demo_面向对象;

public class test {
    public static void main(String[] args) {
        //1.设计电影类
        //2.创建3个电影对象,封装电影信息
        Movie m1=new Movie("长津湖",9.1,"吴京");
        Movie m2=new Movie("我和我的父辈",9.2,"吴京");
        Movie m3=new Movie("扑水少年",8.6,"王川");
        //3.定义一个电影数组,存储3部电影对象
        Movie[] movies=new Movie[3];
        movies[0]=m1;  //movies[0]=new Movie("长津湖",9.1,"吴京");  这样写也行
        movies[1]=m2;
        movies[2]=m3;
        //4.遍历数组中的每个电影对象,然后获取它的信息展示出来
        for (int i = 0; i < movies.length; i++) {
            Movie m=movies[i];  //跟 int a=arr[0]一样,该数组里面的0号是int类型的数字,所以可以用自变量int类型m接收
            System.out.println("电影名称:"+m.getName()+"\t评分:"+m.getScore()+"\t主演:"+m.getActor());
            System.out.println("---------------------------------");
        }

    }
}
