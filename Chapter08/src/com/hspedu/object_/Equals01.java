package com.hspedu.object_;

public class Equals01 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a == c);//true
        System.out.println(b == c);//true
        B bObj = a;
        System.out.println(bObj == c);//true
        //equals方法，源码怎么查看
        //把光标放在equals方法，直接输入Ctrl+b

        /*
        //带大家看看JDK的源码 String类的equals方法
        //把Object的equals方法重写了，变成了比较两个字符串值是否相等
        public boolean equals(Object anObject) {
        if (this == anObject) {//如果是同一个对象
            return true;//返回true
        }
        if (anObject instanceof String) {//判断类型
            String anotherString = (String)anObject;//向下转型
            int n = value.length;
            if (n == anotherString.value.length) {//如果长度相同
                char v1[] = value;
                char v2[] = anotherString.value;
                int i = 0;
                while (n-- != 0) {//然后一个一个的比较字符
                    if (v1[i] != v2[i])
                        return false;
                    i++;
                }
                return true;//如果两个字符串的所有字符都相等，则返回TRUE
            }
        }
        return false;//如果比较的不是字符串，则返回FALSE
    }
        */
        "hello".equals("abc");
        /*
        //看看Object类的equals方法
        //即Object的equals方法默认就是比较对象地址是否相同
        //也就是判断两个对象是不是同一个对象
        public boolean equals(Object obj) {
            return (this == obj);
        }
        * */
    }
}
class A extends B {}


class B {}
