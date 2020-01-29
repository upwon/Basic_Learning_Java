package cn.wxw.day09.hongbao;

/**
 * Copyright (C), 2015-2020, 王先文
 * FileName: User
 * Author:   Xianwen Wang
 * Email:w1244753906@gmail.com
 * Date:     2020/1/28 16:08
 * Description: 基类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


public class User {
    private String name;
    private int money;

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

    public void show(){

        System.out.println("我叫"+name+"我有钱"+money);
    }
}
