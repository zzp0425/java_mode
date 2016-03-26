package com.bridge.client;

import com.bridge.child.ConcreateImplA;
import com.bridge.child.ConcreateImplB;
import com.bridge.child.RefindAbstraction;
import com.bridge.father.Abstraction;

/**
 * Created by zzp on 2016/2/1.
 */
public class Client {
    public static void main(String[] args) {
        Abstraction abstraction = new RefindAbstraction();
        abstraction.setImplementor(new ConcreateImplA());
        abstraction.operation();

        abstraction.setImplementor(new ConcreateImplB());
        abstraction.operation();
    }
}
