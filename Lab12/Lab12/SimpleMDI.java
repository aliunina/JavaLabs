package Lab12;

import javax.swing.*;

/**
 * Демонстрация работы внутренних фреймов
 *
 * @author P.A.Aliunina
 * @author Z.A.Vedrov
 * @version 1.1 02.12.2020
 */
public class SimpleMDI extends JFrame {
    //Конструктор
    public SimpleMDI() {
        super("SimpleMDI");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // создаем рабочий стол Swing
        JDesktopPane dtpDesktop = new JDesktopPane();

        // добавляем его на главный фрейм
        add(dtpDesktop);

        // создаем 3 внутренних фрейма с различным кол-вом кнопок
        JInternalFrame ifrFrame1 = new JInternalFrame("Frame1",
                true);
        JInternalFrame ifrFrame2 = new JInternalFrame("Frame2",
                true, true, true, true);
        JInternalFrame ifrFrame3 = new JInternalFrame("Frame3",
                true, true, true);

        JLabel lblLabel = new JLabel("Это для фрейма 1");
        JButton btnOK = new JButton("OK1");
        JPanel pnlPanel = new JPanel();
        pnlPanel.add(lblLabel);
        pnlPanel.add(btnOK);
        ifrFrame1.add(pnlPanel);

        // задаем размеры и расположения, делаем фрейм видимыми
        ifrFrame1.setSize(200, 100);
        ifrFrame1.setLocation(20, 100);
        ifrFrame1.setVisible(true);

        ifrFrame2.setSize(200, 60);
        ifrFrame2.setVisible(true);

        ifrFrame3.setLocation(250, 20);
        ifrFrame3.setVisible(true);

        // Добавляем внутренние фреймы на рабочий стол
        dtpDesktop.add(ifrFrame1);
        dtpDesktop.add(ifrFrame2);
        dtpDesktop.add(ifrFrame3);
        ifrFrame3.setSize(200, 120);

        // главный фрейм делаем видимым
        setVisible(true);
    }

    // Метод main
    public static void main(String[] args) {
        new SimpleMDI();
    }
}
