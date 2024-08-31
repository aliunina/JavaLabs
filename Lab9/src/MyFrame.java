package Lab9;

import javax.swing.*;
import java.awt.*;

/**
 * Программа для тестирования Frame
 *
 * @author P.A. Aliunina
 * @author Z.A. Vedrov
 * @version 1.0
 */
public class MyFrame {
    public static void main(String[] args) {
        // Создаем фрейм
        JFrame frame = new JFrame("Aliunina 10702121");
        // Устанавливаем размеры фрейма
        frame.setSize(900, 400);
        // Центрируем
        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Визуализируем фрейм
        frame.setVisible(true);

        JComponent c4 = new JButton();
        Container c5 = new JButton();
        c5.add(c4);
        Object c6 = new JButton();
        c5.add
    }
}
