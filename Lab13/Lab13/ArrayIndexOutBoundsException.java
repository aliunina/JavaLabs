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
 * @see ArrayIndexOutBoundsException
 */
public class ArrayIndexOutBoundsException {
    /**
     * Вывод элемента массива с определенным индексом
     * 
     * @param index - индекс массива numbers
     * @param numbers - массив целых чисел
     * @throws ArrayIndexOutOfBoundsException если произойдет выход
     *                                        за пределы массива
     */
    public static void arrayElementOutput(int index, int numbers[])
            throws ArrayIndexOutOfBoundsException{
        if (index > numbers.length || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Ошибка! Выход за пределы массива");
        } else {
            System.out.println("numbers[" + index + "] = " + numbers[index]);
        }
    }

    // Метод main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // создаем массив целых чисел из 100 элементов
        int numbers[] = new int[100];

        /*
         Заполняем массив случайно сгенерированными значениями
         в промежутке (0; 100]
         */
        for (int i = 0; i < 100; i++) {
            numbers[i] = (int)(1 + Math.random() * 100);
        }

        // Передача исключений вручную
        try {
            // ArrayIndexOutOfBoundsException
            System.out.print("Enter the index for massive of numbers (от 0 до 99): ");
            int index = input.nextInt();
            arrayElementOutput(index, numbers);

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("--- " + ex.getMessage() + " ---");
        } finally {
            System.out.println("The program continues to execute...");
        }
    }
}
