package Lab2;
/**
 *while - оператор цикла
 *На примере вычисления суммы чисел от 0 до xMax
 * @author P. A. Aliunina
 * @author Z. A. Vedrov
 * @version 1
 */
public class WhileTest {
    public static void main(String[] args){
        int sum = 0;
        int i = 1;
        int xMax = 15;

        //цикл для просчета суммы от 0 до 15
        while (i < xMax){
            sum += i;
            i++;
        }
        System.out.println("Сумма чисел sum = " + sum);
        System.out.println("Последнее число i = " + i);
    }
}