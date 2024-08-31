/**
 * Класс Circle, включающий радиус окружности, цвет, и вычисление площади и
 * длины окружности
 *
 *  @author Aliunina P.A.
 *  @version 1.0
 */
public class Circle {
    private double radius;
    private String color;
    /**
     * Constructors (перегруженные)
     */
    public Circle() {//1й
        radius = 5.0;
        color = "Red";
    }
    public Circle(double r) {//2й
        radius = r;
        color = "Blue";
    }
    public Circle(double r, String c) {//3й
        radius = r;
        color = c;
    }
    //Public methods
    public double getRadius() {
        return radius;
    }
    //Получение цвета методом
    public String getColor() {
        return color;
    }
    //Получение площади окружности
    public double getArea() {

        return radius * radius * Math.PI;
    }
    //самостоятельная работа

    public double getLenght() {    //Получение длины окружности
        return 2 * Math.PI * radius;
    }
    //Задание цвета и радиуса методом
    public void setColorRadius(String c, double r) {
        this.color = c;
        this.radius = r;

    }

    public class TestCircle {
        Circle krug = new Circle(); //1st constructor
        Circle krug1 = new Circle(12);//2nd Constructor
        Circle krug2 = new Circle(2, "Blue");//3rd Constructor

    }

    public static void main(String[] args) {
        Circle krug = new Circle(22.11, "Red");

        System.out.println("1== " + krug.getColor() + " " + krug.getRadius());
        krug = new Circle(44.55);

        System.out.println("2== " + krug.getColor() + " " + krug.getRadius());

        krug = new Circle();
        System.out.println("3== " + krug.getColor() + " " + krug.getRadius());

        System.out.println("4== " + krug.getColor() + " " + krug.getRadius() + " " + krug.getArea() + " " + krug.getLenght());
    }
}
