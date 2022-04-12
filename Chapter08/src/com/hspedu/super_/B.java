package com.hspedu.super_;

public class B extends A{
    //访问父类的属性，但不能访问父类的private属性
    public void hi() {
        System.out.println(super.n1 + super.n2 + super.n3);
    }
    public void sum() {
        System.out.println("B类的sum()");
        //希望调用父类A的cal()方法
        //因为子类B 没有cal方法，下面有三种方法

        //找cal方法时，顺序是：
        // 1. 先找本类，如果有，则调用。
        // 2. 如果没有，则找父类（如果有，并可以调用，则调用）
        // 3. 如果父类没有，则继续找父类的父类，整个规则，就是一样的，直到Object类
        //提示：如果查找方法的过程中，找到了，但是不能访问，则报错
        //     如果查找方法的过程中，没有找到，则提示方法不存在
        cal();
        //this.cal();//等价于cal
        super.cal();
    }
    //访问父类的方法，但不能访问父类的private方法
    public void ok() {
        super.test100();
        super.test200();
        super.test300();
    }
    //访问父类的构造器(这点前面用过):
    public B() {
        super();
        //super("jack", 10);
        //super("jack");
    }
}
