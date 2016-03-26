package com.observer.father;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zzp on 2016/1/22.
 */
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    /**
     * 增加观察者
     * @param observer
     */
    public void attach(Observer observer){
        observers.add(observer);
    }

    /**
     * 删除观察者
     * @param observer
     */
    public void detach(Observer observer){
        observers.remove(observer);
    }

    public void notice(){
        for (Observer observer : observers) {
            observer.invoke();
        }
    }
}
