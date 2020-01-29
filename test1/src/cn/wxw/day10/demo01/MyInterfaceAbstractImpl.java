package cn.wxw.day10.demo01;

/**
 * Copyright (C), 2015-2019, 王先文
 * FileName: MyInterfaceAbstractImpl
 * Author:   Xianwen Wang
 * Email:w1244753906@gmail.com
 * Date:     2019/9/15 16:12
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


public class MyInterfaceAbstractImpl implements MyInterfaceAbstract {
    @Override
    public void methodAbs() {
        System.out.println("这是第一个方法");

    }

    @Override
    public void methodAbs2() {
        System.out.println("这是第二个方法");

    }

    @Override
    public void methodAbs3() {
        System.out.println("这是第三个方法");

    }

    @Override
    public void methodABs4() {
        System.out.println("这是第四个方法");

    }

    public static void main(String[] args) {
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
        impl.methodAbs();
        impl.methodAbs2();

        impl.methodDefault();

        System.out.println(MyInterfaceAbstract.NUM);   //访问常量

    }
}
