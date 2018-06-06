package com.example.jxm.javasample.FlyWeightPattern;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by jiamao on 2018/5/29.
 */

public class ConcreteFlyweight extends Flyweight{
private String string;
public ConcreteFlyweight(String str){
string = str;
}

    public void operation()
    {
        System.out.println("Concrete---Flyweight : " + string);
    }
}
