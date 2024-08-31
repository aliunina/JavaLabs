package Lab2;
/**
 * оператор continue не прерывает цикл
 * исключаются только действия в цикле
 * при выполнении данного условия.
 * Пример вычисления суммы чисел
 * @author P. A. Aliunina
 * @author Z. A. Vedrov
 *
 * @version 1
 */
public class ContinueTest {
    public static void main(String[] args){
        int sum = 0;
        int number = 5;
        while (number < 15){
            number++;
            if (number == 13 || number == 14) continue;
            sum += number;
            System.out.println("number = " + number +"," + " sum = " + sum);
        }
        System.out.println("The sum is " + sum);
    }
}