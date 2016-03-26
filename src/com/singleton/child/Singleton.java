package com.singleton.child;

/**
 * Created by zzp on 2016/1/29.
 */
public class Singleton {

    private static Singleton instance = null;

    private Singleton(){

    }

    public Singleton getInstance(){
        if(instance == null){
            synchronized(Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
