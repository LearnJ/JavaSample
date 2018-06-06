package com.example.jxm.javasample.CollectionSample;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jiamao on 2018/5/29.
 */

//客户端类
public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight fly = factory.factory(new Character("a"));
        fly.operation("First Call");

        fly = factory.factory(new Character("b"));
        fly.operation("Second Call");

        fly = factory.factory(new Character("a"));
        fly.operation("Third Call");
        System.out.println("size= "+factory.files.size());
    }

}