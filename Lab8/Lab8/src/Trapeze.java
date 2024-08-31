/**
 * Класс Trapeze
 * @author P. A. ALiunina
 * @version 1.0
 */
public class Trapeze extends Shape {
    private double lowBase;
    private double highBase;
    private double height;

    /**
     * @return area:double
     */
    @Override
    public double getArea() {
        double area;
        area = (lowBase + highBase) / 2 * height;
        return area;
    }

    /**
     * str - object description
     * @return str:String
     */
    @Override
    public String toString() {
        return "Trapeze{" +
                "lowBase=" + lowBase +
                ", highBase=" + highBase +
                ", height=" + height +
                '}';
    }

    public double getLowBase() {
        return lowBase;
    }

    public void setLowBase(double lowBase) {
        this.lowBase = lowBase;
    }

    public double getHighBase() {
        return highBase;
    }

    public void setHighBase(double highBase) {
        this.highBase = highBase;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
