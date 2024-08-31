package Lab2;
import java.util.Scanner;
/**
 * Код, для вычисления рейтинга по шкале
 * A>=90 баллов,80<=B<90; 70<=C<80; 60<=D<70
 * В других случаях F
 * Исходный балл задаётся в интервале целых от 0 до 100
 * Рейтинг представляется в символьной шкале A,B,C,D,F
 * @author P. A. Aliunina
 * @author Z. A. Vedrov
 * @version 1
 */
public class Rating {
        public static void main(String[] arg){

            //Создаем экземпляр класса для Scanner для ввода
            Scanner input = new Scanner(System.in);

            System.out.print("Введите рейтинг от 0 до 100 : ");
            int result = input.nextInt();

            if(result >= 90){
                System.out.println("Рейтинг А");
            } else if(result >= 80 && result < 90){
                System.out.println("Рейтинг B");
            } else if(result >= 70 && result < 80){
                System.out.println("Рейтинг C");
            } else if(result >= 60 && result < 70){
                System.out.println("Рейтинг D");
            } else{
                System.out.println("Рейтинг F");
            }
        }
    }
