
package Listener;

import java.awt.*;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouseOver extends JFrame implements MouseListener {

    JButton button;
    JLabel label;

    MyMouseOver() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.RED);
        label.setOpaque(true);
        label.addMouseListener(this);

        // this.add(button);
        this.add(label);
        this.setVisible(true);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Clicked");
        label.setBackground(Color.BLACK);

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Released");
        label.setBackground(Color.GREEN);

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Entered");// when mouse on
    }

    @Override
    public void mouseExited(MouseEvent e) {// when mouse out
        System.out.println("Exited");
    }
}
