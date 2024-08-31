/**
 * Класс Rectangle
 * @author P. A. ALiunina
 * @version 1.0
 */
public class Rectangle extends Shape {
    private double length;
    private double width;

    /**
     *
     * @return area:double
     */
    @Override
    public double getArea() {
        double area;
        area = length * width;
        return area;
    }

    /**
     * str - object description
     * @return str:String
     */
    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
