package com.Decorator.father;

/**
 * Created by zzp on 2015/12/20.
 */
public class Person {
    private String name;

    public Person(){}
    public Person(String name){
        this.name = name;
        System.out.println(name + "开始着装");
    }

    public void show(){
        System.out.println(name + "着装结束");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
