package Lab1;
/**
 * форматируем данные вывода для разных типов
 * спецификаторы вывода на консоль переменных разных типов
 * используется метод printf
 * %b - booleen (true false)
 * %c - char ('a')
 * %d - decimal integer (200)
 * %f - floating-point number (45.6723)
 * %e - scietific notation
 * %s - string
 * ширина поля вывода определяется цифрой
 * если символов меньше, заполняется пробелами
 *
 * @author P. A. Aliunina
 * @author Z. A. Vedrov
 * @version 1.3
 */
public class FormatOutput {
    public static void main(String [] args) {
        boolean ans = true;
        char letter = 'b';
        float sum = 45.4789f;
        System.out.printf("\nЭто пример 1 \n ans = %8b", ans);
        System.out.printf("\nЭто пример 2 \n letter = %4c", letter);
        System.out.printf("\nЭто пример 3 \n sum = %5.2f", sum);
        System.out.printf("\nЭто пример 4" + "\n ans = %8b \n letter = %4c \n sum = %5.2f", ans, letter, sum);
        // самостоятельно для оставшихся типов
        double disc = 2343462.90673498;
        String text = "Java vs C++";
        System.out.printf("\nЭто пример 5 \n disc = %f \n text = %s ", disc, text);
    }
}
