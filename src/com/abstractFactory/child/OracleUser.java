package com.abstractFactory.child;

import com.abstractFactory.bean.User;
import com.abstractFactory.father.IUser;

/**
 * Created by zzp on 2016/1/26.
 */
public class OracleUser implements IUser {
    @Override
    public void insertUser(User user) {
        System.out.println("oracle insert user");
    }

    @Override
    public User getUser() {
        System.out.println("oracle query user");
        return null;
    }
}
