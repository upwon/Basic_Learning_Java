package cn.wxw.day07.Demo03_Random;

import java.net.SocketOption;
import java.util.Random;
import java.util.Scanner;

/**
 * Copyright (C), 2015-2019, 王先文
 * FileName: DemoguessNumber
 * Author:   Xianwen Wang
 * Email:w1244753906@gmail.com
 * Date:     2019/9/13 16:11
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


public class DemoguessNumber {
    public static void main(String[] args) {
        //系统随机产生一个1-100之间的数字
        Random random = new Random();
        int num=random.nextInt(100)+1;
        while (true){
            //键盘记录我们的数字
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入要猜的数字（1-100）");
            int gussNum=scanner.nextInt();

            //比较数字是否正确
            if(num==gussNum){
                System.out.println("恭喜恭喜，猜对了");
                break;
            }
            else if(num<gussNum){
                System.out.println("猜大了");
            }
            else if(num>gussNum){
                System.out.println("猜小了");
            }
        }


    }
}
