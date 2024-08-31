package Lab9;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

/**
 * Изучаем вспомогательные классы
 *
 * @author P.A. Aliunina
 * @author Z.A. Vedrov
 * @version 1.0
 */

public class TestSwingCommonFeatures extends JFrame {
    private JLabel createFormattedLabel(String name, Color color) {
        JLabel label = new JLabel(name);
        label.setFont(new Font(Font.SERIF, Font.BOLD, 25));
        label.setForeground(color);
        label.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        return label;
    }
    public TestSwingCommonFeatures() {
        setLayout(new GridLayout(2, 1));

        JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 2, 2));
        panel1.setBorder(new TitledBorder("Три Buttons"));
        JButton btnLeft = new JButton("Left");
        JButton btnCenter = new JButton("Center");
        JButton btnRight = new JButton("Right");
        btnLeft.setBackground(Color.WHITE);
        btnCenter.setForeground(Color.GREEN);
        btnRight.setToolTipText("Это Right button");
        panel1.add(btnLeft);
        panel1.add(btnCenter);
        panel1.add(btnRight);
        add(panel1);

        JPanel panel2 = new JPanel(new GridLayout(1, 2, 10, 0));
        panel2.setBorder(new TitledBorder("Two Labels"));
        JLabel redLabel = createFormattedLabel("Red", Color.RED);
        panel2.add(redLabel);
        JLabel orangeLabel = createFormattedLabel("Orange", Color.ORANGE);
        panel2.add(orangeLabel);
        add(panel2);
    }

    public static void main(String[] args) {
        TestSwingCommonFeatures frame = new TestSwingCommonFeatures();
        frame.setTitle("TestSwingCommonFeatures");
        frame.setSize(300, 160);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
