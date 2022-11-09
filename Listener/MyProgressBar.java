package Listener;

import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.*;

public class MyProgressBar {
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();


    MyProgressBar() {
        bar.setValue(0);
        bar.setBounds(0, 0, 420, 50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli", Font.BOLD, 25));
        bar.setForeground(Color.GREEN);
        bar.setBackground(Color.BLACK);

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();

    }

    public void fill() {
        int counter = 0;
        while (counter <= 100) {
            bar.setValue(counter);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter += 10;
        }
        bar.setString("Done");
    }

}
