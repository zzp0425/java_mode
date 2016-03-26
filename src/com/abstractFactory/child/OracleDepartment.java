package com.abstractFactory.child;

import com.abstractFactory.bean.Department;
import com.abstractFactory.father.IDepartment;

/**
 * Created by zzp on 2016/1/26.
 */
public class OracleDepartment implements IDepartment {

    @Override
    public void insertDepartment(Department department) {
        System.out.println("orcale insert department");
    }

    @Override
    public Department getDepartment() {
        System.out.println("orcale query department");
        return null;
    }
}