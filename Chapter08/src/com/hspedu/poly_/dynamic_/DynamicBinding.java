package com.hspedu.poly_.dynamic_;

public class DynamicBinding {
    public static void main(String[] args) {
        //a的编译类型是A，运行类型是B
        A a = new B();
        System.out.println(a.sum());//40 -> 30
        System.out.println(a.sum1());//30
    }
}

class A {//父类
    public int i = 10;

    public int sum() {
        return getI() + 10;//20 + 10
    }

    public int sum1() {
        return i + 10;
    }

    public int getI() {
        return i;
    }
}

class B extends A {
    public int i = 20;

//    public int sum() {
//        return i + 20;
//    }

    public int getI() {
        return i;
    }

    public int sum1() {
        return i + 10;
    }
}
