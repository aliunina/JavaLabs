import java.util.Scanner;
/**
 * Метод Max находит максимальное из двух.
 * Метод Min находить минимальное из двух.
 * Тип возвращаемого значения перед именем метода вместо void.
 * Написать код метода, находящего наименьшее значение из двух целых чисел и
 * печатающего его, но не возвращаемого. Метод разместить в этом же классе.
 * Написать обращение к методу и протестировать его. Напишите код ввода данных
 * с использованием консоли
 *
 * @author Aliunina P.A.
 * @version 1
 */
public class MaxTest {
    /** Main method
     * @param args some string parameter
     */
    public static void main(String[] args){
        int i = 3;
        int j = 6;

        //call method max
        int k = max(i,j);
        System.out.println("The maximum between " + i + " and " + j + " is " + k);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first value: ");
        i = input.nextInt();
        System.out.print("Enter second value: ");
        j = input.nextInt();
        min(i,j);
    }

    /**
     * Return the max between two values.
     * @param num1 first int value
     * @param num2 second int value
     * @return returned int value
     */
    public static int max(int num1, int num2){
        int result;

        if (num1 > num2)
            result = num1;
        else
            result = num2;

        return result;
    }

    // Самостоятельное задание
    /**
     * Min between two values.
     * @param num1 first int value
     * @param num2 second int value
     */
    public static void min(int num1, int num2){
        int result;

        if (num1 < num2)
            result = num1;
        else
            result = num2;

        System.out.println("The minimum between "+ num1 + " and " + num2 + " is " + result);
    }
}