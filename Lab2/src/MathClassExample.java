package Lab2;
import java.util.Scanner;
/**
 * Вычисление арифметических выражений с использованием
 * примера выражения y = a*a*sin(x) - b*exp(-a)
 *
 * @author P. A. Aliunina
 * @author Z. A. Vedrov
 * @version 1
 */
public class MathClassExample {
    public static void main(String[] args){
        int a = 3;
        double b = 34.789;
        double x  = 12.3;

        double y = Math.pow(a, 2)*Math.sin(x)-b*Math.exp(-a);
        y = Math.sqrt(Math.abs(y));
        System.out.println("y = "+ y);
    }
}