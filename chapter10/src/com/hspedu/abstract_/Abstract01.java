package com.hspedu.abstract_;

public class Abstract01 {
    public static void main(String[] args) {

    }
}
abstract class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }
    //思考：这里eat你实现了，其实没有什么意义
    //即父类方法不确定性
    //==>考虑将该方法设计为抽象方法（Abstract）
    //==>所谓抽象方法，就是没有实现的方法
    //==>所谓没有实现就是指，没有方法体
    //==>当一个类中存在抽象方法时，需要将该类声明为abstract
    //==>一般来说抽象类会被继承，由其子类实现
    public abstract void eat();
}
