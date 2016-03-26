package com.command.impl;

import com.command.service.Barbecuer;

/**
 * Created by zzp on 2016/2/1.
 */
public abstract class Command {
    protected Barbecuer barbecuer;

    protected Command(Barbecuer barbecuer){
        this.barbecuer = barbecuer;
    }

    public abstract void executeCommand();
}
