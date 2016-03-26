package com.command.client;

import com.command.impl.Command;
import com.command.service.BakeChickenCommand;
import com.command.service.BakeMuttonCommand;
import com.command.service.Barbecuer;
import com.command.service.Waiter;

/**
 * Created by zzp on 2016/2/1.
 */
public class Client {
    public static void main(String[] args) {
        Barbecuer barbecuer = new Barbecuer();//厨师
        Command command = new BakeChickenCommand(barbecuer);
        Command chicken = new BakeMuttonCommand(barbecuer);

        Waiter waiter = new Waiter();
        waiter.setOrders(command);
        waiter.setOrders(chicken);
        waiter.notifyBar();
        waiter.cancelOrder(command);
    }
}
