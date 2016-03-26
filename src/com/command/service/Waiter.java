package com.command.service;

import com.command.impl.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zzp on 2016/2/1.
 * 服务员
 */
public class Waiter {
    private List<Command> orders = new ArrayList<Command>();

    public void setOrders(Command command){

        if("BakeChickenCommand".equals(command.toString())){
            System.out.println("服务员：没有鸡翅了，请点别的");
        } else {
            orders.add(command);
            System.out.println("增加订单：烤串" );
        }
    }

    public void cancelOrder(Command command){
        orders.remove(command);
        System.out.println("取消订单：烤串" );
    }

    public void notifyBar(){
        for (Command command : orders) {
            command.executeCommand();
        }
    }
}
