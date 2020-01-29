package cn.wxw.day08.demo01;

/**
 * Copyright (C), 2015-2019, 王先文
 * FileName: Demo01String
 * Author:   Xianwen Wang
 * Email:w1244753906@gmail.com
 * Date:     2019/9/13 20:12
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


public class Demo01String {


    public static void main(String[] args) {
        //String的常见构造方法3+1
        //public String()；     创建一个空白的字符串
        //public String(char[] array)
        String str = "hello";
        char data[] = {'a', 'b', 'c'};
        String str2 = new String(data);
        byte bytes[] = {97, 98, 99};
        String str3 = new String(bytes);

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str3.equals(str2));

        String str4 = str.concat(str2);
        System.out.println(str4);

        int index = str4.indexOf("llo");
        System.out.println(index);


        String str5 = str4.substring(4);    //4到尾
        System.out.println(str5);
        String str6 = str4.substring(4, 6);   //4到5  不包含6的
        System.out.println(str6);


    }


}

