package Lab1;
import java.util.Scanner; // Scanner is in the java.util package
/**
 * Ввод данных с консоли
 * на примере вычисления длины окружности
 *
 * @author P. A. Aliunina
 * @author Z. A. Vedrov
 * @version 1.5
 *
 */
public class ConsoleInput {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter a radius
        System.out.print("Enter a number for radius: ");
        // Enter radius
        double radius = input.nextDouble();
        // Compute length
        double length = 2 * 3.14159 * radius;
        // Display result
        System.out.println("The length for the circle of radius " +
                radius + " is " + length);
    }
}
