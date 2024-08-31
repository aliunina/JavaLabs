package Lab1;
/**
 * shortcut operators: анализируем выполнение increment decrement
 * shortcut operators: += -= *= /= %=
 * анализируем разницу в префиксной и постфиксной форме
 * если эти операторы встречаются в выражениях
 * !!! для числовых переменных и типа char
 *
 * @author P. A. Aliunina
 * @author Z. A. Vedrov
 * @version 1.4
 */

public class ShortHandOperator {
    public static void main(String[] args) {
        int x = 8, y = 13;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("++x = " + ++x);
        System.out.println("y++ = " + y++);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        x = 3;
        y = 7;
        int z;
        z = ++x + y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = ++x + y = " + z);
        x = 3;
        y = 7;
        z = x++ + y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = x++ + y = " + z);
        // самостоятельно выполнить по аналогии для decrement
        x = 3;
        y = 7;
        z = x-- + y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = x-- + y = " + z);
        x = 3;
        y = 7;
        z = --x + y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = --x + y = " + z);
        // другие shorthand operators
        int i = 2, j = 4, k = 6, m = -3, n = 12;
        i += 8;
        j -= 2;
        k *= 4;
        m /= 3;
        n %= 2;
        System.out.println("i += 8 получаем " + i);
        System.out.println("j -= 2 получаем " + j);
        System.out.println("k *= 4 получаем " + k);
        System.out.println("m /= 3 получаем " + m);
        System.out.println("n %= 2 получаем " + n);
        System.out.println(Math.pow(2,3));
        System.out.println(Math.sin(2));
        // для переменных типа char
        char a = 'd';
        char b = 'D';
        System.out.println("a += 8 получаем " + (a += 8));
        System.out.println("b += 1 получаем " + (b += 1));
        x = 1;
        y = x++ + x;
        System.out.println(" ----- y = " + y);
        System.out.println('3' - '2' + 'm' / 'n');
        x = 10;
        y = 10;
        boolean zz = (y > 10) || (x++ > 10);
        System.out.println("|| x = " + x);
        System.out.println("-24/-5" + (-24 % -5));
        System.out.println("-24.2/-5.5" + (-24.2 % -5.5));
        System.out.println("'A' + 1 = " + ('A' + 1));
    }
}
