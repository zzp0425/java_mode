package com.bridge.child;

import com.bridge.father.Abstraction;

/**
 * Created by zzp on 2016/2/1.
 */
public class RefindAbstraction extends Abstraction {

    @Override
    public void operation() {
        implementor.operator();
    }
}
