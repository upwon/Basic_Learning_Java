package cn.wxw.day09.hongbao;

import java.util.ArrayList;

/**
 * Copyright (C), 2015-2020, 王先文
 * FileName: main_RedPocket
 * Author:   Xianwen Wang
 * Email:w1244753906@gmail.com
 * Date:     2020/1/29 18:24
 * Description: 具体实现的调用
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


public class main_RedPocket {

    public static void main(String[] args) {

        Manager manager=new Manager("luck",21);
        Member member1=new Member("member1",1);
        Member member2=new Member("member2",2);
        Member member3=new Member("member3",3);
        Member member4=new Member("member4",4);


        manager.show();
        member1.show();
        member2.show();
        member3.show();
        member4.show();

        System.out.println("----------------------------");

        //群主共发21元  4个红包
        ArrayList<Integer> arrayList=manager.send(21,4);

        //群成员收红包
        member1.receive(arrayList);
        member2.receive(arrayList);
        member3.receive(arrayList);
        member4.receive(arrayList);


        manager.show();
        member1.show();
        member2.show();
        member3.show();
        member4.show();


























    }



}
