package com.abstractFactory.child;

import com.abstractFactory.bean.User;
import com.abstractFactory.father.IUser;

/**
 * Created by zzp on 2016/1/26.
 */
public class SqlServerUser implements IUser {
    @Override
    public void insertUser(User user) {
        System.out.println("sql server insert user");
    }

    @Override
    public User getUser() {
        System.out.println("sql server query user");
        return null;
    }
}