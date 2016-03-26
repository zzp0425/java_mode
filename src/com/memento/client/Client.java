package com.memento.client;

import com.memento.child.GameRole;
import com.memento.child.RoleManager;

/**
 * Created by zzp on 2016/1/28.
 */
public class Client {

    public static void main(String[] args) {
        GameRole role = new GameRole();
        role.instanceState();
        role.showRoleState();

        RoleManager manager = new RoleManager();
        manager.setMemento(role.saveRoleState());

        role.fighting();
        role.showRoleState();

        role.recoveryState(manager.getMemento());
        role.showRoleState();

    }
}
