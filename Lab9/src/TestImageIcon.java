package Lab9;

import javax.swing.*;
import java.awt.*;

/**
 * Размещение картинок на JButton, JLabel
 * картинки разных форматов в папке image
 *
 * @author P.A. Aliunina
 * @author Z.A. Vedrov
 * @version 1.0
 */

public class TestImageIcon extends JFrame {
    private ImageIcon pic1 = new ImageIcon("img/1.jpg");
    private ImageIcon pic2 = new ImageIcon("img/2.jpg");
    private ImageIcon pic3 = new ImageIcon("img/3.png");
    private ImageIcon pic4 = new ImageIcon("img/4.png");

    public TestImageIcon() {
        setLayout(new GridLayout(3, 2, 5, 5));
        JLabel label = new JLabel("Java Swing Label Demo", JLabel.CENTER);
        add(label);
        add(new JLabel(pic1));
        add(new JLabel(pic2));
        JLabel label2 = new JLabel("Label + Icon + Text");
        label2.setIcon(pic3);
        add(label2);
        add(new JButton(pic4));
    }

    public static void main(String[] args) {
        TestImageIcon frame = new TestImageIcon();
        frame.setTitle("TestImageIcon");
        frame.setSize(1400, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
