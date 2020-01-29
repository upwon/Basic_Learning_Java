package cn.wxw.day09.demo02;

/**
 * Copyright (C), 2015-2019, 王先文
 * FileName: NewPhone
 * Author:   Xianwen Wang
 * Email:w1244753906@gmail.com
 * Date:     2019/9/15 10:25
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


public class NewPhone extends Phone{

    @Override      //表示一个方法声明打算重写超类中的另一个方法声明。如果方法利用此注释类型进行注解但没有重写超类方法，则编译器会生成一条错误消息
    public void show(){
        super.show();
        System.out.println("头像");
    }


    public static void main(String[] args) {
        NewPhone newPhone = new NewPhone();
        newPhone.show();
    }
}
