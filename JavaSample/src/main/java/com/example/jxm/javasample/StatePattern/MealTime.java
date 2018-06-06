package com.example.jxm.javasample.StatePattern;

/**
 * Created by jiamao on 2018/6/5.
 */

public class MealTime implements ILifeState {

    private static int count=0;
    @Override
    public void life(Livelihood livelihood) {
        count++;
        System.out.println("I am eating,for better work.   第 "+ count+" 次吃饭。");
        if (count>=3) {
            livelihood.setLifeState(new Sleep());
            count=0;
        }else {
            livelihood.setLifeState(new Work());
        }
    }
}
