package com.it1.d12_this;

public class Student {
    private String name;
    private String schoolName;

    public Student() {
    }

    /*
        如果学生不填写学校则默认这个对象为黑马
     */
    public Student(String name) {
        //借用本类兄弟构造器
        this(name,"科城");
    }

    public Student(String name, String schoolName) {
        //super();  必须先初始化父类,再初始化自己
        this.name = name;
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
