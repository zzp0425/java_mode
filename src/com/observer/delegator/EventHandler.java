package com.observer.delegator;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zzp on 2016/1/25.
 */
public class EventHandler {

    private List<Event> events;

    public EventHandler(){
        events = new ArrayList<Event>();
    }

    public void addEvent(Object object, String methodName, Object ... params){
        events.add(new Event(object, methodName, params));
    }

    public void notifyX() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        for (Event event : events) {
            event.invoke();
        }
    }

}
