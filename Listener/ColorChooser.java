
package Listener;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChooser extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    ColorChooser() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        button = new JButton("pick a color");
        button.addActionListener(this);

        label = new JLabel();
        label.setBackground(Color.WHITE);
        label.setText("some text");
        label.setFont(new Font("MV Boli", Font.PLAIN, 100));
        label.setOpaque(true);

        this.add(button);
        this.add(label);

        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == button) {
            JColorChooser chooser = new JColorChooser();

            Color color = JColorChooser.showDialog(null, "pick a acolor", Color.black);
            // label.setForeground(color);
            label.setBackground(color);
        }
    }



}
