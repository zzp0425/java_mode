package com.strategy;

import com.strategy.father.CashSuper;
import com.strategy.impl.CashNormal;
import com.strategy.impl.CashRebate;
import com.strategy.impl.CashReturn;

/**
 * Created by zzp on 2015/12/14.
 */
public class CashContext {
    private CashSuper cs;

    /**
     * 0-正常，1-打8折，2-满300反100
     * @param type
     */
    public CashContext (String type) {
        Integer cashType = Integer.valueOf(type);
        switch (Integer.valueOf(cashType)){
            case 0 :
                cs = new CashNormal();
                break;
            case 1 :
                cs = new CashRebate("0.8");
                break;
            case 2 :
                cs = new CashReturn("300", "100");
                break;
        }
    }

    public double getResult(double money){
        return cs.acceptCash(money);
    }

}
