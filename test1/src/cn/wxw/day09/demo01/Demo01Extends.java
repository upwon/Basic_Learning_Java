package cn.wxw.day09.demo01;

/**
 * Copyright (C), 2015-2019, 王先文
 * FileName: Demo01Extends
 * Author:   Xianwen Wang
 * Email:w1244753906@gmail.com
 * Date:     2019/9/14 16:59
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


public class Demo01Extends {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.method();
        System.out.println(teacher.num);
      // System.out.println(super.num);
        teacher.method();
    }
}

