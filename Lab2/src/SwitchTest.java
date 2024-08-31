package Lab2;
import javax.swing.*; // подключаем графическую библиотеку Swing
import java.util.Scanner;
/**
 * Оператор switch:
 * в операторе switch наличие break выжно!
 * Ввод данных с использованием графического окна
 * библиотека Swing.
 * @author P. A. Aliunina
 * @author Z. A. Vedrov
 * @version 1
 */
public class SwitchTest {
    public static void main(String[] args) {
        //Для ввода данных используем графическое окно из библиотеки Swing
        //результат в переменной input типа String
        String answer = JOptionPane.showInputDialog(null, "Введите вариант ответа от 4 до 6", "Вариант ответа", JOptionPane.OK_CANCEL_OPTION);

        //конвериртируем символьную переменную input в целую variant
        int variant = Integer.parseInt(answer);

        //анализируем значение переменной variant
        switch (variant) {
            case 4:
                System.out.println("Вы выбрали первый вариант");
                break;
            case 5:
                System.out.println("Вы выбрали второй вариант");
                break;
            case 6:
                System.out.println("Вы выбрали третий вариант");
                break;
            default:
                System.out.println("Ваш выбор не соответствует заданному");
        }
    }
}