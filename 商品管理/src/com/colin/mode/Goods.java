package com.colin.mode;

import java.util.Scanner;

public class Goods {
    public Goods(Scanner input){
        //构造方法，对每个需要存入的货物进行赋值,方法参数是Scanner input;
        System.out.print("请输入商品的名称：");
        this.name = input.next();
        System.out.print("请输入商品的价格：");
        this.price = input.nextDouble();
        System.out.print("请输入商品的库存：");
        this.stock = input.nextInt();
        //System.out.println("保存成功！！");
    }
    /**名字*/
    public String name;
    /** 商品价格*/
    public double price;
    /** 商品数量*/
    public int stock;

    /**
     * 把方法中字符串的值返回给主函数，在主函数中输出，主要动作方法都交给主函数；
     */
    public String  array(int i)
    {
        /**this. 就是主函数中temp. */
        return ((i + 1) + "\t商品的名称:" + this.name + "\t 商品的的价格:" + this.price + "\t商品的库存:" + this.stock);
    }
}
