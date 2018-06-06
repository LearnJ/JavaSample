package com.example.jxm.javasample.StrategyPattern;

/**
 * Created by jiamao on 2018/6/5.
 */

public class RoastFish implements ICookFishMethod {
    @Override
    public void cook() {
        System.out.println("做成烤鱼真美味！");
    }
}
