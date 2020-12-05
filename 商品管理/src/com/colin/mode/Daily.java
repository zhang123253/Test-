package com.colin.mode;

import java.util.Scanner;

public class Daily extends Goods{
    /**
    * 无参数构造方法；
    */
    public Daily(Scanner input)//主函数中input传入
    {
        super(input);
        System.out.print("请输入商品的重量：");
        this.weight = input.nextDouble();
    }
    /** 商品重量 */
    private double weight;

    @Override
    public String array(int i) {
        return super.array(i)+"\t重量："+this.weight;
    }
}
