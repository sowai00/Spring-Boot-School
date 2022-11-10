
package Listener;

import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class MyMenuBar extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem existItem;
    ImageIcon image1;
    ImageIcon image2;
    ImageIcon image3;


    MyMenuBar() throws IOException {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
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

        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        existItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        existItem.addActionListener(this);

        loadItem.setMnemonic(KeyEvent.VK_F); // alt+F for load
        saveItem.setMnemonic(KeyEvent.VK_E);// alt+E for save
        existItem.setMnemonic(KeyEvent.VK_H);// alt+H for exit
        fileMenu.setMnemonic(KeyEvent.VK_L); // l for load
        editMenu.setMnemonic(KeyEvent.VK_S);// s for save
        helpMenu.setMnemonic(KeyEvent.VK_E);// e for exit

        loadItem.setIcon(image1);
        saveItem.setIcon(image2);
        existItem.setIcon(image3);

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(existItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == loadItem) {
            System.out.println("u load a file ");

        }
        if (e.getSource() == saveItem) {
            System.out.println("u save a file ");

            if (e.getSource() == existItem) {
                System.exit(0);

            }
        }
    }



}
