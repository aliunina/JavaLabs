package Lab12;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;
import java.util.Date;

/**
 * Демонстрация работы Spinner
 *
 * @author P.A.Aliunina
 * @author Z.A.Vedrov
 * @version 1.1 02.12.2020
 */
public class SpinnerTest {

    // Метод main
    public static void main(String[] args) {
        // Создаем фрейм
        JFrame frame = new JFrame("JSpinnerDemo");

        // Spinner with number
        SpinnerNumberModel snm = new SpinnerNumberModel(8, 0, 100, 10);
        JSpinner spnNumber = new JSpinner(snm);

        // Spinner with Dates
        SpinnerModel snd = new SpinnerDateModel(
                new Date(),
                null,
                null,
                Calendar.DAY_OF_MONTH
        );
        JSpinner spnDate = new JSpinner(snd);

        // Spinner with List
        String[] colors = {"Green", "Red", "Blue"};
        SpinnerModel snl = new SpinnerListModel(colors);
        JSpinner spnList = new JSpinner(snl);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 100);

        Container cont = frame.getContentPane();

        // Устанавливаем FlowLayout
        cont.setLayout(new FlowLayout());

        cont.add(new JLabel("Select Number: "));
        cont.add(spnNumber);

        cont.add(new JLabel("Select Date: "));
        cont.add(spnDate);

        cont.add(new JLabel("Select Color: "));
        cont.add(spnList);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
