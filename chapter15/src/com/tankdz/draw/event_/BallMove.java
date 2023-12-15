package com.hspedu.draw.event_;

import java.swing.*;
import java.awt.*;

public class BallMove {
    MyPanel mp = null;
    public static void main(String[] args) {


        }
        public BallMove() {
        mp = new MyPanel();

        }

    }


//画板，可以画出小球
class MyPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(10,10,20,20);
    }
}