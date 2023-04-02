package com.mashibing.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author raoyalong
 * @create 2023 - 04 - 03 0:17
 */
public class TankFrame extends Frame {

    int x = 200;
    int y = 200;
    public TankFrame() {
        setSize(800,600);
        setResizable(false);
        setTitle("tank war");
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        System.out.println("调用paint方法");
        g.fillRect(x,y,50,50);
        x += 20;
        y += 20;
    }
}
