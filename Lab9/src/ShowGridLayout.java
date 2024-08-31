package Lab9;

import javax.swing.*;
import java.awt.*;

/**
 * Построение графического интерфейса
 * менеджер компоновки GridLayout
 *
 * @author Denis
 * @version 1.0
 */
public class ShowGridLayout extends JFrame {
    public ShowGridLayout() {
        setLayout(new GridLayout(3, 2, 10, 10));

        // Add labels and text fields to the frame
        add(new JLabel("Фамилия"));
        add(new JTextField(8));
        add(new JLabel("Имя"));
        add(new JTextField(1));
        add(new JLabel("Отчество"));
        add(new JTextField(8));
    }

    public static void main(String[] args) {
        ShowGridLayout frame = new ShowGridLayout();
        frame.setTitle("ShowGridLayout");
        frame.setSize(200, 125);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
