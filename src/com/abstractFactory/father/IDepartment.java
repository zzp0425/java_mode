package com.abstractFactory.father;

import com.abstractFactory.bean.Department;

/**
 * Created by zzp on 2016/1/26.
 */
public interface IDepartment {
    public void insertDepartment(Department department);
    public Department getDepartment();
}
