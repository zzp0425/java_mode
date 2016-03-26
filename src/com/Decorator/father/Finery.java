package com.Decorator.father;

/**
 * Created by zzp on 2015/12/20.
 */
public class Finery extends Person {
    private Person person;

    public void decorator(Person person){
        if (person != null){
            this.person = person;
        }
    }
    @Override
    public void show() {
        if (person != null){
            person.show();
        }
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
