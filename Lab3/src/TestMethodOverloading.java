/**
 * Перегрузка методов.
 * Имена методов одинаковые, различные сигнатуры,
 * количество параметров и их типы отличаются
 * на примере нахождения максимума и минимума
 *
 * @author Aliunina P.A.
 * @version 1
 */
public class TestMethodOverloading {
    public static void main(String[] args){
        //Вызов метода max с двумя int параметрами
        System.out.println("The maximum between 3 and 4 is " + max(3,5));
        //Вызов метода max с двумя double параметрами
        System.out.println("The maximum betwen 3.0 and 5.4 is " + max(3.0, 5.4));
        //Вызов метода max с int и double параметрами
        System.out.println("The maximum between 3 and 5.4 is " + max(3,5.4));
        //Вызов метода max с тремя double параметрами
        System.out.println("The maximum between 3.0, 5.4 and 10.14 is " + max(3.0,5.4,10.14));

        // Самостоятельная работа

        float min1;
        min1 = min((float)3.0,5);
        System.out.println("The minimum between 3.0, 5 is " + min1);
        min1 = min(7,4);
        System.out.println("The minimum between 7, 4 is " + min1);
        double a = 16.0;
        int b = 4;
        System.out.println("The sqrt 16 = " + TestSqrt.mySqrt((float)a));
        System.out.println("The sqrt 4 = " + TestSqrt.mySqrt(b));
    }
    public static int max(int num1, int num2){
        if (num1 > num2)
            return num1;
        else
            return num2;
    }
    public static double max(double num1, double num2){
        if (num1 > num2)
            return num1;
        else
            return num2;
    }
    public static double max(int num1, double num2){
        if (num1 > num2)
            return num1;
        else
            return num2;
    }
    public static double max(double num1, int num2){
        if (num1 > num2)
            return num1;
        else
            return num2;
    }
    public static double max(double num1, double num2, double num3){
        return max(max(num1, num2), num3);
    }
    public static double min(float num1, double num2){
        if (num1 < num2)
            return num1;
        else
            return num2;
    }
    public static float min(float num1, int num2){
        if (num1 < num2)
            return num1;
        else
            return num2;
    }
    public static float min(int num1, int num2){
        if (num1 < num2)
            return num1;
        else
            return num2;
    }
    public static double min(float num1, int num2, double num3){
        return min(min(num1, num2), num3);
    }
}
class TestSqrt{
    static double mySqrt(double num1){
        return Math.sqrt(num1);
    }
    static int mySqrt(int num1){
        return (int)Math.sqrt(num1);
    }
    static float mySqrt(float num1){
        return (float)Math.sqrt(num1);
    }
}