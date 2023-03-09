package com.it0.ArrayList;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

// 学生基础信息数据搜索
// 1.定义一个Arraylist集合,存储学生对象,遍历展示出来
// 2.提供一个方法,可以接受Arraylist集合,返回搜索到的学生对象
// 3.使用死循环,让客户不停搜索
public class demo4 {
    // 1. 定义学生对象
    // 2.创建集合,将对象添加
    public static void main(String[] args) {
        Student s1 = new Student("小明", "20201", 18, "一班");
        Student s2 = new Student("小刚", "20202", 19, "二班");
        Student s3 = new Student("小红", "20203", 21, "上班");
        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        // 3.遍历学生对象展示
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println("名字:" + s.getName() + "\t学号:" + s.getStuNumber() + "\t年龄:" + s.getAge() + "\t班级" + s.getClassName());
        }


        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("输入学号查询学生:");
            String studyNumbr=sc.next();
            //5.调用方法查找
            Student s=getStudentId(students,studyNumbr);
            //6.判断方法返回的是否是学生对象
            if (s==null){
                System.out.println("没有找到对应学号");
            }else {
                System.out.println("你查询的学生信息如下:");
                System.out.println("名字:" + s.getName() + "\t学号:" + s.getStuNumber() + "\t年龄:" + s.getAge() + "\t班级" + s.getClassName());
            }
        }
    }



    // 4.定义方法,完成学号搜索功能
    /**
     * 根据学生的学号查询学生对象返回
     *
     * @param students 存储全部学生对象集合
     * @param number   搜索的学生的学号
     * @return 学生对象 / null
     */
    public static Student getStudentId(ArrayList<Student> students, String number) {
        //1.遍历全部的学生对象
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            //询问当前遍历的学生学号是否是目标学号
            if (s.getStuNumber().equals(number)) {
                //这个s代表的学生对象的学号就是目标学号
                return s;
            }
        }
        //查无此人
        return null;

    }
}
