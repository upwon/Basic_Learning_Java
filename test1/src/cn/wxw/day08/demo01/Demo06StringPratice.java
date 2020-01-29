package cn.wxw.day08.demo01;

/**
 * Copyright (C), 2015-2019, 王先文
 * FileName: Demo06StringPratice
 * Author:   Xianwen Wang
 * Email:w1244753906@gmail.com
 * Date:     2019/9/14 12:22
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


public class Demo06StringPratice {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
String result=fromArrayToString(arr1);
        System.out.println(result);

    }

    public static String fromArrayToString(int[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                str += "word" + arr[i] + "]";
            } else {
                str += "word" + arr[i] + "#";
            }

        }
        return str;
    }

}
