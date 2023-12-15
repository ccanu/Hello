package com.hspedu.tankgame2;

public class Tank {
    private int x;//横坐标
    private int y;//纵坐标
    private int direct;
    public void moveUp() {
        y -= 1;

    }
    public void moveRight() {
        x += 1;
    }
    public void moveDown() {
        y += 1;
    }public void moveLeft() {
        x -= 1;
    }


    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public Tank(int x , int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
