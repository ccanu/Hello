package com.hspedu.tankgame3;

import javax.swing.*;

public class HspTankGame03 extends JFrame {
    MyPanel mp = null;
    public static void main(String[] args) {

        HspTankGame03 hspTankGame01 = new HspTankGame03();

    }

    public HspTankGame03() {
        mp = new MyPanel();
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);
        this.setSize(1000,750);
        this.addKeyListener(mp);//让JFrame监听mp的键盘事件
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);


    }

}
