package Lab9;

import javax.swing.*;
import java.awt.*;

/**
 * Отображение Buttons с использованием FlowLayout
 *
 * @author P.A. Aliunina
 * @author Z.A. Vedrov
 * @version 1.0
 */

public class Exercise1 extends JFrame {
    public Exercise1() {
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        add(panel1);

        JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        JButton button6 = new JButton("Button 6");
        panel2.add(button4);
        panel2.add(button5);
        panel2.add(button6);
        add(panel2);
    }

    public static void main(String[] args) {
        Exercise1 frame = new Exercise1();
        frame.setTitle("Exercise 1");
        frame.setSize(580, 85);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
