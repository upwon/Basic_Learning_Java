package cn.wxw.day07.Demo03_Random;

import java.util.Random;

/**
 * Copyright (C), 2015-2019, 王先文
 * FileName: Demo03Random
 * Author:   Xianwen Wang
 * Email:w1244753906@gmail.com
 * Date:     2019/9/13 16:06
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


public class Demo03Random {
    public static void main(String[] args) {

        int reust=getRandom(10);
        System.out.println(reust);
    }
    public static int getRandom(int n)
    {
        Random random = new Random();
        int num=random.nextInt(n)+1;

        return num;
    }
}
