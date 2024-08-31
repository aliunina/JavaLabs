package Lab9;

import javax.swing.*;
import java.awt.*;

/**
 * Отображение Buttons с использованием BorderLayout
 *
 * @author P.A. Aliunina
 * @author Z.A. Vedrov
 * @version 1.0
 */

public class Exercise2 extends JFrame {
    public Exercise2() {
        setLayout(new BorderLayout());

        JPanel panel1 = new JPanel(new BorderLayout());
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        panel1.add(button1, BorderLayout.WEST);
        panel1.add(button2, BorderLayout.CENTER);
        panel1.add(button3, BorderLayout.EAST);
        add(panel1, BorderLayout.SOUTH);

        JPanel panel2 = new JPanel(new BorderLayout());
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        JButton button6 = new JButton("Button 6");
        panel2.add(button4, BorderLayout.WEST);
        panel2.add(button5, BorderLayout.CENTER);
        panel2.add(button6, BorderLayout.EAST);
        add(panel2, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        Exercise2 frame = new Exercise2();
        frame.setTitle("Exercise 2");
        frame.setSize(580, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
