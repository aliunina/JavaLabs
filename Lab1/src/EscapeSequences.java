package Lab1;
/**
 * форматирование вывода
 * работа с EscapeSequences
 * \b backspace
 * \t Tab
 * \n Linefeed
 * \f Formfeed
 * \r Carriage Return
 * \\ Backslash
 * \' single Quate
 * \" Double Quate *
 *
 * @author P. A. Aliunina
 * @author Z. A. Vedrov
 * @version 1.2
 */
public class EscapeSequences {
    public static void main(String[] args) {
        // Prompt the user for input
        System.out.println("\t Hellow \"Java\"");
        System.out.print("\n\t Hellow \'Java\'");
        System.out.print("\b My name is \'Полина\'");
        System.out.print("\n\\ This is only work \\");
    }
}
