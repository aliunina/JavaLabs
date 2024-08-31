package Lab9;

import javax.swing.*;
import java.awt.*;

/**
 * Построение графического интерфейса
 * менеджер компоновки FlowLayout
 *
 * @author P.A. Aliunina
 * @author Z.A. Vedrov
 * @version 1.0
 */
public class ShowFlowLayout extends JFrame {
    public ShowFlowLayout() {
        setLayout(new FlowLayout(FlowLayout.LEFT, 15, 10));

        // Добавляем labels и text fields на фрейм
        add(new JLabel("Фамилия"));
        add(new JTextField(8));
        add(new JLabel("Имя"));
        add(new JTextField(8));
        add(new JLabel("Отчество"));
        add(new JTextField(8));
    }

    public static void main(String[] args) {
        ShowFlowLayout frame = new ShowFlowLayout();
        frame.setTitle("ShowFlowLayout");
        frame.setSize(350, 150);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
