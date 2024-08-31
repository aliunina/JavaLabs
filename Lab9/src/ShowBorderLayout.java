package Lab9;

import javax.swing.*;
import java.awt.*;

/**
 * Построение графического интерфейса
 * менеджер компоновки BorderLayout
 *
 * @author P.A. Aliunina
 * @author Z.A. Vedrov
 * @version 1.0
 */
public class ShowBorderLayout extends JFrame {
    public ShowBorderLayout() {
        setLayout(new BorderLayout(10, 15));

        // Добавляем кнопки на фрейм
        add(new JButton("Table"), BorderLayout.EAST);
        add(new JButton("Chair"), BorderLayout.SOUTH);
        add(new JButton("Phone"), BorderLayout.WEST);
        add(new JButton("Window"), BorderLayout.NORTH);
        add(new JButton("Me"), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        ShowBorderLayout frame = new ShowBorderLayout();
        frame.setTitle("ShowBorderLayout");
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
