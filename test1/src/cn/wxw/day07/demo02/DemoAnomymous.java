package cn.wxw.day07.demo02;

import java.util.Scanner;

/**
 * Copyright (C), 2015-2019, 王先文
 * FileName: DemoAnomymous
 * Author:   Xianwen Wang
 * Email:w1244753906@gmail.com
 * Date:     2019/9/13 15:45
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
//匿名对象 只能使用唯一的一次

public class DemoAnomymous {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();

        //匿名对象使用
        int num=new Scanner(System.in).nextInt();
        System.out.println(num);



    }

//作为返回值
    public static Scanner getScanner()
    {
        //普通方式
//        Scanner sc = new Scanner(System.in);
//        return sc;

        //匿名对象作为返回值
        return new Scanner(System.in);
    }
}
