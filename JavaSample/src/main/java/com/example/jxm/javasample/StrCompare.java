package com.example.jxm.javasample;

/**
 * Created by jiamao on 2018/5/24.
 */

public class StrCompare {

    public static void main(String[] args){


        //基本类型比较
       String a="hello";
       String a11="hello";
       String b=new String("hello");
       String c=new String("hello");

        //==:值相等返回true，反之返回false；（对于基本类型，值就是它的值，引用类型值则是他的地址）
        System.out.println("a==b: "+(a==b));//false
        System.out.println("b==c: "+(b==c));//false
        System.out.println("b==hello: "+(b=="hello"));//false
        System.out.println("a==a11: "+(a==a11));//true,引用的都是常量池中的

        String d=b.intern();
        b=b.intern();//判断b的值是否存在于常量池中，不存在则将值添加到常量池中，并返回引用，存在则直接返回引用
        System.out.println("调用intern后a==b: "+(a==b));//true
        System.out.println("调用intern后d==b: "+(d==b));//true


        //String类重写了equals()方法，先用==判断是否是同一个对象（地址是否相同),是则直接返回true
        //不是则进行字符串的比较，先判断是不是String类型，再判断字符串长度是否相等，后一位位字符串比较，
        //发现不满足则直接返回false。

        //equals(): 值相等，同一对象，返回true；否则，返回false
        System.out.println("a.equals(c): "+(a.equals(c)));//true
        System.out.println("b.equals(c): "+(b.equals(c)));//true
        System.out.println("c.equals(a): "+(c.equals(a)));//true
        System.out.println("b.equals(hello): "+(b.equals("hello")));//true
        System.out.println("a.hashCode(): "+a.hashCode());//
        System.out.println("b.hashCode(): "+b.hashCode());//
        System.out.println("c.hashCode(): "+c.hashCode());//
        System.out.println("hello.hashCode(): "+"hello".hashCode());//
    }

}
