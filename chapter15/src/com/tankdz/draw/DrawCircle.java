package com.hspedu.draw;

import javax.swing.*;
import java.awt.*;
@SuppressWarnings({"all"})
public class DrawCircle extends JFrame{

    private MyPanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();

    }

    public DrawCircle() {
        //初始化
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
//説明：
///1.マイパネルオブジェクトはアートボードです
//2.Graphics g g gはgを1本のブラシと理解する
//3.Graphicsは多くの描画方法を提供しています
//Graphics g
class MyPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //g.drawOval(10,10,100,100);
      //  g.setColor(Color.yellow);
      //  g.fillRect(10,10,100,100);

        //画像リソースの取得
        // = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/ayz.webp"));
        //g.drawImage(image,10,10,1600,2000,this);
        g.setColor(Color.red);
        g.setFont(new Font("隶书",Font.BOLD,50));
        g.drawString("安宥真",100,100);
    }
}