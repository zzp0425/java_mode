package com.facade.father;

import com.facade.child.SubFour;
import com.facade.child.SubOne;
import com.facade.child.SubThree;
import com.facade.child.SubTow;

/**
 * Created by zzp on 2016/1/14.
 */
public class Facade {
    private SubOne subOne;
    private SubTow subTow;
    private SubThree subThree;
    private SubFour subFour;

    public Facade(){
        this.subOne = new SubOne();
        this.subTow = new SubTow();
        this.subThree = new SubThree();
        this.subFour = new SubFour();
    }
    public void menthodA(){
        System.out.println("++++++++++methodA start+++++++++++++");
        subOne.methodOne();
        subTow.methodTow();
        subFour.methodFour();
    }
    public void methodB(){
        System.out.println("++++++++++methodB start+++++++++++++");
        subFour.methodFour();
        subTow.methodTow();
    }
}
