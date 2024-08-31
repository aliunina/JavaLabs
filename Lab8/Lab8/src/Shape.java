/**
 * Класс Shape
 * @author P. A. ALiunina
 * @version 1.0
 */
public class Shape {
    private String color;

    //Overloading example
    public Shape() {
        color = "TEST";
    }

    public Shape(String color) {
        this.color = color;
    }

    public double getArea(){
        double area;
        area = 0;
        return area;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
