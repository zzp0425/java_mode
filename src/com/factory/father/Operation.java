package com.factory.father;

/**
 * Created by zzp on 2015/12/9.
 */
public abstract class Operation {
    private double numA;
    private double numB;

    public abstract double getResult();

    public double getNumA() {
        return numA;
    }

    public void setNumA(double numA) {
        this.numA = numA;
    }

    public double getNumB() {
        return numB;
    }

    public void setNumB(double numB) {
        this.numB = numB;
    }
}
