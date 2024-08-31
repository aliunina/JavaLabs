package Lab9;

import javax.swing.*;
import java.awt.*;

/**
 * Построение графического интерфейса
 * применение панелей
 * программа создает интерфейс для
 * микроволновой печи
 *
 * @author P.A. Aliunina
 * @author Z.A. Vedrov
 * @version 1.0
 */

public class TestPanels extends JFrame {
    public TestPanels() {
        setLayout(new GridLayout(1, 2));

        JButton foodButton = new JButton("Food to be placed here");
        add(foodButton);

        JPanel interfacePanel = new JPanel();
        interfacePanel.setLayout(new BorderLayout());
        add(interfacePanel);

        JTextField displayField = new JTextField("Time to be displayed here");
        interfacePanel.add(displayField, BorderLayout.NORTH);

        JPanel buttonsPanel = new JPanel(new GridLayout(4, 3));
        for (int i = 1; i <= 9; i++) {
            buttonsPanel.add(new JButton(String.valueOf(i)));
        }
        buttonsPanel.add(new JButton("0"));
        buttonsPanel.add(new JButton("Start"));
        buttonsPanel.add(new JButton("Stop"));
        interfacePanel.add(buttonsPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        TestPanels frame = new TestPanels();
        frame.setTitle("TestPanels");
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
