package com.composite.child;

import com.composite.father.Company;
import org.apache.commons.lang.StringUtils;

/**
 * Created by zzp on 2016/1/29.
 */
public class HRDepartment extends Company {

    public HRDepartment(String name){
        super(name);
    }
    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int depth) {
        System.out.println(StringUtils.rightPad("", depth, "-") + this.name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name + "员工招聘培训管理");
    }
}
