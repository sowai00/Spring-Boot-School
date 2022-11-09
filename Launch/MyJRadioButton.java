
package Launch;

import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class MyJRadioButton extends JFrame implements ActionListener {

    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotdogButton;

    ImageIcon image1;
    ImageIcon image2;
    ImageIcon image3;

    MyJRadioButton() throws IOException {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        URL url;
        try {
            url = new URL("https://source.unsplash.com/user/c_v_r/60x60");
            BufferedImage imageA = ImageIO.read(url);
            BufferedImage imageB = ImageIO.read(url);
            BufferedImage imageC = ImageIO.read(url);

            image1 = new ImageIcon(imageA);
            image2 = new ImageIcon(imageB);
            image3 = new ImageIcon(imageC);

        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        pizzaButton = new JRadioButton("pizza");
        hamburgerButton = new JRadioButton("hamburger");
        hotdogButton = new JRadioButton("hotdog");

        ButtonGroup group = new ButtonGroup();
        group.add(hotdogButton);
        group.add(pizzaButton);
        group.add(hamburgerButton);


        pizzaButton.setIcon(image1);
        hamburgerButton.setIcon(image2);
        hotdogButton.setIcon(image3);

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);


        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == pizzaButton) {
            System.out.println("pizza only");
        } else if (e.getSource() == hamburgerButton) {
            System.out.println("pizza only");
        } else if (e.getSource() == hotdogButton) {
            System.out.println("hotdog only");
        }
    }


}
