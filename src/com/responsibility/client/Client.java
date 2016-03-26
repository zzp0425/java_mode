package com.responsibility.client;

import com.responsibility.child.ConcreateHandlerA;
import com.responsibility.child.ConcreateHandlerB;
import com.responsibility.child.ConcreateHandlerC;
import com.responsibility.impl.Handler;

/**
 * Created by zzp on 2016/2/2.
 */
public class Client {
    public static void main(String[] args) {
        Handler handlerA = new ConcreateHandlerA();
        Handler handlerB = new ConcreateHandlerB();
        Handler handlerC = new ConcreateHandlerC();

        handlerB.setHandler(handlerC);

        handlerA.setHandler(handlerB);
        int[] request = {1, 0, 10, 20, 33, 100, -10};

        for (int i : request) {
            handlerA.handleRequest(i);
        }
    }
}
