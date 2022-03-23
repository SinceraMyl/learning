package com.bjsxt.plane;

/**
 * 绘制窗口
 * 窗口关闭
 */

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 游戏主窗口
 */

public class MyGameFrame extends Frame {

    Image planeImg = GameUtil.getImage("images/plane.png");  //导入飞机图片
    Image bg = GameUtil.getImage("images/bj.jpg");           //导入背景图片

    Plane p1 = new Plane(planeImg,100,100,7);


    Shell[] shells = new Shell[5];



    @Override
    public void paint(Graphics g) {     //g当作是一支画笔


       g.drawImage(bg,0,0,500,500,null);

        p1.drawMyself(g);

        //画炮弹
        for (int i=0;i<shells.length;i++) {
            shells[i].drawMyself(g);

            //碰撞检测，将所有得炮弹和飞机进行矩形检测，看有没有碰撞
            boolean peng = shells[i].getRec().intersects(p1.getRec());
            if(peng){
                // System.out.println("飞机被击中了！！");
                p1.live = false;
            }


        }
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

        this.addKeyListener(new KeyMonitor()); //启动键盘监听

        //初始化创建50个炮弹对象
        for (int i=0;i<50;i++){
            shells[i] = new Shell();
        }


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

    //内部类，实现键盘的监听处理
    class KeyMonitor extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {
            //System.out.println("按下"+e.getKeyCode());

            p1.addDirection(e);

            /**
             * 用if完成键盘上下左右键控制
            if(e.getKeyCode()==KeyEvent.VK_LEFT){
                left = true;
            }
            if (e.getKeyCode()==KeyEvent.VK_RIGHT){
                right = true;
            }
            if (e.getKeyCode()==KeyEvent.VK_UP){
                up = true;
            }
            if (e.getKeyCode()==KeyEvent.VK_DOWN){
                down = true;
            }
             */
        }

        @Override
        public void keyReleased(KeyEvent e) {

            //System.out.println("抬起"+e.getKeyCode());

            p1.minusDirection(e);

            /**
             *  用if完成键盘上下左右控制

            if(e.getKeyCode()==KeyEvent.VK_LEFT){
                left = false;
            }
            if (e.getKeyCode()==KeyEvent.VK_RIGHT){
                right = false;
            }
            if (e.getKeyCode()==KeyEvent.VK_UP){
                up = false;
            }
            if (e.getKeyCode()==KeyEvent.VK_DOWN){
                down = false;
            }
             */

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

