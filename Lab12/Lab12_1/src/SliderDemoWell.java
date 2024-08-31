import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

/**
 *  Демонстрация работы Slider
 *
 * @author P.A.Aliunina
 * @author Z.A.Vedrov
 * @version 1.1
 */
public class SliderDemoWell extends JFrame {

    // Конструктор
    public SliderDemoWell() {
        // Вызываем конструктор суперкласса JFrame
        super ("JSlider Demo");

        // create a slider min = 0, max = 50, value = 25
        final JSlider jslSlider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
        // Определение расстояния для прорисовки промежуточных делений с интервалом 1
        jslSlider.setMinorTickSpacing(1);
        // Определение расстояния для прорисовки больших делений с интервалом 5
        jslSlider.setMajorTickSpacing(5);
        // Прорисовки делений
        jslSlider.setPaintTicks(true);
        // Прорисовка меток под большими делениями
        jslSlider.setPaintLabels(true);
        // создаем Hashtable числовых текстовых меткок с приращением 10
        jslSlider.setLabelTable(jslSlider.createStandardLabels(10));

        // Устанавливаем FlowLayout
        setLayout(new FlowLayout());
        // Извлекаем слой панели содержимого для добавления slider
        getContentPane().add(jslSlider);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Устанавливаем размерность фрейма
        setSize(300, 200);
        // Центрируем
        setLocationRelativeTo(null);
        // Визуализируем
        setVisible(true);

        // Создаем и регистрируем anonymous inner class listner
        jslSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.println("Current Value = " + jslSlider.getValue());
            }
        });
    }

    // Метод main
    public static void main(String[] args) {
        // Вызыв конструктора класса SliderDemoWell
        new SliderDemoWell();
    }
}
