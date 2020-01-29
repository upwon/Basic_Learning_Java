package cn.wxw.day08.demo04;

import java.util.Arrays;

/**
 * Copyright (C), 2015-2019, 王先文
 * FileName: Demo01Arrays
 * Author:   Xianwen Wang
 * Email:w1244753906@gmail.com
 * Date:     2019/9/14 16:33
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


public class Demo01Arrays {
    public static void main(String[] args) {
        int[] intArrays={10,20,1,8,5,30,40};
        System.out.println(intArrays);
        String intStr= Arrays.toString(intArrays);
        System.out.println(intStr);

        Arrays.sort(intArrays);
        System.out.println(Arrays.toString(intArrays));

        System.out.println("-------------------");
        String line="xhuebaachhne";
        char[] chars = line.toCharArray();
        Arrays.sort(chars);
        for (int length = chars.length; length > 0; length--) {
            System.out.print(chars[length-1]+" ");
        }
        for (int i = 0; i < chars.length; i++) {

        }
    }

}
