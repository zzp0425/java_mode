package com.abstractFactory.father;

import com.abstractFactory.bean.User;

/**
 * Created by zzp on 2016/1/26.
 */
public interface IUser {
    public void insertUser(User user);
    public User getUser();
}
