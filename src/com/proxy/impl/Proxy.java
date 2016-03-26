package com.proxy.impl;

import com.proxy.Girl;
import com.proxy.father.Gift;

/**
 * Created by zzp on 2015/12/21.
 */
public class Proxy implements Gift {
    private Pursuit pursuit;

    public Proxy(Girl girl){
        pursuit = new Pursuit(girl);
    }
    /**
     * 送花
     */
    public void giveFlowers() {
        System.out.println("通过代理");
        pursuit.giveFlowers();
    }

    /**
     * 送玩具熊
     */
    public void giveDolls() {
        System.out.println("通过代理");
        pursuit.giveDolls();
    }

    /**
     * 送巧克力
     */
    public void giveChocolate() {
        System.out.println("通过代理");
        pursuit.giveChocolate();
    }
}
