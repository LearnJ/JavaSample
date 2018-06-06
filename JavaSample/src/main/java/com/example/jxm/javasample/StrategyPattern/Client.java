package com.example.jxm.javasample.StrategyPattern;

/**
 * Created by jiamao on 2018/6/5.
 */

/**
 * 策略模式：对于处理if-else结构很有作用，客户端可动态变更运行时方法，简化程序结构，代码结构更加清晰，使之易于理解、易于扩展
 * 不足：客户端需要了解所有策略类，当有很多策略类时使用变得困难，同时也会大幅增加项目中类的个数
 * 结构：1. 环境类：持有策略类抽象接口
 *       2. 抽象策略类：可选接口或者抽象类，抽象各具体策略的共有属性
 *       3. 具体策略类：抽象类的具体实现，供客户端选用的具体类
 *
 */

public class Client {

    public static void main(String[]args){

        RoastFish roastFish=new RoastFish();
        Cooker cooker=new Cooker(roastFish);
        cooker.cookFish();

        cooker.setCookFish(new SteamedFish());
        cooker.cookFish();

        cooker.setCookFish(new BoiledFish());
        cooker.cookFish();

        cooker.cookFishOld(2);

    }

}
