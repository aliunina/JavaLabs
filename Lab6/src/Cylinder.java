/**
 * класс Cylinder - является подклассом класса Circle
 * класс Circle использовался ранее
 *
 *  @author Aliunina P.A.
 *  @version 1.0
 */
public class Cylinder extends Circle {
    private double height; // Private member variable
    public Cylinder() { // constructor 1
        super(); // вызов конструктора суперкласса Circle()
        height = 2.1;
    }
    public Cylinder(double radius, double height) { // Constructor 2
        super(radius); // вызов конструктора суперкласса Circle(radius)
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    // Переопределяем метод getArea(), наследуемый у суперкласса Circle

    public double getArea() {
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
    }

    // необходимо внести изменения в метод как getVolume()
    public double getVolume() {
// используем метод getArea() суперкласса
        return super.getArea() * height;
    }
    // переопределяем метод toString(), наследуемый у суперкласса Circle

    public String toString() {
        return "Цилиндр: радиус = " + getRadius() + " высота = " + height;
    }
}

