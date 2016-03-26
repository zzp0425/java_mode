package com.proxy.client;

import com.proxy.Girl;
import com.proxy.impl.Proxy;

/**
 * Created by zzp on 2015/12/21.
 */
public class Client {
    public static void main(String[] args) {
        Girl girl = new Girl();
        girl.setName("女朋友");
        Proxy proxy = new Proxy(girl);
        proxy.giveChocolate();
        proxy.giveDolls();
        proxy.giveFlowers();
    }
}
