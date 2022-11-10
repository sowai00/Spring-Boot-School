
package Listener;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyJFileChooser extends JFrame implements ActionListener {

    JButton button;


    MyJFileChooser() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());
        button = new JButton("Selection");
        button.addActionListener(this);
        this.add(button);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == button) {
            JFileChooser chooser = new JFileChooser();

            chooser.setCurrentDirectory(new File("."));
            int response = chooser.showOpenDialog(null);// selected file return 0 success 1 for
                                                        // cancal
            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(chooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }
    }



}
