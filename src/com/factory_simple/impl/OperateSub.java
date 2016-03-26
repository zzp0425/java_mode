package com.factory_simple.impl;

import com.factory_simple.father.Operation;

/**
 * Created by zzp on 2015/12/9.
 */
public class OperateSub extends Operation {

    @Override
    public double getResult() {
        return getNumA() - getNumB();
    }
}