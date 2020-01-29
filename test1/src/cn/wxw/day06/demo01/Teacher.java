package cn.wxw.day06.demo01;

import java.security.PrivateKey;

/**
 * Copyright (C), 2015-2020, 王先文
 * FileName: Teacher
 * Author:   Xianwen Wang
 * Email:w1244753906@gmail.com
 * Date:     2020/1/19 19:04
 * Description: 教师类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


public class Teacher {
    private int age;
    private String name;
    public Teacher(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
