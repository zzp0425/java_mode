package com.strategy.impl;

import com.strategy.father.CashSuper;

/**
 * Created by zzp on 2015/12/14.
 * 正常收费子类
 */
public class CashNormal implements CashSuper {
    /**
     * 现金收取
     * 正常收费
     * @param money
     * @return
     */
    public double acceptCash(double money) {
        return money;
    }
}
