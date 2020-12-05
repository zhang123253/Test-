package com.colin.mode;

import java.util.Scanner;

public class Foods extends Goods{
    public Foods(Scanner input) {  //new Foods(input);
        super(input);
        //Scanner input = new Scanner(System.in);
        System.out.print("请输入食品的生产日期：");
        this.productDate = input.next();
        System.out.print("请输入食品的有效期：");
        this.effTime = input.next();
        System.out.println("保存成功！！！");
    }

    /** 生产日期 */
    private String productDate;
    /** 保质期 */
    private String effTime;

    /**
     * 重载函数，重载父类，用super调用父类的array方法
     */
    @Override
    public String array(int i) {
        return super.array(i)+"\t生产日期："+this.productDate+"\t 保质期："+this.effTime;
    }
}
