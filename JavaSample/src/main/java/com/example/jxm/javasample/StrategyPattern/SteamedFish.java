package com.example.jxm.javasample.StrategyPattern;

/**
 * Created by jiamao on 2018/6/5.
 */

public class SteamedFish implements ICookFishMethod {
    @Override
    public void cook() {
        System.out.println("清蒸鱼味道鲜！");
    }
}
