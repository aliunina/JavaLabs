import java.util.Scanner;

/**
 * Класс Circle, включающий радиус окружности, цвет, и вычисление площади и
 * длины окружности
 * @author P.A. Aliunina
 * @version 1
 */

public class Circle {
    // Private variables
    private double radius;
    private String color;

    //Constructors (Перегруженные)
    /**
     * Конструктор Circle по умолчанию
     */
    public Circle(){
        radius = 1.0;
        color = "red";
    }
    /**
     * Конструктор Circle с одним входным параметром
     * @param r диаметр окружности
     */
    public Circle(double r){
        radius = r;
        color = "red";
    }
    /**
     * Конструктор Circle с двумя входными параметрами
     * @param r диаметр окружности
     * @param c цвет окружности
     */
    public  Circle(double r, String c){
        radius = r;
        color = c;
    }
    /**
     * Конструктор Circle с двумя входными параметрами
     * @param r диаметр окружности (входное значение имеет тип float)
     * @param c цвет окружности
     */
    public  Circle(float r, String c){
        radius = r;
        color = c;
    }
    /**
     * Метод для возврата радиуса окружности
     * @return радиус окружности
     */
    public double getRadius(){
        return  radius;
    }
    /**
     * Метод для возврата цвета окружности
     * @return Радиус окружности
     */
    public String getColor(){
        return color;
    }
    /**
     * Медот для вычисления площади окружности
     * @return площадь окружности
     */
    public double getArea(){
        return radius * radius * Math.PI;
    }
    /**
     * Метод для возврата длины окружности
     * @return длина окружности
     */
    public double getCircleLength(){
        return (radius + radius) * Math.PI;
    }
    /**
     * Метод для установки значения раудиуса окружности
     * @param r входное значение радиуса окружности
     */
    public void setRadius(double r){
        radius = r;
    }
    /**
     * Метод для установки значения цвета окружности
     * @param c входное значение цвета
     */
    public void setColor(String c) {
        color = c;
    }

    public static int field;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Введите радиус: ");
        double r = input.nextDouble();
        System.out.print("Введите цвет: ");
        String c = input.next();

        //Вызов конструктора Circle с двумя входящими параметрами
        Circle mycircle1 = new Circle(r, c);
        //Проверка данных
        System.out.println("Введенный радиус: " + mycircle1.getRadius());
        System.out.println("Введенный цвет: " + mycircle1.getColor());
        System.out.println("Площадь круга: " + mycircle1.getArea());
        System.out.println("Длина окружности: " + mycircle1.getCircleLength());

        //Вызов конструктор Circle по умолчанию
        Circle mycircle2 = new Circle();
        //Проверка данных
        System.out.println("\nВведенный радиус: " + mycircle1.getRadius());
        System.out.println("Введенный цвет: " + mycircle1.getColor());
        System.out.println("Площадь круга: " + mycircle1.getArea());
        System.out.println("Длина окружности: " + mycircle1.getCircleLength());

        //Установка новых значений для объекта mycircle2
        System.out.print("\nВведите радиус: ");
        mycircle2.setRadius(input.nextDouble());
        System.out.print("Введите цвет: ");
        mycircle2.setColor(input.next());
        //Проверка данных
        System.out.println("\nВведенный радиус: " + mycircle2.getRadius());
        System.out.println("Введенный цвет: " + mycircle2.getColor());
        System.out.println("Площадь круга: " + mycircle2.getArea());
        System.out.println("Длина окружности: " + mycircle2.getCircleLength());
    }
}
