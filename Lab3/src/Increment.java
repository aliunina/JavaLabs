import java.util.Scanner;
/**
 * Демонстрация передачи by value (по значению)
 *
 * @author Aliunina P.A.
 * @version 1
 */
public class Increment {
    public static void main(String[] args) {
        // Изменить в методе main идентификатор x на n
        int n = 1;
        System.out.println("Before the call, x is " + n);
        increment(n);
        System.out.println("after the call, x is " + n);

        Scanner input = new Scanner (System.in);
        System.out.print("/nВведите значение: ");
        n = input.nextInt();
        System.out.println("n до вызовы preIncrement " + n);
        preIncrement(n);
        System.out.println("n после вызовы preIncrement " + n);
    }
    public static void increment(int n) {
        n++;
        System.out.println("n inside the method is " + n);
    }
    // самостоятельное задание
    public static void preIncrement(int n){
        // Изменить постфиксную форму n++ на префиксную.
        ++n;
        System.out.println("Метод preIncrement ++n: " +n);

        // Изменить постфиксную форму n++ на выражение n = 3.
        n=3;
        System.out.println("метод preIncrement n = " + n);
    }
}