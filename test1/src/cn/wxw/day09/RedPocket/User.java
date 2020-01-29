package cn.wxw.day09.RedPocket;

/**
 * Copyright (C), 2015-2019, 王先文
 * FileName: demo14
 * Author:   Xianwen Wang
 * Email:w1244753906@gmail.com
 * Date:     2019/9/15 11:16
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


public class User {
    private String name;    //姓名
    private int money;  //余额

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public User() {
    }

    public void show(){
        System.out.println("我叫"+name+" 我有钱"+money);
    }
}
