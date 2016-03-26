package com.command.service;

import com.command.impl.Command;
import com.command.service.Barbecuer;

/**
 * Created by zzp on 2016/2/1.
 */
public class BakeMuttonCommand extends Command {

    public BakeMuttonCommand(Barbecuer barbecuer){
        super(barbecuer);
    }

    @Override
    public void executeCommand() {
        barbecuer.bakeMutton();
    }

    @Override
    public String toString() {
        return "烤串";
    }
}
