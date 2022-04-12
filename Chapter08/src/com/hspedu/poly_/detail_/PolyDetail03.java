package com.hspedu.poly_.detail_;

public class PolyDetail03 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof BB);//true
        System.out.println(bb instanceof AA);//true

        //aa 编译类型 AA，运行类型是BB
        AA aa = new BB();
        //判断的是aa的运行类型是否为instanceOf后面的类型
        System.out.println(aa instanceof AA);//true
        System.out.println(aa instanceof BB);//true

        Object obj = new Object();
        System.out.println(obj instanceof AA);//false

        String str = "hello";
        System.out.println(str instanceof Object);
    }
}

class AA {}
class BB extends AA {}