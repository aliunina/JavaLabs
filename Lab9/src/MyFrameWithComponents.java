package Lab9;

import javax.swing.*;
import java.awt.*;

/**
 * Программа для тестирования Frame
 * с компонентами
 *
 * @author P.A. Aliunina
 * @author Z.A. Vedrov
 * @version 1.0
 */
public class MyFrameWithComponents {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Denis 10702418");

        // Добавляем менеджер компоновки для расстановки в виде таблицы
        frame.setLayout(new GridLayout(1, 3));

        // Добавляем кнопки на фрейм
        JButton jbtOk = new JButton("OK");
        frame.add(jbtOk);
        JButton jbtNo = new JButton("NO");
        frame.add(jbtNo);
        JButton jbtCancel = new JButton("CANCEL");
        frame.add(jbtCancel);

        frame.setSize(700, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
