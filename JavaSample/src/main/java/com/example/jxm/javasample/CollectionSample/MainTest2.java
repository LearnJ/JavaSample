package com.example.jxm.javasample.CollectionSample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by jiamao on 2018/5/25.
 */

public class MainTest2 {



    public static void main(String[]args){

        HashMap<Integer,ArrayList<String>>maps=new HashMap<>();



        for (int i=0;i<10;i++){
            ArrayList<String>list=new ArrayList<>();
            list.add(i+"个");
            maps.put(i,list);
        }

        Set<Integer>keys=maps.keySet();

        for (Integer key:keys){
            System.out.println(maps.get(key).get(0));
        }

        Set<Map.Entry<Integer,ArrayList<String>>> entrys=maps.entrySet();


        for (Map.Entry entry:entrys){
            System.out.println("key=  "+entry.getKey()+"  value="+entry.getValue());
        }


    }


}
