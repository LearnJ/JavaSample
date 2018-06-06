package com.example.jxm.javasample.StatePattern;

/**
 * Created by jiamao on 2018/6/5.
 */

public class Work implements ILifeState {

    @Override
    public void life(Livelihood livelihood) {
        System.out.println("I am working,or I have no money");
        livelihood.setLifeState(new MealTime());
    }
}
