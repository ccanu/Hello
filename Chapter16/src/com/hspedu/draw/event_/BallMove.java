package com.hspedu.draw.event_;

import javax.swing.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BallMove extends JFrame{
    MyPanel mp = null;
    public static void main(String[] args) {
        BallMove ballMove = new BallMove();



    }
        public BallMove() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400,300);

        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        }

    }


//画板，可以画出小球
//KeyListener 是监听器，可以监听键盘事件
class MyPanel extends JPanel implements KeyListener {
    //为了让小球移动，把他的左上角坐标(x,y)设置变量
    int x = 10;
    int y = 10;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x,y,20,20);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
       // System.out.println((char)e.getKeyChar() + "被按下...");
        if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            y++;

        }else if (e.getKeyCode() == KeyEvent.VK_UP) {
            y--;
        }else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            x--;
        }else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            x++;
        }

        this.repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}