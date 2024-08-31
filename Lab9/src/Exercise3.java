package Lab9;

import javax.swing.*;
import java.awt.*;

/**
 * Отображение Buttons с использованием GridLayout
 *
 * @author P.A. Aliunina
 * @author Z.A. Vedrov
 * @version 1.0
 */

public class Exercise3 extends JFrame {
    public Exercise3() {
        setLayout(new GridLayout(2, 3));

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        add(button1);
        add(button2);
        add(button3);

        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        JButton button6 = new JButton("Button 6");
        add(button4);
        add(button5);
        add(button6);
    }

    public static void main(String[] args) {
        Exercise3 frame = new Exercise3();
        frame.setTitle("Exercise 3");
        frame.setSize(580, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
