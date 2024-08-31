package Lab2;
import java.util.Scanner;
/**
 * Ввод данных с консоли с использованием Scanner
 * Конструкции для
 * operator if:
 * - one-way
 * - two-way
 * - nested
 * @author P. A. Aliunina
 * @author Z. A. Vedrov
 * @version 1
 */
public class IfTestSmall {
    public static void main(String[] arg) {

        //Создаем экземпляр класса для Scanner для ввода
        Scanner input = new Scanner(System.in);

        System.out.print("Введите целое значение x : ");
        int x = input.nextInt();

        System.out.print("Введите целое значение y : ");
        int y = input.nextInt();

        //Вариант 1 - one-way
        if (x > y)
            System.out.println("x больше y");
        System.out.println();
        //Вариант 2 - one-way
        if (x > y) {
            System.out.println("x больше y");
            System.out.println("Разность x - y = " + (x - y));
            System.out.println();
        }

        //two-way
        if (x > y) {
            System.out.println("x больше y");
            System.out.println("Разность x - y = " + (x - y));
        } else {
            System.out.println("x больше или равно y");
        }
    }
}

