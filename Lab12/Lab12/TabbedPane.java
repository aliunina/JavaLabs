package Lab12;

import javax.swing.*;
import java.awt.*;

/**
 * Демонстрация работы TabbedPane
 *
 * @author P.A.Aliunina
 * @author Z.A.Vedrov
 * @version 1.1
 */
public class TabbedPane extends JFrame {
    public TabbedPane() {
        super("This is example for JTabbedPane");
        JTabbedPane tbpTabPane = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.WRAP_TAB_LAYOUT);

        for (int i = 1; i <= 5; i++) {
            JPanel pnlPanel = new JPanel();
            // Устанавливаем GridLayout, 2 (3 для нечетных) строки, 2 столбца
            pnlPanel.setLayout(new GridLayout(2 + i % 2,1));
            pnlPanel.add(new JButton("Button № " + i));
            if (i % 2 == 1) {
                pnlPanel.add(new JLabel("This is panel number " + i));
                pnlPanel.add(new JCheckBox("JCheckBox №" + i));
            } else{
                pnlPanel.add(new JCheckBox("JCheckBox №" + i), true);
            }
            tbpTabPane.add("Panel" + i, pnlPanel);
        }

        tbpTabPane.add(new JLabel("Simple Text"), 0);

        getContentPane().add(tbpTabPane);
        setSize(400, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Метод main
    public static void main(String[] args) {
        new TabbedPane();
    }
}
