package Lab2;
/**
 *for - цикл на примерах
 *Example 2 - цикл контролируется по двум переменным!!!
 * @author P. A. Aliunina
 * @author Z. A. Vedrov
 *
 * @version 1
 */
public class ForLoopTest {
    public static void main(String[] args){
        // Example 1

        // Initialize sum
        float sum = 3;

        // Add 0.01, 0.02, ..., 0.99, 1 to sum
        for(float x = 0.1f; x <= 1.0f; x = x + 0.01f)
            sum +=x;

        // Display result
        System.out.println("The sum is " + sum);

        //Example 2

        //в примере контролируется цикл по двум переменным
        for(int i = 4, j = 8; (i+j < 15); i++, j++){
            System.out.println("\nТекущие значения i = " + i + "," + " j = " + j);
            System.out.println("\tСумма i + j = " + (i + j));
        }
    }
}