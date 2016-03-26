package com.observer.child;

import com.observer.father.Observer;

/**
 * Created by zzp on 2016/1/25.
 */
public class ConcreateObserver {
    private String name;

    public ConcreateObserver(){

    }

    public ConcreateObserver(String name){
        this.name = name;
        System.out.println(this.name + "在睡觉");
    }

    public void wakeUp() {
        System.out.println(this.name + "老师来了睡醒起床");
    }


}
