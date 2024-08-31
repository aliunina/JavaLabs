package Lab13;

import java.util.Scanner;

/**
 * Обработка исключений
 * здесь ошибка генерируется и обрабатывается
 * блок try - catch и throw
 *
 * @author Vedrov Z. A.
 * @author Aliunina P. A.
 * @version 1.1
 * @see QuotientWithException
 */
public class QuotientWithException {
    /** Умножение положительного числа на 10
     *
     * @param n - положительное число (множитель)
     * @return 10 * n - произведение
     * @throws IllegalAccessException если число отрицательное.
     */
    public static double multiplicationByTen(double n)
            throws IllegalAccessException{
        if (n <= 0) {
            throw new IllegalAccessException("Ошибка! Введено неверное значение.");
        }
        return 10 * n;
    }

    // Метод main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Подсказка пользователю вводить данные
        System.out.print("Введите два целых числа (через пробел): ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        // Передача исключений вручную
        try {
            // ArithmeticException
            if (number2 == 0)
                throw new ArithmeticException("Ошибка! Делитель не может быть равен нулю.");
            System.out.println(number1 + " / " + number2 +
                    " = " + (number1 / number2));

            // ArrayIndexOutOfBoundsException
            int numbers[] = new int[2];
            numbers[0] = number1;
            numbers[1] = number2;
            System.out.print("Введите индекс массива numbers: ");
            int index = input.nextInt();
            if (index > numbers.length || index < 0) {
                throw new ArrayIndexOutOfBoundsException("Ошибка! Выход за пределы массива.");
            } else {
                System.out.println("numbers[" + index + "] = " + numbers[index]);
            }

            // ClassCastException
//            Object obj = Integer.valueOf(2);
//            String str = (String) obj;

            // IllegalAccessException
            System.out.print("Введите положительное число для умножения: ");
            double x = input.nextDouble();
            double result = multiplicationByTen(x);
            System.out.println(10 + " * n = " + result);

        } catch (ArithmeticException ex) {
            System.out.println(ex);
            System.out.println("--- " + ex.getMessage() + " ---");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
            System.out.println("--- " + ex.getMessage() + " ---");
        } catch (ClassCastException ex) {
            System.out.println("Исключение: неверное приведение типов.");
            System.out.println(ex);
            System.out.println("--- " + ex.getMessage() + " ---");
        } catch (IllegalAccessException ex) {
            System.out.println(ex);
            System.out.println("--- " + ex.getMessage() + " ---");
        } finally {
            System.out.println("Выполнение программы продолжается...");
        }
    }
}
