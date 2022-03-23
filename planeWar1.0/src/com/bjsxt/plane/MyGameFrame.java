package com.bjsxt.plane;

/**
 * 绘制窗口
 * 窗口关闭
 */

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 游戏主窗口
 */

public class MyGameFrame extends Frame {

    //初始化窗口
    public void launchFrame(){
        this.setTitle("飞机大战");
        setVisible(true);  //窗口是否可见

        setSize(500,500); //窗口大小

        setLocation(400,400);      //窗口打开的位置

        //增加关闭窗口的动作
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);  //正常退出程序
            }
        });

    }

    public static void main(String[] args) {
        MyGameFrame gameFrame = new MyGameFrame();
        gameFrame.launchFrame();
    }









}
