package com.bridge.child;

import com.bridge.father.Implementor;

/**
 * Created by zzp on 2016/2/1.
 */
public class ConcreateImplA extends Implementor {
    @Override
    public void operator() {
        System.out.println("this is ConcreateImplA operator");
    }
}
