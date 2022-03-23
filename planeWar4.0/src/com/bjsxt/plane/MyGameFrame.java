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



    Image plane = GameUtil.getImage("images/plane.png");
    Image bg = GameUtil.getImage("images/bj.jpg");

    static int count = 0;

    int planeX = 100;

    @Override
    public void paint(Graphics g) {     //g当作是一支画笔

        System.out.println("绘制窗口次数："+count);
        count++;

       g.drawImage(bg,0,0,500,500,null);
       g.drawImage(plane,planeX,100,22,33,null);

       planeX+=1;

    }

    //初始化窗口
    public void launchFrame(){
        this.setTitle("飞机大战");
        setVisible(true);  //窗口是否可见

        setSize(Constant.GAME_WIDTH,Constant.GAME_HEIGHT); //窗口大小

        setLocation(400,400);      //窗口打开的位置

        //增加关闭窗口的动作
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);  //正常退出程序
            }
        });

        new PaintThread().start();   //启动重画窗口的线程

    }

    /**
     * 定义了一个重画窗口的线程类。
     * 定义成内部类是为了方便直接使用窗口类的相关方法
     */

    class PaintThread extends Thread{
        @Override
        public void run() {
            while(true){
                repaint(); // 内部类可以直接使用外部类的成员！

                try {
                    Thread.sleep(50);  //1s=1000ms, 1s画20次（20*50=1000）
                }catch (InterruptedException e){
                    e.printStackTrace();
                }


            }
        }
    }

    private Image offScreenImage = null;

    public void update(Graphics g) {
        if(offScreenImage == null)
            offScreenImage = this.createImage(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);//这是游戏窗口的宽度和高度
        Graphics gOff = offScreenImage.getGraphics();
        paint(gOff);
        g.drawImage(offScreenImage, 0, 0, null);
    }


    //程序执行入口
    public static void main(String[] args) {
        MyGameFrame gameFrame = new MyGameFrame();
        gameFrame.launchFrame();
    }
    
}
