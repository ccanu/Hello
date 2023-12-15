package com.hspedu.tankgame4;

import java.util.Vector;

public class EnemyTank extends Tank implements Runnable{
    Vector<Shot> shots = new Vector<>();
    boolean isLive = true;
    public EnemyTank(int x, int y) {
        super(x,y);
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
