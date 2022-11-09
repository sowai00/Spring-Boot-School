package JButton;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;

    MyFrame() {
        ImageIcon icon = new ImageIcon("jax.png");
        ImageIcon icon2 = new ImageIcon("jax.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);


        JButton button = new JButton();
        button.setBounds(200, 100, 700, 750);
        button.setText("i am a button");
        button.addActionListener(e -> System.out.println("poo"));
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(-15);
        button.setForeground(Color.CYAN);
        button.setBackground(Color.LIGHT_GRAY);
        button.setBorder(BorderFactory.createEmptyBorder());



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        if (e.getSource() == button) {
            // System.out.println("poo");
            button.setEnabled(true);
        }
    }

}


