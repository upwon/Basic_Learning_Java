package cn.wxw.day09.demo01;

/**
 * Copyright (C), 2015-2019, 王先文
 * FileName: Teacher
 * Author:   Xianwen Wang
 * Email:w1244753906@gmail.com
 * Date:     2019/9/14 17:03
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

// 派生类
public class Teacher extends Employee {
    int num = 20;

    @Override
    public  void method() {
        System.out.println("基类方法执行-teacher");
        super.method();
    }
}