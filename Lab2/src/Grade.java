package Lab2;
import java.util.Scanner;
/**
 *  Код, для вычисления рейтинга по шкале
 *  A>=90 баллов,80<=B<90; 70<=C<80; 60<=D<70
 *  В других случаях F
 *  Исходный балл задаётся в интервале целых от 0 до 100
 *  Рейтинг представляется в символьной шкале A,B,C,D,F
 * @author P. A. Aliunina
 * @author Z. A. Vedrov
 *
 * @version 1
 */
public class Grade {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Введите количество баллов");
        int b= input.nextInt();
        int ball = b/10;
        switch (ball){
            case 9:
                System.out.println("Ваш рейтинг A");
                break;
            case 8:
                System.out.println("Ваш рейтинг B");
                break;
            case 7:
                System.out.println("Ваш рейтинг C");
                break;
            case 6:
                System.out.println("Ваш рейтинг D");
                break;
            default:
                System.out.println("Ваш рейтинг F");
                break;
        }
    }
}