package cn.wxw.day07.Demo03_Random;

import java.util.Random;

/**
 * Copyright (C), 2015-2019, 王先文
 * FileName: DemoRandom
 * Author:   Xianwen Wang
 * Email:w1244753906@gmail.com
 * Date:     2019/9/13 15:58
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

//1.导包
//2.创建
//3.使用

public class DemoRandom {
    public static void main(String[] args) {
        Random r = new Random();
        int num=r.nextInt();
        System.out.println(num);
        Random r2 = new Random();
        int num2=r2.nextInt(10);
        System.out.println(num2);

    }


}
