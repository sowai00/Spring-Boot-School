package Frame;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.synth.ColorType;

public class MyFrame extends JFrame {
    MyFrame() {

        this.setTitle("Some this");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(420, 420);
        this.setVisible(true);
        ImageIcon image = new ImageIcon("jax.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(0, 255, 0));
    }

}
