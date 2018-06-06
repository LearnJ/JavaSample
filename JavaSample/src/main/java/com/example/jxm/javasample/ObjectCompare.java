package com.example.jxm.javasample;

/**
 * Created by jiamao on 2018/5/24.
 */

public class ObjectCompare {


    public static void main(String[]args){


        ClassA a=new ClassA("小明");
        ClassA b=new ClassA("小明");

        System.out.println("a==b "+(a==b));
        System.out.println("a.equals(b) "+a.equals(b));

        System.out.println("a.hashCode() "+a.hashCode());
        System.out.println("b.hashCode() "+b.hashCode());


        System.out.println(a.toString()==b.toString());
        System.out.println(a.toString().equals(b.toString()));
        //equals方法，默认实现 return this == var1;所以和==没区别
        System.out.println("a==a "+(a==a));
        System.out.println("a.equals(a) "+a.equals(a));

    }

}
