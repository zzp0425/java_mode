package com.abstractFactory.client;

import com.abstractFactory.DataBaseAccess;
import com.abstractFactory.bean.Department;
import com.abstractFactory.bean.User;
import com.abstractFactory.father.IDepartment;
import com.abstractFactory.father.IUser;

/**
 * Created by zzp on 2016/1/26.
 */
public class Client {
    public static void main(String[] args) {
        DataBaseAccess dba = new DataBaseAccess();
        IUser iUser = dba.getIUser();
        IDepartment iDepartment = dba.getIDepartment();
        iDepartment.insertDepartment(new Department());
        iDepartment.getDepartment();
        iUser.insertUser(new User());
        iUser.getUser();
    }
}
