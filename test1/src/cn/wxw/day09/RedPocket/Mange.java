package cn.wxw.day09.RedPocket;

import cn.wxw.day09.RedPocket.User;

import java.util.ArrayList;

/**
 * Copyright (C), 2015-2019, 王先文
 * FileName: Mange
 * Author:   Xianwen Wang
 * Email:w1244753906@gmail.com
 * Date:     2019/9/15 11:19
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


public class Mange extends User {
    public Mange(String name, int money) {
        super(name, money);
    }

    public Mange() {

    }

    public ArrayList<Integer> send(int totalMoney, int count) {
        // 首先需要一个集合，用来存储若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();

        // 首先看一下群主自己有多少钱
        int leftMoney = super.getMoney();
        if ( leftMoney<totalMoney) {
            System.out.println("余额不足");
            return redList; // 返回空集合
        }

        // 扣钱，其实就是重新设置余额
        super.setMoney(leftMoney - totalMoney);

        // 发红包需要平均拆分成为count份
        int avg=totalMoney/count;
        int mod=totalMoney%count;  // 余数，也就是甩下的零头

        // 除不开的零头，包在最后一个红包当中
        // 下面把红包一个一个放到集合当中
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }
        //最后一个红包
        int last=avg+mod;
        redList.add(last);

        return redList;

    }


}
