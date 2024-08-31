package Lab9;

import javax.swing.*;
import java.awt.*;

/**
 * Игра крестики-нолики
 *
 * @author P.A. Aliunina
 * @author Z.A. Vedrov
 * @version 1.0
 */

public class Exercise4 extends JFrame {
    private final ImageIcon xIcon;
    private final ImageIcon oIcon;
    private final ImageIcon emptyIcon;
    private JLabel[] labels;

    public Exercise4() {
        setLayout(new GridLayout(3, 3));
        xIcon = new ImageIcon("img/x_pic.jpg");
        oIcon = new ImageIcon("img/o_pic.jpg");
        emptyIcon = new ImageIcon("img/empty_pic.jpg");
        labels = new JLabel[9];
        for (int i = 0; i < 9; i++) {
            labels[i] = new JLabel();
            setIcon(labels[i]);
            add(labels[i]);
        }
    }

    private void setIcon(JLabel label) {
        int choice = (int) (Math.random() * 3);
        switch (choice) {
            case 1:
                label.setIcon(xIcon);
                break;
            case 2:
                label.setIcon(oIcon);
                break;
            case 0:
                label.setIcon(emptyIcon);
                break;
            default:
                System.out.println("Something's wrong");
                break;
        }
    }

    public static void main(String[] args) {
        Exercise4 frame = new Exercise4();
        frame.setTitle("Exercise 4");
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
