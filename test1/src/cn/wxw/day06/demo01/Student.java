package cn.wxw.day06.demo01;

/**
 * Copyright (C), 2015-2019, 王先文
 * FileName: Student
 * Author:   Xianwen Wang
 * Email:w1244753906@gmail.com
 * Date:     2019/9/13 15:16
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


public class Student {
    private String name;    //姓名
    private int age;        //年龄

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
