package com.responsibility.child;

import com.responsibility.impl.Handler;

/**
 * Created by zzp on 2016/2/2.
 */
public class ConcreateHandlerA extends Handler {
    @Override
    public void handleRequest(int request) {
        if(request > 0 && request <= 10){
            System.out.println("ConcreateHandlerA success");
        } else {
            handler.handleRequest(request);
        }
    }
}
