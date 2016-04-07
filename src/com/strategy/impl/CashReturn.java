package com.strategy.impl;

import com.strategy.father.CashSuper;

/**
 * Created by zzp on 2015/12/14.
 * 根据满足多少金额，少多少钱计算
 */
public class CashReturn implements CashSuper {
    //打折需满足的金额条件
    private double moneyCondition = 0.0;
    //返利多少
    private double moneyRetun = 0.0;
    public CashReturn(String moneyCondition, String moneyReturn){
        this.moneyCondition = Double.valueOf(moneyCondition);
        this.moneyRetun = Double.valueOf(moneyReturn);
    }

    /**
     * 现金收取
     * 现金 - 满足条件的最少倍数 * 返现金额
     * @param money
     * @return
     */
    public double acceptCash(double money) {
        double result = money;
        if (money > moneyCondition) {
            result = money - Math.floor(money / moneyCondition) * moneyRetun;
        }
        return result;
    }
}
