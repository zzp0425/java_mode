package com.builder.test;

import javax.swing.*;
import java.awt.*;

/**
 * Created by zzp
 * on 2016/1/19.
 */
public class Panel extends java.awt.Panel {
    private String x;
    private String y;
    public void paint(Graphics graphics){
        super.paint(graphics);
        int length = 50;
        int X = 100;
        int Y = 60;
        int len = 35;
        int wight = 200;
        graphics.drawOval(X, Y, length * 2, length * 2);

        graphics.drawLine(leftArmX(length, X), leftArmY(length, Y), X - len, Y + wight);
        graphics.drawLine(leftArmX(length, X), leftArmY(length, Y) + len,
                leftArmX(length, X), Y + wight * 3 / 2);

        graphics.drawLine(rightArmX(length, X), rightArmY(length, Y), X + length * 2 + len, Y + wight);
        graphics.drawLine(rightArmX(length, X), rightArmY(length, Y) + len,
                rightArmX(length, X), Y + wight * 3 / 2);
    }

    public static void main(String[] args) {
        JFrame jFrame = new Test();
        jFrame.setTitle("画图");
        jFrame.setSize(320, 500);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       // System.out.println(leftX(50));
    }


    /**
     * 左胳膊X坐标
     * @param length
     * @param X
     * @return
     */
    public static int leftArmX(int length, int X){
        return X + (length - getArmDistance(length));
    }

    /**
     * 左胳膊Y坐标
     * @param length
     * @param Y
     * @return
     */
    public static int leftArmY(int length, int Y){
        return Y + (length + getArmDistance(length));
    }

    /**
     * 右胳膊X坐标
     * @param length
     * @param X
     * @return
     */
    public static int rightArmX(int length, int X){
        return X + length + getArmDistance(length);
    }

    /**
     * 右胳膊Y坐标
     * @param length
     * @param Y
     * @return
     */
    public static int rightArmY(int length, int Y ){
        return leftArmY(length, Y);
    }

    /**
     * 获取距离
     * @param length
     * @return
     */
    public static int getArmDistance(int length){
        return Double.valueOf(length * Math.sqrt(0.5)).intValue();
    }

}
