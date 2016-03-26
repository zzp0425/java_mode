package com.facade.client;

import com.facade.father.Facade;

/**
 * Created by zzp on 2016/1/14.
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.menthodA();
        facade.methodB();
    }
}
