package com.hspedu.poly_.polyarr_;

public class PloyArray {
    public static void main(String[] args) {
        //现有一个继承结构如下，要求创建一个Person对象、
        // 2个Student对象和2个Teacher对象，
        // 统一放在数组中，并调用每个对象say方法。
        //父类的引用，可以指向子类的对象
        Person[] persons = new Person[5];
        persons[0] = new Person("jack",20);
        persons[1] = new Student("mary",18,100);
        persons[2] = new Student("smith",19,30.1);
        persons[3] = new Teacher("scott",30,20000);
        persons[4] = new Teacher("king", 50,25000);
        //循环遍历多态数组，调用say
        for (int i = 0; i < persons.length; i++) {
            //老师提示：person[i]编译类型是Person，运行类型是根据实际情况由JVM虚拟机来判断
            //方法看运行类型，属性看编译类型。
            System.out.println(persons[i].say());//动态绑定机制
            //这里就需要聪明点了，使用类型判断+向下转型
            if (persons[i] instanceof Student) {//判断person[i]的运行类型是不是Student
                Student student = (Student) persons[i];//向下转型
                student.study();
                //这里也可以使用一条语句((Student)Person[i]).study();
            } else if (persons[i] instanceof Teacher) {
                Teacher teacher = (Teacher) persons[i];
                teacher.teach();
            } else if (persons[i] instanceof Person) {

            } else {
                System.out.println("你的类型有误，请检查...");
            }
        }
    }
}
