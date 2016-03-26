package com.factory.impl;

import com.factory.father.Operation;

/**
 * Created by zzp on 2015/12/9.
 */
public class OperateAdd extends Operation{

    @Override
    public double getResult() {
        return getNumA() + getNumB();
    }
}
