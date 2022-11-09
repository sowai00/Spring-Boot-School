package Frame;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class MainJLabel {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("jax.png");

        Border boder = BorderFactory.createLineBorder(Color.green, 3);
        JLabel label = new JLabel();
        label.setText("bro ,do you even code?");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text left,center, right
        label.setVerticalTextPosition(JLabel.TOP); // set text top,left,center, bottom
        label.setForeground(new Color(0x00FF00));
        label.setFont(new Font("My azuki", Font.BOLD, 20));
        label.setIconTextGap(-25);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);// backgroundcolor
        label.setBorder(boder);
        // center
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        // label.setBounds(0, 0, 250, 250);


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(500, 500);
        // frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();



    }
}
