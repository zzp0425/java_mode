package com.factory.impl;

import com.factory.father.IFactory;
import com.factory.father.Operation;

/**
 * Created by zzp on 2015/12/25.
 */
public class SubFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperateSub();
    }
}