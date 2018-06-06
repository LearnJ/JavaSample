package com.example.jxm.javasample.StrategyPattern;

/**
 * Created by jiamao on 2018/6/5.
 */

public class Cooker {

    ICookFishMethod iCookFishMethod;


    public Cooker(ICookFishMethod iCookFishMethod) {
        this.iCookFishMethod = iCookFishMethod;
    }

    public void cookFish(){
        iCookFishMethod.cook();
    }

    //使用策略模式，动态变更策略，有新的需要时，添加一个新的ICookFishMethod实现就可，不需修改该类代码
    public void setCookFish(ICookFishMethod iCookFishMethod){
        this.iCookFishMethod=iCookFishMethod;
    }

    //不使用策略模式情况,当添加新的条件时，必须修改代码，会导致该类越来越复杂且可能出错影响到原有功能。
    public void cookFishOld(int method){

        if (method==1){
            System.out.println("做成烤鱼真美味！");
        }
        else if (method==2){
            System.out.println("清蒸鱼味道鲜！");
        }else{
            System.out.println("煮成汤更好喝！");
        }

    }

}
