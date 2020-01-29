package cn.wxw.day09.demo11;

/**
 * Copyright (C), 2015-2019, 王先文
 * FileName: DemoMain
 * Author:   Xianwen Wang
 * Email:w1244753906@gmail.com
 * Date:     2019/9/15 10:56
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


public class DemoMain {
    public static void main(String[] args) {
        //        Animal animal = new Animal(); // 错误写法！不能直接创建抽象类对象
        Cat cat = new Cat();
        cat.eat();
    }
}
