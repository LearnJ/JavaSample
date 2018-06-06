package com.example.jxm.javasample;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by jiamao on 2018/5/23.
 */

public class MainClass {


    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchFieldException {


        OuterClass.InnerA a;


        OuterClass outerClass=new OuterClass("outer");
        a=outerClass.new InnerA();
        a.say();


        Class out=outerClass.getClass();
        Constructor[] constructors= out.getConstructors();

        for (Constructor c:constructors){
            System.out.println("构造函数"+c.getName());
            Class[] parameters=c.getParameterTypes();

            for (Class p:parameters){
                System.out.println("参数名："+p.getTypeName());
                System.out.println("参数类型："+p.getSimpleName());
            }

        }

        Constructor c=out.getDeclaredConstructor();
        c.setAccessible(true);
        OuterClass outer= (OuterClass) c.newInstance();



//        Method[] methods=out.getDeclaredMethods();
//        for (Method method:methods){
//            System.out.println("函数名："+method.getName());
//
//            Parameter parameters[]=method.getParameters();
//            for (Parameter p:parameters){
//                System.out.println("参数名："+p.getName());
//                System.out.println("参数类型："+p.getType());
//            }
//
//            System.out.println("返回值= "+method.getReturnType().getSimpleName());
//            System.out.println("======================================");
//        }
//        System.out.println("getMethods=========================================");
//        Method[] methods2=out.getMethods();
//        for (Method method:methods2){
//            System.out.println("函数名："+method.getName());
//
//            Parameter parameters[]=method.getParameters();
//            for (Parameter p:parameters){
//                System.out.println("参数名："+p.getName());
//                System.out.println("参数类型："+p.getType());
//            }
//
//            System.out.println("返回值= "+method.getReturnType().getSimpleName());
//            System.out.println("======================================");
//        }
        Method m=out.getDeclaredMethod("getA");
        m.setAccessible(true);
        m.invoke(outerClass);

        //OuterClass b=(OuterClass) out.newInstance();//要求类要有无参构造函数，且在调用出能访问到


        Field[] fields=out.getFields();

        for(Field f:fields){
            System.out.println("成员名："+f.getName());
            System.out.println("成员类型："+f.getGenericType());
            System.out.println("===========================================");
        }


        Field field=out.getField("id");

        field.set(outerClass,100);
        field.setInt(outerClass,10);
        System.out.println("==========================================id="+outerClass.id+"  name== "+outerClass.name);

        Field field2=out.getDeclaredField("name");
        field2.setAccessible(true);
        System.out.println("==========================================name="+field2.get(outerClass));
        field2.set(outerClass,"小李子");
        System.out.println("==========================================name="+field2.get(outerClass));

    }

}
