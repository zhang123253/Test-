# Test-
##### 这是一个商品管理的项目
* 商品的储存
* 查看全部商品的信息
* 查看某个商品的信息
* 删除某个商品
* 商品调整之后和信息<br><br><br>
项目主要用java语言完成：<br>
其中定义了一个Goods商品父类，从而衍出多个以Goods为父类的子类，他们既继承了Goods的字段，也继承了Goods类的方法，从而减少的子类的代码长度和复杂度；
<br>
   
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
       //名字
        public String name;
       //商品价格
        public double price;
        // 商品数量
        public int stock;

        // 把方法中字符串的值返回给主函数，在主函数中输出，主要动作方法都交给主函数；
     
        public String  array(int i)
        {
            //this. 就是主函数中temp.
            return ((i + 1) + "\t商品的名称:" + this.name + "\t 商品的的价格:" + this.price + "\t商品的库存:" + this.stock);
        }
    }
Foods类为Goods的子类即为商品的分类，继承了Goods的方法和字段同时添加了自己独有的功能（字段和方法）
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

