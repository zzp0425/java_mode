package com.factory_simple.client;

import com.factory_simple.OperateFactory;
import com.factory_simple.father.Operation;

import java.util.Scanner;

/**
 * 工厂类
 * 理解：松耦合，封装继承多态
 * Created by zzp on 2015/12/9.
 */
public class Program {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("第一个数字：");
            double numA = scanner.nextDouble();
            System.out.println("第二个数字：");
            double numB = scanner.nextDouble();
            Operation operation = OperateFactory.createOperaion("/");
            operation.setNumA(numA);
            operation.setNumB(numB);
            double result = operation.getResult();
            System.out.println(result);
        } catch (Exception e){
            System.out.println("运行异常" + e.getMessage());
        }
    }
}