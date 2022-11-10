package Complax;

import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;
import java.net.URL;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.event.MouseEvent;


public class DragPanel extends JPanel {

    ImageIcon image = new ImageIcon("jax.png");
    final int WIDTH = image.getIconWidth();
    final int HEIGHt = image.getIconHeight();
    Point imageCorner;
    Point prevPt;
    URL url;
    ImageIcon icon1;

    DragPanel() {


        try {
            url = new URL("https://source.unsplash.com/user/c_v_r/60x60");
            BufferedImage imageA = ImageIO.read(url);

            icon1 = new ImageIcon(imageA);


        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        imageCorner = new Point(0, 0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
    }

    public void paintComponent(Graphics g) {

        super.paintComponents(g);
        image.paintIcon(this, g, (int) imageCorner.getX(), (int) imageCorner.getY());

    }

    private class ClickListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            prevPt = e.getPoint();
        }
    }
    private class DragListener extends MouseMotionAdapter {
        public void mouseDragged(MouseEvent e) {
            Point currentPt = e.getPoint();
            imageCorner.translate(

                    (int) (currentPt.getX() - prevPt.getX()),
                    (int) (currentPt.getY() - prevPt.getY()));
            prevPt = currentPt;
            repaint();

        }
    }


}
