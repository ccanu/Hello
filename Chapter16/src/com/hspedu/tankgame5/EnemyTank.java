package com.hspedu.tankgame5;

import java.util.Vector;

public class EnemyTank extends Tank implements Runnable {
    Vector<Shot> shots = new Vector<>();
    Vector<EnemyTank> enemyTanks = new Vector<>();
    boolean isLive = true;

    public EnemyTank(int x, int y) {
        super(x, y);
    }
    //这里提供一个方法，可以将MyPanel 的成员Vector<EnemyTank> enemyTanks = new Vector<>（）；
//设置到 EnemyTank 的成员 enemyTanks

    public void setEnemyTanks(Vector<EnemyTank> enemyTanks) {

        this.enemyTanks = enemyTanks;
    }

    //编写方法，判断当前的这个敌人坦克，是否和 enemyTanks 中的其他坦克发生的重叠或者碰撞
    public boolean isTouchEnemyTank() {
        switch (this.getDirect()) {
            case 0:
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    if (enemyTank != this) {
                        //1.如果敌人坦克是上/下 x的范围[enemyTank.getX（），enemyTank.getX（）+ 40]
                        //                   y的范围[enemyTank.getY（），enemyTank.getY（）+ 60]
                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
                            //2.当前坦克左上角的坐标[this.getX（），this.getY（）]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY() && this.getY() <= 60) {
                                return true;
                            }

                            if (this.getX() + 40 >= enemyTank.getX()
                                    && this.getX() + 40 <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY() && this.getY() <= 60) {
                                return true;
                            }

                        }
                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {
                            //2.当前坦克 右上角的坐标[this.getX（）+ 60，this.getY（）]

                            if (this.getX() + 60 >= enemyTank.getX()
                                    && this.getX() + 60 <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }
                            //3.当前坦克 右上角的坐标[this.getX（）+ 40，this.getY（）]
                            if (this.getX() + 40 >= enemyTank.getX()
                                    && this.getX() + 40 <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }


                        }
                    }
                }
                break;
            case 1:
                // 处理向右移动的情况
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    if (enemyTank != this) {
                        // TODO: 添加向右移动的碰撞检测逻辑
                    }
                }
                break;
            case 2:
                // 处理向下移动的情况
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    if (enemyTank != this) {
                        // TODO: 添加向下移动的碰撞检测逻辑
                    }
                }
                break;
            case 3:
                // 处理向左移动的情况
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    if (enemyTank != this) {
                        // TODO: 添加向左移动的碰撞检测逻辑
                    }
                }
                break;
        }
        return false;
    }



    @Override
    public void run() {
        while (true) {
            //这里我们判断如果shots size（）=0，创建一颗子弹，放入到
            if(isLive && shots.size() == 0 ) {
                Shot s =null; 

                //判断坦克的方向，创建对应的子弹
                switch (getDirect()) {
                    case 0:
                        s = new Shot(getX() + 20 , getY() ,0);
                        break;
                    case 1:
                        s = new Shot(getX() + 60 , getY() + 20 ,1);
                        break;
                    case 2:
                        s = new Shot(getX() + 20 , getY()  + 60,2);
                        break;
                    case 3:
                        s = new Shot(getX()  , getY() + 20,3);
                        break;

                }
                shots.add(s);
                new Thread(s).start();

            }



            //根据坦克的方向来继续激动
            switch (getDirect()) {
                case 0:
                    for (int i = 0; i < 30; i++) {
                        moveUp();
                        try {
                            Thread.sleep(50);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 1:
                    for (int i = 0; i < 30; i++) {
                        moveRight();
                        try {
                            Thread.sleep(50);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < 30; i++) {
                        moveDown();
                        try {
                            Thread.sleep(50);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < 30; i++) {
                        moveLeft();
                        try {
                            Thread.sleep(50);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    break;
            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //然后随机的改变坦克方向

            setDirect((int) (Math.random() * 4));
           
            if(!isLive) {
                break;
            }

        }
    }

}
