package com.hspedu.tankgame5;

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
        //初始化敌人坦克
        for (int i = 0; i < enemyTankSize; i++) {
            EnemyTank enemyTank = new EnemyTank((100 * (i + 1)), 0);
            //设置方向
            enemyTank.setDirect(2);
            //启动敌人坦克线程，让他动起来
            new Thread(enemyTank).start();
            //给敌人坦克加入一颗子弹
            Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60,enemyTank.getDirect());
            enemyTank.shots.add(shot);
            //启动shot对象
            new Thread(shot).start();
            enemyTanks.add(enemyTank);


        }

    }

    //编写方法，显示我方击毁敌方坦克的信息

    public void showInfo(Graphics g) {
        g.setColor(Color.black);
        Font font = new Font("宋体", Font.BOLD , 25);
        g.setFont(font);

        //drawTank();
        g.setColor(Color.yellow);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);//填充矩形
        showInfo(g);

        drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 1);
        //将hero的子弹集合shots，遍历取出绘制
        for (int i = 0; i <hero.shots.size(); i++){
            Shot shot = hero.shots.get(i);
            if (hero.shot != null && hero.shot.isLive == true) {
                g.draw3DRect(hero.shot.x, hero.shot.y, 1, 1, false);
            } else  {//如果该shot对象已经无效，就从shots集合中拿掉
                hero.shots.remove(shot);

            }
        }

        if (hero.shot != null && hero.shot.isLive == true) {
           // g.fill3DRect(hero.shot.x, hero.shot.y, 1, 1, false);
            g.draw3DRect(hero.shot.x, hero.shot.y, 1, 1, false);
        }
        for (int i = 0; i < enemyTanks.size(); i++) {
            //从Vector取出坦克
            EnemyTank enemyTank = enemyTanks.get(i);
            if (enemyTank.isLive) {
            drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 0);
            //画出enemyTank 所有子弹
            for (int j = 0; j < enemyTank.shots.size(); j++) {
                Shot shot = enemyTank.shots.get(j);
                if (shot.isLive) {
                    g.draw3DRect(shot.x, shot.y, 1, 1, false);

                } else {
                    //从Vector移除
                    enemyTank.shots.remove(shot);
                }
            }
        }

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
    public static void hitTank(Shot s , EnemyTank enemyTank) {
        //判断s击中坦克
        switch (enemyTank. getDirect()) {
            case 0://坦克向上
            case 2:
                if(s.x > enemyTank. getX() && s.x < enemyTank. getX() + 40
                        &&s.y > enemyTank.getY() && s.y < enemyTank.getY() + 60) {
                    s.isLive = false;
                    enemyTank.isLive = false;


            }
                break;
            case 1:
            case 3:
                if(s.x > enemyTank. getX() && s.x < enemyTank. getX() + 60
                        &&s.y > enemyTank.getY() && s.y < enemyTank.getY() + 40) {
                    s.isLive =false;
                    enemyTank.isLive = false;
                    //当我的子弹击中敌人坦克后，将enemyTank从Vector 拿掉

                }
                break;

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
            if (hero.shot == null && !hero.shot.isLive) {
                hero.shotEnemyTank();
            }
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
            //判断是否击中敌人坦克
            if(hero.shot != null && hero.shot.isLive) {//当我的子弹还存活
                for(int i = 0 ; i <enemyTanks.size(); i ++) {
                    EnemyTank enemyTank = enemyTanks. get(i);
                    hitTank(hero.shot, enemyTank);
                }
            }
            this.repaint();

        }
    }
}
