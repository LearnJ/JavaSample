package com.example.jxm.javasample.StatePattern;

/**
 * Created by jiamao on 2018/6/5.
 */

/**
 * 状态模式：和策略模式结构相近，但思想不同
 * 策略模式：只在多种策略方法的动态替换，由客户端主动选用
 * 状态模式：状态变更，执行结果自动切换，强调状态的自动变更
 *
 */
public class OneDay {
    public static void main(String[]args){

        Livelihood livelihood=new Livelihood(new Sleep());

        livelihood.goGoGo();
        livelihood.goGoGo();
        livelihood.goGoGo();
        livelihood.goGoGo();
        livelihood.goGoGo();
        livelihood.goGoGo();
        livelihood.goGoGo();
        livelihood.goGoGo();
    }
}
