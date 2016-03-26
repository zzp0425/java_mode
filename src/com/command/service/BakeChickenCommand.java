package com.command.service;

import com.command.impl.Command;
import com.command.service.Barbecuer;

/**
 * Created by zzp on 2016/2/1.
 */
public class BakeChickenCommand extends Command {

    public BakeChickenCommand(Barbecuer barbecuer){
        super(barbecuer);
    }

    @Override
    public void executeCommand() {
        barbecuer.bakeChicken();
    }

    @Override
    public String toString() {
        return "BakeChickenCommand";
    }
}
