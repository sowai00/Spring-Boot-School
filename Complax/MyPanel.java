package Complax;

import java.awt.*;
import javax.swing.*;

public class MyPanel extends JFrame {
    Image image;

    MyPanel() {
        image = new ImageIcon("jax.png").getImage();
        this.setPreferredSize(new Dimension(500, 500));
    }

    public void paint(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        // g2d.setPaint(Color.BLUE);
        // g2d.setStroke(new BasicStroke(5));
        // g2d.drawLine(0, 0, 500, 500);
        g2d.setPaint(Color.PINK);
        g2d.drawRect(0, 0, 100, 200);
        g2d.fillRect(0, 0, 100, 200);
        // g2d.setPaint(Color.ORANGE);
        // g2d.drawOval(0, 0, 100, 100);
        // g2d.fillOval(0, 0, 100, 100);

        // g2d.setPaint(Color.RED);
        // g2d.drawArc(0, 0, 100, 100, 0, 180);
        // g2d.setPaint(Color.WHITE);
        // g2d.drawArc(0, 0, 100, 100, 180, 180);

        // int[]xPoints={150,250,350};
        // int[]yPoints={300,150,300};
        // g2d.setPaint(Color.YELLOW);
        // g2d.drawPolygon(xPoints,yPoints,3);
        // g2d.fillPolygon(xPoints,yPoints,3);

        // g2d.setPaint(Color.magenta);
        // g2d.setFont(new Font("Ink Free", Font.BOLD, 50));
        // g2d.drawString("U R A Winner", 50, 50);

        // g2d.drawImage(image, 0, 0, null);

    }

}
