package Lab12;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.GroupLayout.Alignment.CENTER;
import static javax.swing.LayoutStyle.ComponentPlacement.UNRELATED;

/**
 * Демонстрация работы JToggleButton
 *
 * @author P.A.Aliunina
 * @author Z.A.Vedrov
 * @version 1.1
 */
public class ToggleButtonExample extends JFrame
        implements ActionListener {

    private JToggleButton btnRed;    // кнопка, для красной области
    private JToggleButton btnGreen;  // кнопка, для зеленной области
    private JToggleButton btnBlue;   // кнопка, для синей области
    private JPanel pnlDisplay;             // дисплей

    // Конструктор
    public ToggleButtonExample() {
        initUI();
    }

    private void initUI() {
        Container pane = getContentPane();
        // Устанавливаем GroupLayout
        GroupLayout g1 = new GroupLayout(pane);
        pane.setLayout(g1);

        btnRed = new JToggleButton("red");
        btnRed.addActionListener(this);

        btnGreen = new JToggleButton("green");
        btnGreen.addActionListener(this);

        btnBlue = new JToggleButton("blue");
        btnBlue.addActionListener(this);

        pnlDisplay = new JPanel();
        pnlDisplay.setPreferredSize(new Dimension(120, 120));
        pnlDisplay.setBorder(LineBorder.createGrayLineBorder());
        pnlDisplay.setBackground(Color.WHITE);

        // Устанавливаем автоматическую вставку пробела
        g1.setAutoCreateContainerGaps(true);
        g1.setAutoCreateGaps(true);

        // Создание горизонтальной группы
        g1.setHorizontalGroup(g1.createSequentialGroup()
                .addGroup(g1.createParallelGroup()
                        .addComponent(btnRed)
                        .addComponent(btnGreen)
                        .addComponent(btnBlue))
                .addPreferredGap(UNRELATED)
                .addComponent(pnlDisplay)
        );

        // Создание вертикальной группы
        g1.setVerticalGroup(g1.createParallelGroup(CENTER)
                .addGroup(g1.createSequentialGroup()
                        .addComponent(btnRed)
                        .addComponent(btnGreen)
                        .addComponent(btnBlue))
                .addComponent(pnlDisplay)
        );

        g1.linkSize(btnRed, btnGreen, btnBlue);

        pack();

        setTitle("JToggleButton");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Color color = pnlDisplay.getBackground(); // цвет фона дисплея
        int red = color.getRed();              // значение красного цвета на фоне дисплея
        int green = color.getGreen();          // значение зеленного цвета на фоне дисплея
        int blue = color.getBlue();            // значение синего цвета на фоне дисплея

        // проверяем какая нажата кнопка
        if (e.getActionCommand().equals("red")) {
            red = 255;
            green = 0;
            blue = 0;
        }

        if (e.getActionCommand().equals("green")) {
            red = 0;
            green = 255;
            blue = 0;
        }

        if (e.getActionCommand().equals("blue")) {
            red = 0;
            green = 0;
            blue = 255;
        }

        // устанавливаем цвета фона на основе модели RGB
        Color setCol = new Color(red,green, blue);
        pnlDisplay.setBackground(setCol);
    }

    // Метод main
    public static void main(String[] args) {
        // последовательное выполнение Runnable
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Создаем фрейм
                ToggleButtonExample ex = new ToggleButtonExample();
                ex.setVisible(true);
            }
        });
    }
}
