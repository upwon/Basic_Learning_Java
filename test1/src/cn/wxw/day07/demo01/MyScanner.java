package cn.wxw.day07.demo01;



import java.util.Scanner;

/**
 * Copyright (C), 2015-2019, 王先文
 * FileName: Scanner
 * Author:   Xianwen Wang
 * Email:w1244753906@gmail.com
 * Date:     2019/9/13 15:28
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 * <p>
 * Scanner
 * 1.导入包 import 包路径.类名称
 * jiva.lang下的包可以不导入
 * 2创建
 * 类名称 对象名=new 类名称（）
 * 3.使用
 * 对象名.方法名
 */


public class MyScanner {

    public static void main(String[] args) {
        //2.创建
        //System.in代表从键盘输入
        Scanner sc = new Scanner(System.in);
        //获取键盘输入的int数字


        int num = sc.nextInt();
        System.out.println("输入的数字是"+ num);

        String str=sc.next();

        System.out.println("输入的字符串是"+ str);

        double dou=sc.nextDouble();
        System.out.println("输入的double是"+dou);

    }

}
