package com.hspedu.tankgame3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

public class MyPanel extends JPanel  implements KeyListener ,Runnable {
    //定义我的坦克
    Hero hero = null;
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTankSize = 3;

    public MyPanel() {
        hero = new Hero(100, 100);
        //初始化自己坦克
        for (int i = 0; i < enemyTankSize; i++) {
            enemyTanks.add(new EnemyTank((100 * (i + 1)), 0));
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);//填充矩形

        drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 1);
        if (hero.shot != null && hero.shot.isLive == true) {
           // g.fill3DRect(hero.shot.x, hero.shot.y, 1, 1, false);
            g.draw3DRect(hero.shot.x, hero.shot.y, 1, 1, false);
        }
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 0);

        }


    }

    //画出坦克
    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        switch (type) {
            case 0://我们的坦克
                g.setColor(Color.cyan);
            case 1://敌人的坦克
                g.setColor(Color.yellow);
                break;
        }

        switch (direct) {
            case 0://0表示向上
                g.fill3DRect(x, y, 10, 60, false);//画出坦克左边的轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//车身
                g.fillOval(x + 10, y + 20, 20, 20);//圆形盖子
                g.drawLine(x + 20, y + 30, x + 20, y);
                break;
            case 1://表示向坐
                g.fill3DRect(x, y, 60, 10, false);//画出坦克左边的轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//右边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//车身
                g.fillOval(x + 20, y + 10, 20, 20);//圆形盖子
                g.drawLine(x + 30, y + 20, x + 60, y + 20);
                break;
            case 2://0表示向下
                g.fill3DRect(x, y, 10, 60, false);//画出坦克左边的轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//车身
                g.fillOval(x + 10, y + 20, 20, 20);//圆形盖子
                g.drawLine(x + 20, y + 30, x + 20, y + 60);
                break;
            case 3://表示向坐
                g.fill3DRect(x, y, 60, 10, false);//画出坦克左边的轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//右边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//车身
                g.fillOval(x + 20, y + 10, 20, 20);//圆形盖子
                g.drawLine(x + 30, y + 20, x, y + 20);
                break;
            default:
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            hero.setDirect(0);
            hero.moveUp();
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            hero.setDirect(1);
            hero.moveRight();
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            hero.setDirect(2);
            hero.moveDown();
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            hero.setDirect(3);
            hero.moveLeft();
        }
        if (e.getKeyCode() == KeyEvent.VK_J) {
            hero.shotEnemyTank();
        }
        this.repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.repaint();

        }
    }
}
