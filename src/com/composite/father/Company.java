package com.composite.father;

/**
 * Created by zzp on 2016/1/29.
 */
public abstract class Company {
    protected String name;

    protected Company(){}

    public Company(String name){
        this.name = name;
    }

    public abstract void add(Company company);//增加
    public abstract void remove(Company company);//删除
    public abstract void display(int depth);//显示
    public abstract void lineOfDuty();//履行职责
}
