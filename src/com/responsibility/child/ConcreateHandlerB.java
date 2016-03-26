package com.responsibility.child;

import com.responsibility.impl.Handler;

/**
 * Created by zzp on 2016/2/2.
 */
public class ConcreateHandlerB extends Handler {
    @Override
    public void handleRequest(int request) {
        if(request > 10 && request <= 20){
            System.out.println("ConcreateHandlerB success");
        } else {
            handler.handleRequest(request);
        }
    }
}
