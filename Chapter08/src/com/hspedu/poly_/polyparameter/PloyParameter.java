package com.hspedu.poly_.polyparameter;

import com.sun.corba.se.spi.orbutil.threadpool.Work;

public class PloyParameter {
    public static void main(String[] args) {
        Worker tom = new Worker("tom",2500);
        Manager milan = new Manager("milan", 5000, 200000);
        PloyParameter ployParameter = new PloyParameter();
        ployParameter.showEmpAnnual(tom);
        ployParameter.showEmpAnnual(milan);

        ployParameter.testWork(tom);
        ployParameter.testWork(milan);

    }

    public void showEmpAnnual(Employee e) {
        System.out.println(e.getAnnual());//动态绑定机制
    }
    //测试类中添加一个方法，testWork，如果是普通员工，则调用work方法，如果是经理就调用manage方法
    public void testWork(Employee e) {
        if (e instanceof Worker) {
            ((Worker) e).work();//向下转型
        } else if (e instanceof Manager) {
            ((Manager) e).manage();
        } else {
            System.out.println("不做处理");
        }
    }
}
