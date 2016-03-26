package com.observer.child;

/**
 * Created by zzp on 2016/1/25.
 */
public class ConcreateObserverGame {
    private String name;

    public ConcreateObserverGame(){

    }

    public ConcreateObserverGame(String name){
        this.name = name;
        System.out.println(this.name + "在玩游戏");
    }

    public void stopGame() {
        System.out.println(this.name + "老师来了停止玩游戏");
    }
}
