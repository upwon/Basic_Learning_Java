package cn.wxw.day09.RedPocket;

import java.util.ArrayList;

/**
 * Copyright (C), 2015-2019, 王先文
 * FileName: MainRedPocket
 * Author:   Xianwen Wang
 * Email:w1244753906@gmail.com
 * Date:     2019/9/15 12:15
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


public class MainRedPocket {
    public static void main(String[] args) {
        Mange manger = new Mange("群主", 100);

        Member one = new Member("成员A", 0);
        Member two = new Member("成员B", 0);
        Member three = new Member("成员C", 0);

        manger.show();
        one.show();
        two.show();
        three.show();
        System.out.println("----------------------");
        // 群主总共发20块钱，分成3个红包

        ArrayList<Integer> redList=manger.send(20,3);
        // 三个普通成员收红包
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manger.show(); // 100-20=80
        // 6、6、8，随机分给三个人
        one.show();
        two.show();
        three.show();
        System.out.println("----------------------");

    }


}
