package com.example.jxm.javasample.StatePattern;

/**
 * Created by jiamao on 2018/6/5.
 */

public class Livelihood {

    private ILifeState lifeState;


    public Livelihood(ILifeState lifeState) {
        this.lifeState = lifeState;
    }

    public void goGoGo(){
        lifeState.life(this);
    }

    public void setLifeState(ILifeState lifeState){
        this.lifeState=lifeState;
    }



}
