package cn.wxw.day09.RedPocket;

import java.util.ArrayList;
import java.util.Random;

/**
 * Copyright (C), 2015-2019, 王先文
 * FileName: Member
 * Author:   Xianwen Wang
 * Email:w1244753906@gmail.com
 * Date:     2019/9/15 11:36
 * Description: 普通群成员
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void  receive(ArrayList<Integer> list){
        // 从多个红包当中随便抽取一个，给我自己。
        // 随机获取一个集合当中的索引编号
        int index=new Random().nextInt(list.size());
        // 根据索引，从集合当中删除，并且得到被删除的红包，给我自己
        int delta=list.remove(index);

        // 当前成员自己本来有多少钱：

        int money=super.getMoney();

        // 加法，并且重新设置回去

        super.setMoney(money+delta);


    }
}
