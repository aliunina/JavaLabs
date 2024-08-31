/**
 * Пример передачи параметров в метод
 * Самостоятельно написать код swapFlag, меняемого местами две переменные
 * при передаче третьей переменной, инициализированной TRUE
 *
 * @author Aliunina P.A.
 * @version 1
 */
public class TestPassByValue {
    public static void main(String[] args){
        //Объявляем и инициализируем переменные
        int num1 = 1;
        int num2 = 2;
        boolean num3 = true;
        System.out.println("Перед вызовом num1 = " + num1 + " num2 = " +num2);
        //Вызываем метод swap в попытке поменять местами две переменные
        swap(num1, num2);
        System.out.println("После вызова num1 = " + num1 + " num2 = " + num2);
        swapFlag(num1, num2, num3);
    }
    public static void swap(int n1, int n2){
        System.out.println("Внутри метода ");
        System.out.println("Перед перестановкой n1 = " + n1 + " num2 = " + n2);
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("После перестановки n1 = " + n1 + " n2 = " + n2);
    }
    //Самостоятельное задание
    public static void swapFlag(int n1, int n2, boolean n3){
        if (n3 == true) {
            System.out.println("Внутри метода flag");
            System.out.println("Перед перестановкой n1 = " + n1 + " n2 = " + n2);
            int temp = n1;
            n1 = n2;
            n2 = temp;
            System.out.println("После перестановки flag n1 = " + n1 + " n2 " + n2);
        } else {
            System.out.println("Параметр не равен true");
        }
    }
}
