package com.example.jxm.javasample.FlyWeightPattern;

import com.example.jxm.javasample.CollectionSample.InfaoA;

/**
 * Created by jiamao on 2018/5/29.
 */


public class FlyweightPattern{
FlyweightFactory factory = new FlyweightFactory();
Flyweight fly1;
Flyweight fly2;
Flyweight fly3;
Flyweight fly4;
Flyweight fly5;
Flyweight fly6;
/** *//** Creates a new instance of FlyweightPattern */
        public FlyweightPattern(){

        fly1 = factory.getFlyWeight(new InfaoA(1));

        fly2 = factory.getFlyWeight(new InfaoA(2));

        fly3 = factory.getFlyWeight(new InfaoA(2));

        fly4 = factory.getFlyWeight(new InfaoA(2));
        fly5 = factory.getFlyWeight(new InfaoA(2));

        fly6 = factory.getFlyWeight(new InfaoA(2));
}
public void showFlyweight(){
fly1.operation();
fly2.operation();
fly3.operation();
fly4.operation();
fly5.operation();
fly6.operation();
int objSize = factory.getFlyweightSize();
System.out.println("objSize = " + objSize);
        }
public static void main(String[] args){
System.out.println("The FlyWeight Pattern!");
FlyweightPattern fp = new FlyweightPattern();
fp.showFlyweight();
}
}