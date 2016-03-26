package com.proxy.impl;

import com.proxy.Girl;
import com.proxy.father.Gift;

/**
 * 实际对象
 * Created by zzp on 2015/12/21.
 */
public class Pursuit implements Gift{
    private Girl girl;

    public Pursuit(Girl girl){
        this.girl = girl;
    }
    /**
     * 送花
     */
    public void giveFlowers() {
        System.out.println("真实对象送花给" + girl.getName());
    }

    /**
     * 送玩具熊
     */
    public void giveDolls() {
        System.out.println("真实对象送玩具熊给" + girl.getName());
    }

    /**
     * 送花
     */
    public void giveChocolate() {
        System.out.println("真实对象送巧克力给" + girl.getName());
    }
}
