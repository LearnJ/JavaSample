package com.example.jxm.javasample;

/**
 * Created by jiamao on 2018/5/24.
 * equals() & "=="  compare
 *
 */

public class CompareTest {


    public static void main(String[] args){


        //基本类型比较
        Integer a=132;
        Integer a2=132;
        //整数缓存池(-128-127)
        Integer j=-128;//当使用自动装箱的方式创建integer对象时，会从常量缓存池中取
        Integer j2=-128;

        Integer b=Integer.valueOf("132");
        Integer c=Integer.valueOf(132);
        int d=132;


        //整数缓存池(-128-127)
        System.out.println("a.hashCode(): "+a.hashCode());//false
        System.out.println("a==b: "+(a==b));//false
        System.out.println("b==c: "+(b==c));//false
        System.out.println("b==1: "+(b==132));//true
        System.out.println("b==d: "+(b==d));//true 一个数为值，则进行值比较
        System.out.println("a==a2: "+(a==a2));//true
        System.out.println("j==j2: "+(j==j2));//true


        //Integer 重写了equals()方法，作用：比较他们的值是否相等，如下：
        //return var1 instanceof Integer?this.value == ((Integer)var1).intValue():false;
        //instanceof判断是不是指定类型及其子类的实例
        System.out.println("a.equals(c): "+(a.equals(c)));//true
        System.out.println("b.equals(c): "+(b.equals(b)));//true
        System.out.println("b.equals(1): "+(b.equals(13)));//true
        System.out.println("b.equals(d): "+(b.equals(d)));//true
        System.out.println("b.equals(d): "+(b.equals("13")));//false ,因为字符串不是 Integer实例，直接返回false


        Integer e=1;
        boolean ee=e instanceof Integer;
        System.out.println(""+(e instanceof Integer));



    }



}
