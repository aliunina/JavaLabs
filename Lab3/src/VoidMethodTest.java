import java.util.Scanner;
/**
 * Пример метода void (не возвращающего значение).
 * Это не метод main! Метод просто печатает рейтинг по набранному баллу.
 *
 * @author Aliunina P.A.
 * @version 1
 */
public class VoidMethodTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("The grade is ");
        printGrade(input.nextDouble());

        System.out.println("The grade is ");
        printGrade(input.nextDouble());
    }
    public static void printGrade(double score){
        if ((score <= 100) && (score >= 0 )){
            char result;
            if (score >= 90) result = 'A';
            else if ((score >= 80)) result = 'B';
            else if ((score >= 70)) result = 'C';
            else if ((score >= 60)) result = 'D';
            else result = 'F';
            System.out.println("Result mark: " + result);
        }
        else System.out.println("Ошибка! Неверно введенный балл!");
    }
}
