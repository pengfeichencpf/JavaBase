package com.hspedu.extend_.improve_;

public class Sub extends Base{//父类
    public Sub(String name, int age) {
        //1.老师想调用父类的无参构造器，如下或者什么都不写，默认就是调用super()
        //super();//父类的无参构造器
        //2.想要调用父类的Base(String name) 构造器
        super("hsp");
        System.out.println("子类Sub(String name, int age)构造器被调用...");
    }
    public Sub() {//构造器
        super("smith", 10);
        System.out.println("子类Sub()构造器被调用...");
    }
    //当创建子类对象时，不管使用子类的哪个构造器，默认情况下总会去调用父类的无参构造器
    public Sub(String name) {
        //do nothing
        super("tom", 30);
        System.out.println("子类Sub(String name)构造器被调用...");
    }
    public void sayOK() {//子类方法
        //非私有的属性和方法可以在子类直接访问
        //但是私有属性不能在子类直接访问
        System.out.println(n1 + n2 + n3);
        test100();
        test200();
        test300();
        //test400();错误
        //要通过父类提供公共的方法去访问
        System.out.println("n4=" + getN4());
        callTest400();
    }
}
