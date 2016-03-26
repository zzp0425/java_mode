package com.observer.client;

import com.observer.child.ConcreateObserver;
import com.observer.child.ConcreateObserverGame;
import com.observer.child.ConcreateSubject;
import com.observer.delegator.Event;
import com.observer.delegator.EventHandler;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by zzp on 2016/1/25.
 */
public class Client {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//        ConcreateSubject subject = new ConcreateSubject();
//        subject.attach(new ConcreateObserver(subject, "X"));
//        subject.attach(new ConcreateObserver(subject, "Y"));
//        subject.attach(new ConcreateObserver(subject, "Z"));
//
//        subject.setSubjectState("ABC");
//        subject.notice();

        EventHandler handler = new EventHandler();
        handler.addEvent(new ConcreateObserver("小明"), "wakeUp", null);
        handler.addEvent(new ConcreateObserverGame("小红"), "stopGame", null);
        handler.notifyX();
    }
}
