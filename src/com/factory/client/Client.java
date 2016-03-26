package com.factory.client;

import com.factory.father.IFactory;
import com.factory.father.Operation;
import com.factory.impl.AddFactory;

/**
 * Created by zzp on 2015/12/25.
 */
public class Client {
    public static void main(String[] args) {
        IFactory factory = new AddFactory();
        Operation operation = factory.createOperation();
        operation.setNumA(1.1);
        operation.setNumB(1.2);
        System.out.println(operation.getResult());
    }
}
