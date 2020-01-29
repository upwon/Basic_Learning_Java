package cn.wxw.day07.DemoArrayList;

import java.util.ArrayList;
import java.util.Random;

/**
 * Copyright (C), 2015-2019, 王先文
 * FileName: DemoArrayListrandom
 * Author:   Xianwen Wang
 * Email:w1244753906@gmail.com
 * Date:     2019/9/13 17:32
 * Description::生成6个1~33之间的随机整数,添加到集合,并遍历
 * History
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


public class DemoArrayListrandom {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            int num=random.nextInt(33)+1;
            arrayList.add(num);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }


//    public static void main(String[] args) {
////        ArrayList <Integer> arrayList=new ArrayList<>();
////        Random random=new Random();
////
////        for (int i = 0; i < 6; i++) {
////            int num=random.nextInt(33)+1;
////            arrayList.add(num);
////        }
////        for (int i = 0; i < arrayList.size(); i++) {
////            System.out.println(arrayList.get(i));
////        }
////    }


}
