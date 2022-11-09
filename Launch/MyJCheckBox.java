
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

public class MyJCheckBox extends JFrame implements ActionListener {

    JButton button;
    JCheckBox checkBox;
    ImageIcon image1;
    ImageIcon image2;

    MyJCheckBox() throws IOException {

        URL url;
        try {
            url = new URL("https://source.unsplash.com/user/c_v_r/100x100");
            BufferedImage c = ImageIO.read(url);
            BufferedImage a = ImageIO.read(url);
            image1 = new ImageIcon(c);
            image2 = new ImageIcon(a);
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // jXImageView1.setImage(image);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        // image1 = new ImageIcon("jax.png");
        // image2 = new ImageIcon("jax.png");

        button = new JButton();
        button.setText("Submit");
        button.addActionListener(this);

        JCheckBox checkBox = new JCheckBox();
        checkBox.setText("i am not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Arial", Font.PLAIN, 35));
        checkBox.setIcon(image1);
        checkBox.setSelectedIcon(image2);


        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == button) {
            System.out.println(checkBox.isSelected());
        }
    }


}
