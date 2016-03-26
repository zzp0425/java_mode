package com.responsibility.child;

import com.responsibility.impl.Handler;

/**
 * Created by zzp on 2016/2/2.
 */
public class ConcreateHandlerC extends Handler {
    @Override
    public void handleRequest(int request) {
        if(request > 20 && request <= 30){
            System.out.println("ConcreateHandlerC success");
        } else {
            System.out.println("处理不了，去死");
        }
    }
}
