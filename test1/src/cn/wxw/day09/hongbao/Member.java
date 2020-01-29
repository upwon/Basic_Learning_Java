package cn.wxw.day09.hongbao;

import java.util.ArrayList;
import java.util.Random;

/**
 * Copyright (C), 2015-2020, 王先文
 * FileName: Member
 * Author:   Xianwen Wang
 * Email:w1244753906@gmail.com
 * Date:     2020/1/29 17:46
 * Description: 群成员
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


public class Member extends Manager {
    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> arrayList){

        //随机获取一个红包
        Random random=new Random();


        int index=random.nextInt(arrayList.size());

        //获取红包 并从集合中删除该红包
        int delta=arrayList.remove(index);

        //获取已有钱
        int money=Member.super.getMoney();

        //将获取的红包存进去
        super.setMoney(delta+money);


    }

}
