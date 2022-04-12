package com.hspedu.poly_.detail_;

public class PolyDetail {
    public static void main(String[] args) {
        //向上转型：父类的引用指向了子类的对象
        //语法：父类类型 引用名 = new 子类类型();
        Animal animal = new Cat();
        Object obj = new Cat();//可以吗？可以 Object也是Cat的父类

        //可以调用父类中的所有成员（需遵守访问权限），
        //但是，不能调用子类中特有成员；最终运行效果看子类的具体实现。
        //因为在编译阶段，能调用哪些成员，是由编译类型来决定的
        //animal.catMouse();//错误
        //最终运行效果看子类的具体实现，即调用方法时，按照从子类开始查找方法
        //然后调用，规则是我们前面讲的方法调用规则一致
        animal.eat();//猫吃鱼
        animal.run();//跑
        animal.show();//hello，你好
        animal.sleep();//睡

        //老师希望，可以调用Cat的catchMouse方法
        //多态的向下转型
        //（1）语法： 子类类型 引用名 = （子类类型）父类引用;
        //cat的编译类型是cat， 运行类型是cat
        Cat cat = (Cat) animal;
        cat.catchMouse();
        //（2）要求父类的引用必须指向的是当前目标类型的对象
        //Dog dog = (Dog) animal;//不可以
    }
}
