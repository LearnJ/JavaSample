package com.example.jxm.javasample.ExceptionSample;

import com.example.jxm.javasample.CollectionSample.InfaoA;
import com.example.jxm.javasample.CollectionSample.InfoA2;

/**
 * Created by jiamao on 2018/5/25.
 */

public class ExceptionTest {

    private int id;

    private String name;

    public void cout() throws CsutomException {

        System.out.println("抛出前");
        throw new CsutomException("自定义");
        //System.out.println("抛出后");

    }



    public Integer test(){


        InfaoA infoA=new InfaoA(1);
        Integer a=new Integer(132);
        try {
            a=133;
            infoA.id=2;
            System.out.println("抛出后执行不到=====");
            return a;//会在返回前执行finally ,返回的“值”不受finally的影响，该值指基本类型，或者引用类型对应的地址，不受影响，
            //但是引用类型的内容改变会受到影响。
        } catch (Exception e) {
            e.printStackTrace();

        }finally {
            a=210;
            infoA.id=140;
            System.out.println("finally=====");
        }
        return a;
    }




    public static void main(String[] args){


        ExceptionTest exceptionTest=new ExceptionTest();

//        String out="";
//        try {
//            //exceptionTest.cout();
//            System.out.println("抛出后执行不到=====");
//            System.exit(0);//不会再执行finally
//            return;//会在返回前执行finally
//        } catch (Exception e) {
//            e.printStackTrace();
//
//        }finally {
//            out="有异常了";
//            System.out.println("finally=====");
//        }

        System.out.println("处理完后========out= "+exceptionTest.test());
    }

}
