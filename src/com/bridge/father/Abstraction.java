package com.bridge.father;

/**
 * Created by zzp on 2016/2/1.
 */
public abstract class Abstraction {

    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operation();

}
