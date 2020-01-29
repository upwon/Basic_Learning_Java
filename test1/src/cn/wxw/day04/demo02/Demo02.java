package cn.wxw.day04.demo02;

/**
 * Copyright (C), 2015-2019, 王先文
 * FileName: Demo02
 * Author:   Xianwen Wang
 * Email:w1244753906@gmail.com
 * Date:     2019/9/13 11:57
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


public class Demo02 {
    public static void main(String[] args) {
       print();
    }

    public static void print() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("*");

            }
            System.out.println("\n");

        }
    }
}
