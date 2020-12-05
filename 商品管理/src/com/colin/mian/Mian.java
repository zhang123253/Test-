package com.colin.mian;

import com.colin.mode.Daily;
import com.colin.mode.Electrial;
import com.colin.mode.Foods;
import com.colin.mode.Goods;

import java.util.Scanner;

public class Mian {

    public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            Goods[] Array = new Goods[1000];
            int add = 0;
        loop:while(true) {
            System.out.println("===================================================================================");
            System.out.println("                           欢迎使用畅畅商品管理系统");
            System.out.println("===================================================================================");
            System.out.println("[1.添加新商品 2.展示已有信息 3.删除商品信息 5.退出]");
            System.out.print("请输入----->");
            int number = input.nextInt();
            switch (number)
            {
                case 1://增加商品
                    System.out.print("请输入你想要新加的商品类别[1.食品 2.生活用品 3.电器]：");
                    /**
                     *    ****注意****
                     */
                    Goods newGoods = null;
                    switch (input.nextInt())
                    {
                        case 1://多态
                            /**
                             * Foods foods = new Foods();
                             * newGoods = foods;
                             * 方法中是参数（Scanner input）,函数调用传（input）
                             *     ****注意****
                             * 调用构造函数得到的值，保存在newGoods中
                             */
                            /** 小 --> 大
                             * newGoods不是单一变量是----Goods类型的，所以可以将Foods类型
                             *
                             * newGoods是中间变量；11.24
                             * 父类可以储存它子类的所有信息；11.26
                             */
                            newGoods = new Foods(input);//可以理解11.24；
                            break;
                        case 2:
                            newGoods = new Daily(input);//向上转型，日常用品是商品，所以可以储存
                            break;
                        case 3:
                            newGoods = new Electrial(input);//各个类型赋值给Goods类的对象newGoods；
                            break;
                    }
                    /**
                     * 此时的Array[i]是Goods类型，newGoods被赋值成各个类型
                     * 还是Goods类的Array[i]可以包容所以类型
                     *     ****注意****
                     */
                    Array[add ++] = newGoods;//给数组传参
                    break;
                case 4:
                    break;
                case 2://查看信息；
                    for(int i = 0;i < add;i ++)//i（小于不是等于）的范围需注意，对象引用空指针会报错，就是数组的范围输出了空指针；
                    {
                        /**
                         * 对对象变量定义？？？？？为什么这么用？如果不初始化显示没有定义
                         * ----对象变量必须初始化(如果没有意义就定义为null)
                         * 下边是调用 array方法,类方法中的this. 就是temp.-----对11.24
                         *
                         * 向下转型，看Goods类的Array[i]给temp的赋值类型；----不用考虑转型了，Goods可以包含所有子类11.24；
                         * Array[i]现在是哪个类的类型，用Goods定义temp就完事了，----片面11.24
                         * 因为Goods是父类，Goods可以包容所有的类型，----对11.24
                         * 用Array[i]给temp赋值，赋类型；----对11.24
                         *      ***注意***下边这个代码；
                         * temp和Array共用同一个地址，temp还是中间变量过渡一下；11.24
                         */

                        Goods temp = Array[i];
                        /** 多态？----对 分别调用自己的类方法
                         * 对不同的对象(不同的类类型)调用同一个方法（array）产生不同的效果  11.24
                         * 多个子类继承父类的重载方法，同时在重载方法上添加自己类需要的功能
                         * 方法是一个，但是产生的效果不同
                         * 虚拟机里自动识别是什么类型，并相应的调用相匹类型的方法；11.26
                         */
                        System.out.println(temp.array(i));//用temp对象，调用各个类的array方法，接受返回的字符串

                    }
                    break;
                case 3://删除元素；
                    System.out.print("请输入你要删除商品的编号：");
                    int delGoodsOn = input.nextInt();
                    Array[delGoodsOn - 1] = null;
                    System.out.println("删除成功！~");
                    for(int cancle = delGoodsOn - 1;cancle < add;cancle ++)//过滤掉空的空间
                    {
                        Array[cancle] = Array[cancle+1];//每个往前移一位
                    }
                    add --;
                    break;
                case 5://退出
                    System.out.println("感谢使用，么么哒！！！");
                    break loop;
            }
        }
    }
}
