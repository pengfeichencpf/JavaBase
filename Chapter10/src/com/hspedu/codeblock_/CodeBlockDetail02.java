package com.hspedu.codeblock_;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        A a = new A();//(1)getN1被调用...(2)A静态代码块01(3)getN1被调用...(4)A普通代码块01(5)A无参构造器被调用
    }
}

class A {

    private int n2 = getN2();//普通属性的初始化

    {//普通代码块
        System.out.println("A普通代码块01");
    }
    //静态属性初始化
    private static int n1 = getN1();
    static {
        System.out.println("A静态代码块01");
    }
    public static int getN1() {
        System.out.println("getN1被调用...");
        return 100;
    }

    public int getN2() {//普通方法
        System.out.println("getN2被调用...");
        return 200;
    }
    //无参构造器
    public A() {
        System.out.println("A无参构造器被调用");
    }
}
