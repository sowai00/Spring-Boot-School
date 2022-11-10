
package Listener;

import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class KeyControllor extends JFrame implements KeyListener {

    JButton button;
    JLabel label;
    URL url;
    ImageIcon icon1;

    KeyControllor() throws IOException {


        try {
            url = new URL("https://source.unsplash.com/user/c_v_r/60x60");
            BufferedImage imageA = ImageIO.read(url);

            icon1 = new ImageIcon(imageA);


        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.addKeyListener(this);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setIcon(icon1);
        // label.setBackground(Color.RED);
        // label.setOpaque(true);
        this.getContentPane().setBackground(Color.black);

        this.add(label);
        this.setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        switch (e.getKeyChar()) {
            case 'a':
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 'd':
                label.setLocation(label.getX() + 10, label.getY());
                break;
            case 's':
                label.setLocation(label.getX(), label.getY() + 10);
                break;
            case 'w':
                label.setLocation(label.getX(), label.getY() - 10);
                break;
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        switch (e.getKeyCode()) {
            case 37:
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 28:
                label.setLocation(label.getX() + 10, label.getY());
                break;
            case 39:
                label.setLocation(label.getX(), label.getY() + 10);
                break;
            case 40:
                label.setLocation(label.getX(), label.getY() - 10);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        // System.out.println("you pressed " + e.getKeyChar());
        System.out.println("you pressed " + e.getKeyCode());
    }



}
