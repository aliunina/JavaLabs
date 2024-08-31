import java.util.Scanner;

/**
 * Самостоятельное задание, по решению квадратного уравнения
 * вида a*x^2+b*x+c = 0
 * Параметры a, b, c вводятся с консоли
 * Для корней используется массив
 * @author Aliunina P.A.
 * @author Vedrov Z.A.
 * @version 1
 */
public class QuadraticEquation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите a: ");
        double a = input.nextDouble();
        System.out.println("Введите b: ");
        double b = input.nextDouble();
        System.out.println("Введите c: ");
        double c = input.nextDouble();
        //Вычисление квадратного уравнения вида a*x^2+b*x+c = 0
        double[] result = sqrEquationClass.sqrDiscrimCheck(a,b,
                sqrEquationClass.sqrDiscrim(a, b, c));
        System.out.println("X1 = " + result[0] + ", X2 = " + result[1]);


    }
}
