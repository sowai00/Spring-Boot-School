package Launch;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJOptionPane {
    MyJOptionPane() {
        // JOptionPane.showMessageDialog(null, "this is some useless info", "titile",
        // JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "this is some useless info", "titile",
        // JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "this is some useless info", "titile",
        // JOptionPane.QUESTION_MESSAGE);
        // while (true) { //forever loop
        // JOptionPane.showMessageDialog(null, "warning message", "titile",
        // JOptionPane.WARNING_MESSAGE);
        // }

        // JOptionPane.showMessageDialog(null, "error error error", "titile",
        // JOptionPane.ERROR_MESSAGE);

        // System.out.println(JOptionPane.showConfirmDialog(null, "do u love code", "title",
        // JOptionPane.YES_NO_CANCEL_OPTION)); // 0=yes 1=no 2=cancel

        // int answer = JOptionPane.showConfirmDialog(null, "do u love code", "title",
        // JOptionPane.YES_NO_CANCEL_OPTION);
        String name = JOptionPane.showInputDialog("what is you name?");
        System.out.println("hello" + name);


        String[] response = {"a", "b", "c"};
        ImageIcon icon = new ImageIcon("jax.png");
        JOptionPane.showOptionDialog(null, "You are awesome", "secret message",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, response,
                0);

    }



}
