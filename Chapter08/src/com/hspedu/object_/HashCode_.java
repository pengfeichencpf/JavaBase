package com.hspedu.object_;

public class HashCode_ {
    public static void main(String[] args) {

        AA aa = new AA();
        AA aa2 = new AA();
        AA aa3 = aa;
        System.out.println("aa.hashCode()="+aa.hashCode());//aa.hashCode()=356573597
        System.out.println("aa2.hashCode()="+aa2.hashCode());//aa2.hashCode()=1735600054
        System.out.println("aa3.hashCode()="+aa3.hashCode());//aa3.hashCode()=356573597
    }
}

class AA {}
