package tankgame;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    //定义我的坦克
    Hero hero = null;
    public MyPanel() {
        hero = new Hero(100,100);//初始化自己坦克
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);//填充矩形

        drawTank(hero.getX(), hero.getY(), g,0,0);
        drawTank(hero.getX() + 60, hero.getY(), g,0,1);

    }

    //画出坦克
    public void drawTank(int x ,int y,Graphics g, int direct,int type) {
        switch (type) {
            case 0://我们的坦克
                g.setColor(Color.blue);
            case 1://敌人的坦克
                g.setColor(Color.yellow);
                break;
        }
        switch (direct) {
            case 0://0表示向上
                g.fill3DRect(x,y,10,60,false);//画出坦克左边的轮子
                g.fill3DRect(x + 30,y,10,60,false);//右边轮子
                g.fill3DRect(x + 10,y + 10,20,40,false);//车身
                g.fillOval(x + 10,y + 20 , 20,20);//圆形盖子
                g.drawLine(x + 20 , y + 30 ,x + 20,y );
                break;
            default:
        }
    }
}
