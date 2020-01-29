package cn.wxw.day09.hongbao;

import java.util.ArrayList;

/**
 * Copyright (C), 2015-2020, 王先文
 * FileName: Manager
 * Author:   Xianwen Wang
 * Email:w1244753906@gmail.com
 * Date:     2020/1/28 16:22
 * Description: 群主
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


public class Manager extends User {

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {

        int leftmoney=super.getMoney();



        ArrayList<Integer> arrayList_result = new ArrayList<>();
        if(leftmoney<totalMoney)
        {
            System.out.println("余额不足");
            return arrayList_result;   //返回空集合
        }

        int result = totalMoney / count;
        int addition = totalMoney % count;

        //super.setMoney(leftmoney-totalMoney);
        Manager.super.setMoney(leftmoney-totalMoney);
        for (int i = 0; i < count - 1; i++) {
            arrayList_result.add(result);
        }

        //最后一个红包
        arrayList_result.add(result + addition);
        return arrayList_result;


    }
}