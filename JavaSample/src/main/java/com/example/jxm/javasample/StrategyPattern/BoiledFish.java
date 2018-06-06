package com.example.jxm.javasample.StrategyPattern;

/**
 * Created by jiamao on 2018/6/5.
 */

public class BoiledFish implements ICookFishMethod {
    @Override
    public void cook() {
        System.out.println("煮成汤更好喝！");
    }
}
