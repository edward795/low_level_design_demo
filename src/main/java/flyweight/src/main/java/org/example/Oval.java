package org.example;

import java.awt.*;

public class Oval implements Shape{
    private boolean fill;

    public Oval(boolean fill) {
        this.fill = fill;
        System.out.println("Creating Oval Object with fill="+fill);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void draw(Graphics g, int x, int y, int width, int height, Color color) {
        g.setColor(color);
        g.drawOval(x,y,width,height);
        if(fill){
            g.fillOval(x,y,width,height);
        }
    }
}
