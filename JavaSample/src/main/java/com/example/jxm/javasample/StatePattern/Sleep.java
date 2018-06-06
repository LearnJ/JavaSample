package com.example.jxm.javasample.StatePattern;

/**
 * Created by jiamao on 2018/6/5.
 */

public class Sleep implements ILifeState {

    @Override
    public void life(Livelihood livelihood) {
        System.out.println("I am sleeping,for a better tomorrow");
        livelihood.setLifeState(new MealTime());
    }
}
