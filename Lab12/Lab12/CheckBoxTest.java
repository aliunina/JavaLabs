package Lab12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Демонстрация работы JCheckBox
 *
 * @author P.A.Aliunina
 * @author Z.A.Vedrov
 * @version 1.1
 */
public class CheckBoxTest {
    // Метод main
    public static void main(String[] args) {
        // Создаем фрейм
        final JFrame frame = new JFrame("JCheckBox Demo");
        // Создаем checkBoxs
        JCheckBox chbBox1 = new JCheckBox("JCheckBox №1", true);
        JCheckBox chbBox2 = new JCheckBox("JCheckBox №2");

        // Создаем и регистрируем anonymous inner class listener
        chbBox1.addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            System.out.println("CheckBox №1 выделен");
                        } else {
                            System.out.println("CheckBox №1 снято выделение");
                        }
                    }
                }
        );
        chbBox2.addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            System.out.println("CheckBox №2 выделен");
                        } else {
                            System.out.println("CheckBox №2 снято выделение");
                        }
                    }
                }
        );

        // Добавляем checkbox на панель
        JPanel pnlButtons = new JPanel(new GridLayout(2,1));
        pnlButtons.add(chbBox1);
        pnlButtons.add(chbBox2);

        // Установки для Frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,100);
        frame.getContentPane().add(pnlButtons, BorderLayout.SOUTH);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
