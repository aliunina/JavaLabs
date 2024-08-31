/**
 * Класс Triangle
 * @author P. A. ALiunina
 * @version 1.0
 */
public class Triangle extends Shape {
    private double base;
    private double height;

    /**
     * @return area:double
     */
    @Override
    public double getArea() {
        double area;
        area = (base * height) / 2;
        return area;
    }

    /**
     * str - object description
     * @return str:String
     */
    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
