package com.abstractFactory.child;

import com.abstractFactory.bean.Department;
import com.abstractFactory.father.IDepartment;

/**
 * Created by zzp on 2016/1/26.
 */
public class SqlServerDepartment implements IDepartment{

    @Override
    public void insertDepartment(Department department) {
        System.out.println("sql server insert department");
    }

    @Override
    public Department getDepartment() {
        System.out.println("sql server query department");
        return null;
    }
}