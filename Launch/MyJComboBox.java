
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

public class MyJComboBox extends JFrame implements ActionListener {

    ImageIcon image1;
    ImageIcon image2;
    ImageIcon image3;
    JComboBox comboBox;

    MyJComboBox() throws IOException {
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
        String[] animals = {"dog", "cat", "bird"};

        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);

        // comboBox.setEditable(true);
        // System.out.println(comboBox.getItemCount());
        // comboBox.addItem("horse");
        // comboBox.insertItemAt("pig", 0);
        // comboBox.setSelectedIndex(0);
        // comboBox.removeItem("cat");
        // comboBox.removeItemAt(0);
        comboBox.removeAllItems();


        this.add(comboBox);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == comboBox) {
            System.out.println(comboBox.getSelectedIndex());
        }
    }


}
