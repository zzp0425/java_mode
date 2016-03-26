package com.responsibility.impl;

/**
 * Created by zzp on 2016/2/2.
 */
public abstract class Handler {
    public Handler handler;

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public abstract void handleRequest(int request);
}
