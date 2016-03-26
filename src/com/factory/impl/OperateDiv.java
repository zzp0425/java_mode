package com.factory.impl;

import com.factory.father.Operation;

/**
 * Created by zzp on 2015/12/9.
 */
public class OperateDiv extends Operation {

    @Override
    public double getResult() {
        if(0 == getNumB()){
            System.out.println("除数不能为0");
            return 0;
        }
        return getNumA() / getNumB();
    }
}