package Lab2;
/**
 * Код для вычисления произведения целых чисел
 * от 14 до Nmax (2023)
 * Nmax=год+день+месяц рождения пользователя
 * Вычисления прерываются, когда произведение делится на 79 без остатка
 * @author P. A. Aliunina
 * @author Z. A. Vedrov
 *
 * @version 1
 */
public class BreakTest_SR {
    public static void main(String[] arg){
        //Самостоятельная работа

        int Nmax = 2001 + 20 + 12;
        int i = 14;

        //long - так как число при перемножении получится очень большое
        long pr = 1;

        while (i < Nmax) {
            pr *= i;
            i++;
            //выход из цикла если pr делится на 79 без остатка
            if (pr % 79 == 0) break;
        }
        System.out.println("Значение переменной pr = " + pr);
    }
}