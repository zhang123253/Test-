package com.colin.mode;

import java.util.Scanner;

public class Electrial extends Goods{
    public Electrial(Scanner input) {
        super(input);
        System.out.print("请输入品牌：");
        this.brand = input.next();
        System.out.print("请输入功率：");
        this.power = input.next();
    }

    /** 品牌 */
    private String brand;
    /** 功率 */
    private String power;

    @Override
    public String array(int i) {
        return super.array(i)+"\t品牌："+this.brand+"\t功率："+this.power;
    }
}
