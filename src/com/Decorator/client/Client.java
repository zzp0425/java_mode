package com.Decorator.client;

import com.Decorator.father.Person;
import com.Decorator.impl.TShirt;
import com.Decorator.impl.Trousers;

/**
 * Created by zzp on 2015/12/20.
 */
public class Client {
    public static void main(String[] args) {
        Person person = new Person("小白");
        Trousers trousers = new Trousers();
        TShirt shirt = new TShirt();
        trousers.decorator(person);
        shirt.decorator(trousers);
        shirt.show();
    }
}
