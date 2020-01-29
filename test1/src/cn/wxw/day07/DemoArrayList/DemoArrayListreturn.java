package cn.wxw.day07.DemoArrayList;

import java.util.ArrayList;
import java.util.Random;

/**
 * Copyright (C), 2015-2019, 王先文
 * FileName: DemoArrayListreturn
 * Author:   Xianwen Wang
 * Email:w1244753906@gmail.com
 * Date:     2019/9/13 17:42
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


public class DemoArrayListreturn {

    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();     //创建大集合

        for (int i = 0; i < 20; i++) {
            arrayList.add(random.nextInt(100)+1);
        }
        ArrayList<Integer> resArrayList = new ArrayList<>();
        resArrayList=getSmallArrayList(arrayList);              //获取小集合
        for (int i = 0; i < resArrayList.size(); i++) {
            System.out.println(resArrayList.get(i));
        }

    }
//定义获取所有偶数元素集合的方法(ArrayList类型作为返回值)
    public static ArrayList<Integer> getSmallArrayList(ArrayList<Integer> orlist) {
        ArrayList<Integer> resArrayList = new ArrayList<>();
        for (int i = 0; i < orlist.size(); i++) {
            if (orlist.get(i) % 2 == 0) {
                resArrayList.add(orlist.get(i));
            }
        }
        return resArrayList;   //返回类型仍然为ArrayList<Integer>
    }
}
