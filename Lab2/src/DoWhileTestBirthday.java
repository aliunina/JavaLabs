package Lab2;
import java.util.Scanner;
/**
 *Код выполняет суммирование целых чисел, вводимых с консоли
 *Если число соответствует дню(20) или месяцу(12) вашего рождения
 * то суммирование не проводится
 * @author P. A. Aliunina
 * @author Z. A. Vedrov
 *
 * @version 1
 */
public class DoWhileTestBirthday {
    public static void main(String[] args){
        int number;
        int sum = 0;

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Keep reading data until the input is 0
        do {
            //Read the next data
            System.out.print("Введите целое значение (выход, если ввести 20 или 12): ");
            number = input.nextInt();
            sum+= number;
        } while (number != 20 && number !=12);

        System.out.println("Сумма введеных чисел = " + sum);
        }
    }