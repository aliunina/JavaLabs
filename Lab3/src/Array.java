import java.util.Scanner;

/**
 * Демонстрация массивов
 * Самостоятельно задать массив из 10 до 30 элементов и инициализировать
 * Написать метод сортировки массива по возрастанию (убыванию)
 * Написать javadoc комментарий к методу
 *
 * @author Aliunina P.A.
 * @version 1
 */
public class Array {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int quantity;
        do {
            System.out.println("Enter elements quantity of array between 10 and 30");
            quantity = input.nextInt();
        } while (quantity > 30 || quantity < 10);
        int array [] = new int[quantity];
        for (int i = 0; i < array.length; i++){
            array [i] = (int)(Math.random()*100);
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        arrayBubbleSort.arrayBubbleSortUp(array);
        arrayBubbleSort.printArray(array);
        arrayBubbleSort.arrayBubbleSortDown(array);
        arrayBubbleSort.printArray(array);
    }
}
