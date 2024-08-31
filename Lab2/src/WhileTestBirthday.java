package Lab2;
import java.util.Scanner;
/**
*Вычисляет сумму нечётных целых чисел от xMin до xMax
 * xMin и xMax: день(20) и месяц(12) вашего рождения
 * @author P. A. Aliunina
 * @author Z. A. Vedrov
 * @version 1
 */
public class WhileTestBirthday{
    public static void main(String[] arg){
        //Самостоятельная работа

        // Scanner object
        Scanner input = new Scanner(System.in);

        int sum = 0;

        System.out.print("Введите xMin = ");
        int xMin = input.nextInt();

        System.out.print("Введите xMax = ");
        int xMax = input.nextInt();

        while(xMin < xMax){

            if(xMin % 2 == 1)
                sum += xMin;

            xMin++;
        }
        System.out.println("Sum = " + sum);
    }
}