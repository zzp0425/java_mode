package com.composite.child;

import com.composite.father.Company;
import org.apache.commons.lang.StringUtils;

import java.io.File;

/**
 * Created by zzp on 2016/1/29.
 */
public class FinanceDepartment extends Company {
    public FinanceDepartment(String name){
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



        String path = "C" + File.pathSeparator + "xiaotu" + File.pathSeparator + "test.txt";
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name + "公司财务收支管理");
    }
}
