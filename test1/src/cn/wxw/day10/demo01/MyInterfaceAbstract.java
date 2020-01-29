package cn.wxw.day10.demo01;

/**
 * Copyright (C), 2015-2019, 王先文
 * FileName: MyInterfaceAbstract
 * Author:   Xianwen Wang
 * Email:w1244753906@gmail.com
 * Date:     2019/9/15 16:08
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


public interface MyInterfaceAbstract {
    public abstract void methodAbs();   //接口中的抽象方法

    public void methodAbs2();   //这也是抽象方法

    abstract  void methodAbs3();    //
    void methodABs4();  //


    //java 8 开始允许定义默认方法 静态方法
    public default void methodDefault(){
        System.out.println("这是新添加的默认方法");
        methodPrivate();
    }

    public static void methodStatic()
    {
        System.out.println("这是静态方法");


    }

    // java9开始 允许定义私有方法
    private void methodPrivate(){
        System.out.println("AAAAAAA");
    }
    //接口中的常量  必须进行赋值 可以省略public static final
    public static final int NUM=10;
}
