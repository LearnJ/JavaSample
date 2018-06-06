package com.example.jxm.javasample.CollectionSample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jiamao on 2018/5/25.
 *
 * 分析了正确移除list指定元素，和错误移除两种方式
 *
 */

public class MainTest {



    public static void main(String[]args){


        InfoA2 [] infoA2s={new InfoA2(1),new InfoA2(2),new InfoA2(2),new InfoA2(4),new InfoA2(8)};

        //infolist无法进行add和remove操作，因为Arrays.asList得到的是Array的内部类ArrayList，它没有重写该方法
        //infolist2可以，因为它已经重写了，详见源码。
        List<InfoA2> infolist= Arrays.asList(infoA2s);//
        List<InfoA2>infolist2=new ArrayList<>(infolist);


        for (int i=0;i<infoA2s.length;i++){
            System.out.println("当前总共 = "+infoA2s[i].id);
        }

        System.out.println("=================");

       //错误删除一：漏掉某些元素
//        for (int i=0;i<infolist2.size();i++){
//
//            if (infolist2.get(i).id==2){
//                infolist2.remove(i);
//                //System.out.println("删除================="+i);
//            }
//        }
//
//        for (int i=0;i<infolist2.size();i++){
//                System.out.println("剩余================="+infolist2.get(i).id);
//        }

        //错误二：抛出异常Exception in thread "main" java.util.ConcurrentModificationException
//        for (InfoA2 info:infolist2){
//
//            if (info.id==2){
//                infolist2.remove(info);
//                //System.out.println("删除================="+i);
//            }
//        }

        //List正确移除元素的方法一：使用Iterator
//        Iterator<InfoA2>  iteral=infolist2.iterator();
//        System.out.println("size================="+infolist2.size());
//        while (iteral.hasNext()){
//            InfoA2 a2= iteral.next();
//            if(a2.id==2) {
//                iteral.remove();
//            }
//        }
//        Iterator<InfoA2> iteral2=infolist2.iterator();
//        while (iteral2.hasNext()){
//            InfoA2 a2= iteral2.next();
//            System.out.println("222==="+a2.id);
//        }

        //方法二：从后往前遍历
        for (int i = infolist2.size() - 1; i >= 0; i--) {
            InfoA2 infoA2 = infolist2.get(i);
            if (infoA2.id==2) {
                infolist2.remove(infoA2);
            }
        }

        for (int i=0;i<infolist2.size();i++){
            System.out.println("剩余================="+infolist2.get(i).id);
        }
    }

}
