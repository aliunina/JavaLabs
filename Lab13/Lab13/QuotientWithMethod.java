package Lab13;

import java.util.Scanner;

/**
 * Обработка исключений
 * Здесь ошибка генерируется и обрабатывается
 * блок try - catch и throw
 *
 * @author Vedrov Z. A.
 * @author Aliunina P. A.
 * @version 1.1
 * @see QuotientWithMethod
 */
public class QuotientWithMethod {
    /**
     * Деление первого передаваемого числа на второе
     *
     * @param number1 - делимое
     * @param number2 - делитель
     * @return number1 / number2 - частное
     * @throws ArithmeticException если делитель равен нулю
     */
    public static int quotient(int number1, int number2)
        throws ArithmeticException{
        if (number2 == 0)
            throw new ArithmeticException("Ошибка! Делитель не может быть равен нулю.");
        return number1 / number2;
    }

    // Метод main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите два целых числа (через пробел): ");

        // Передача исключений вручную
        try{
            int number1 = input.nextInt();
            int number2 = input.nextInt();
            int result = quotient(number1, number2);
            System.out.println(number1 + " / " + number2 + " = "  + result);

        } catch (ArithmeticException ex) {
            System.out.println(ex);
            System.out.println("--- " + ex.getMessage() + " ---");
        } catch (Exception ex) {
            System.out.println("Ошибка ввода.Повторите ввод ");
            ex.printStackTrace();
            System.out.println("\n ex.getMessage = " + ex.getMessage());
            System.out.println("\n ex.toString = " + ex.toString());
        } finally {
            System.out.println("Выполнение продолжается ...");
        }
    }
}
