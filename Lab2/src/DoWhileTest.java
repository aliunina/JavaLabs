package Lab2;
import java.util.Scanner;

/**
 *Вычисление суммы чисел.
 *do-while цикл.
 *
 * @author P. A. Aliunina
 * @author Z. A. Vedrov
 *
 * @version 1
 */
public class DoWhileTest {
    public static void main(String[] args){
        int data;
        int sum = 0;

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Keep reading data until the input is 0
        do {
            //Read the next data
            System.out.print("Введите целое значение (выход, если ввести 0): ");
            data = input.nextInt();
            sum+= data;
        } while (data != 0);

        System.out.println("Сумма введеных чисел = " + sum);
    }
}