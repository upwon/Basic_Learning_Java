package cn.wxw.day08.demo03;

/**
 * Copyright (C), 2015-2019, 王先文
 * FileName: Student
 * Author:   Xianwen Wang
 * Email:w1244753906@gmail.com
 * Date:     2019/9/14 15:25
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


public class Student {
    private String name;
    private  int age;
    private int isd;
    static String room;
    private static int idCounter=0;

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

    public int getIsd() {
        return isd;
    }

    public void setIsd(int isd) {
        this.isd = isd;
    }

    public static String getRoom() {
        return room;
    }

    public static void setRoom(String room) {
        Student.room = room;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.isd=++idCounter;
    }
    public  void show(){
        System.out.println(name+age+room+isd);
    }
}

