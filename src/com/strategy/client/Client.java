package com.strategy.client;

import com.strategy.CashContext;

/**
 * Created by zzp on 2015/12/14.
 */
public class Client {
    private double total = 0.0;

    public void btnClick(String type, String price, String num){
        CashContext cc = new CashContext(type);
        double totalPrice = 0.0;
        totalPrice = cc.getResult(Double.valueOf(price) * Double.valueOf(num));
        total += totalPrice;
        System.out.println("单价：" + price + ", 数量：" + num + ", 合计：" + totalPrice);
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.btnClick("0", "100", "20");
        client.btnClick("1", "100", "20");
        client.btnClick("2", "100", "20");
    }
}
