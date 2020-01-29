package cn.wxw.day08.demo01;

/**
 * Copyright (C), 2015-2019, 王先文
 * FileName: Demo03SubString
 * Author:   Xianwen Wang
 * Email:w1244753906@gmail.com
 * Date:     2019/9/14 11:39
 * Description: 截取字符串
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


public class Demo03SubString {

    public static void main(String[] args) {
        String str1="helloworld";
        String str2=str1.substring(5);
        System.out.println(str1);
        System.out.println(str2);   //world

        char[] chars=str1.toCharArray();     //将此字符串转换为新的字符数组
        System.out.println(chars.length);     //10 字符数组的长度

        String repalce=str1.replace("world","WPRLD");   //world替换为WPRLD  变为helloWORLD
        System.out.println(repalce);
        String str3="aaa,bbb,ccc";
        String[] arr1=str3.split(",");    //将这个字符串拆分为给定的的匹配
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("----------------------");
        String str4="aaa bbb ccc";
        String[] arr2=str4.split(" ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr2[i]);
        }
        //如果有.就不行  split  必须使用"\\." 正则表达式


    }

}
