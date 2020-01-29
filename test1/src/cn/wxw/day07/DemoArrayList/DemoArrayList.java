package cn.wxw.day07.DemoArrayList;

import java.util.ArrayList;

/**
 * Copyright (C), 2015-2019, 王先文
 * FileName: DemoArrayList
 * Author:   Xianwen Wang
 * Email:w1244753906@gmail.com
 * Date:     2019/9/13 16:56
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 * <p>
 * <p>
 * 如果希望向集合ArrayList当中存储基本类型数据，必须使用基本类型对应的“包装类”。
 * <p>
 * 基本类型    包装类（引用类型，包装类都位于java.lang包下）
 * byte        Byte
 * short       Short
 * int         Integer     【特殊】
 * long        Long
 * float       Float
 * double      Double
 * char        Character   【特殊】
 * boolean     Boolean
 * <p>
 * 从JDK 1.5+开始，支持自动装箱、自动拆箱。
 * <p>
 * 自动装箱：基本类型 --> 包装类型
 * 自动拆箱：包装类型 --> 基本类型
 */


public class DemoArrayList {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        //  ArrayList<String> arrayList = new ArrayList<>();

        System.out.println(arrayList);
        arrayList.add("王先文");
        arrayList.add("wxw");
        System.out.println(arrayList);
        String name = arrayList.get(0);
        System.out.println(name);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
    }

}
