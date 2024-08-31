package Lab2;
import java.util.Scanner;
/**
 *вычисление корней квадратного уравнения x1 и x2
 * параметры a,b,c задаются вводом с консоли
 * @author P. A. Aliunina
 * @author Z. A. Vedrov
 * @version 1
 */
public class MathClass {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("ax^2+bx+c=0");
        System.out.println("Введите коэффициент а");
        int a=input.nextInt();
        System.out.println("Введите коэффициент b");
        int b=input.nextInt();
        System.out.println("Введите коэффициент c");
        int c=input.nextInt();
        int D= (int) (Math.pow(b,2)-4*a*c);
        if(D<0){
            System.out.println("Корней нет");
        }
        else{
            System.out.println("Коэффициенты a="+a+" b="+b+" c="+c);
            double x1=(-b-Math.sqrt(D))/(2*a);
            System.out.println("x1= "+x1);
            double x2=(-b+Math.sqrt(D))/(2*a);
            System.out.println("x2= "+x2);
        }
    }
}