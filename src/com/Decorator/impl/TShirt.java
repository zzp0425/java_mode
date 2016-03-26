package com.Decorator.impl;

import com.Decorator.father.Finery;
import com.Decorator.father.Person;

/**
 * Created by zzp on 2015/12/20.
 */
public class TShirt extends Finery {
    @Override
    public void decorator(Person person) {
        super.decorator(person);
        System.out.println("穿上T恤");
    }

}
