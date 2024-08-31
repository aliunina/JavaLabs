package Lab2;
/**
 * break оператор
 * используется для выхода из цикла
 * в данном случае за пределы цикла
 * Пример суммирования чисел по условию
 *
 * @author P. A. Aliunina
 * @version 1
 */
public class BreakeTest {
    public static void main(String[] args){
        int sum = 0;
        int number = 50;

        while(number > 10){
            number--;
            sum += number;
            //выход из цикла при выполнении условия
            if (sum >= 70) break;
        }

        System.out.println("Значение переменной number = " + number);
        System.out.println("Значение переменной sum = " + sum);
    }
}