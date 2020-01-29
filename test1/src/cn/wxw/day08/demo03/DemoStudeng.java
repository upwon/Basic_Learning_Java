package cn.wxw.day08.demo03;

/**
 * Copyright (C), 2015-2019, 王先文
 * FileName: DemoStudeng
 * Author:   Xianwen Wang
 * Email:w1244753906@gmail.com
 * Date:     2019/9/14 15:33
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


public class DemoStudeng {
    public static void main(String[] args) {

        Student one1 = new Student("张三", 22);
        Student two1 = new Student("李四", 23);
        Student three1 = new Student("wangwu", 18);

        one1.setRoom("西电1班");
        one1.show();
        two1.show();
        three1.show();


        Myclass pbj=new Myclass();
        pbj.method();


        Myclass.methodStatic(); //推荐  不创建对象 直接使用类名称访问

    }
}
