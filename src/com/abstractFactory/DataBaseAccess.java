package com.abstractFactory;

import com.abstractFactory.father.IDepartment;
import com.abstractFactory.father.IUser;

/**
 * Created by zzp on 2016/1/26.
 */
public class DataBaseAccess {

    public static final String db = "com.abstractFactory.child.Oracle";//Oracle

    public IUser getIUser() {
        try {
            return (IUser) Class.forName(db + "User").newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public IDepartment getIDepartment() {
        try {
            return (IDepartment) Class.forName(db + "Department").newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
