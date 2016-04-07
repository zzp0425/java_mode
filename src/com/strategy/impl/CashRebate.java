package com.strategy.impl;

import com.strategy.father.CashSuper;

/**
 * Created by zzp on 2015/12/14.
 * 打折收费
 */
public class CashRebate implements CashSuper {

    private double moneyRebate = 1d;//默认不打折

    public CashRebate(String rebate){
        this.moneyRebate = Double.valueOf(rebate);
    }
    /**
     * 现金收取
     * 现金 * 打几折
     * @param money
     * @return
     */
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
