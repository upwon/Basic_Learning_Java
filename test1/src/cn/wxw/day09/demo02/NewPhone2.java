package cn.wxw.day09.demo02;

/**
 * Copyright (C), 2015-2020, 王先文
 * FileName: NewPhone2
 * Author:   Xianwen Wang
 * Email:w1244753906@gmail.com
 * Date:     2020/1/22 15:56
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


public class NewPhone2 extends Phone{
    public void show() {
        super.show();
        System.out.println("视频");
    }

    public static void main(String[] args) {
        NewPhone2 newPhone2=new NewPhone2();
        newPhone2.show();
    }
}

